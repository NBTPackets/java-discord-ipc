package github.com.nbtpackets.connection.packet.opcode;

import github.com.nbtpackets.connection.packet.S2CPacket;
import github.com.nbtpackets.connection.packet.impl.RawPacket;
import github.com.nbtpackets.connection.packet.impl.s2c.CloseConnectionPacket;
import github.com.nbtpackets.connection.packet.impl.s2c.DispatchPacket;
import github.com.nbtpackets.connection.packet.impl.s2c.ErrorPacket;
import com.google.gson.JsonObject;
import lombok.AllArgsConstructor;

import java.util.function.Function;

@AllArgsConstructor
public enum Opcode {
    Handshake(jsonObject -> {
        throw new UnsupportedOperationException("Cannot create C2S packet from json.");
    }),
    Frame(jsonObject -> {
        if (DispatchPacket.is(jsonObject))
            return new DispatchPacket(jsonObject);

        if (ErrorPacket.is(jsonObject))
            return new ErrorPacket(jsonObject);

        throw new UnsupportedOperationException("Cannot create C2S packet from json.");
    }),
    Close(jsonObject ->
            new CloseConnectionPacket(jsonObject.get("code").getAsInt(), jsonObject.get("message").getAsString())
    ),
    Ping(jsonObject -> new RawPacket()),
    Pong(jsonObject -> new RawPacket());

    public final Function<JsonObject, S2CPacket> toPacketFunction;

    private static final Opcode[] VALUES = values();

    public static Opcode valueOf(int i) {
        return VALUES[i];
    }
}

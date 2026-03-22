package github.com.nbtpackets.connection.packet.impl.s2c;

import github.com.nbtpackets.connection.packet.S2CPacket;
import github.com.nbtpackets.connection.packet.opcode.Opcode;
import com.google.gson.JsonObject;

public record ErrorPacket(int code, String message) implements S2CPacket {

    public ErrorPacket(JsonObject jsonObject) {
        this(
                jsonObject.getAsJsonObject("data").get("code").getAsInt(),
                jsonObject.getAsJsonObject("data").get("message").getAsString()
        );
    }

    @Override
    public Opcode getOpcode() {
        return Opcode.Frame;
    }

    public static boolean is(JsonObject jsonObject) {
        return jsonObject.has("evt") && jsonObject.get("evt").getAsString().equals("ERROR");
    }
}

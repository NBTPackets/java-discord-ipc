package github.com.nbtpackets.connection.packet.impl.c2s;

import github.com.nbtpackets.connection.packet.C2SPacket;
import github.com.nbtpackets.connection.packet.opcode.Opcode;
import com.google.gson.JsonObject;

public class HandsnakePacket implements C2SPacket {
    private final long appId;
    private final int version;

    public HandsnakePacket(long appId, int version) {
        this.appId = appId;
        this.version = version;
    }

    @Override
    public Opcode getOpcode() {
        return Opcode.Handshake;
    }

    @Override
    public JsonObject toJson() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("v", this.version);
        jsonObject.addProperty("client_id", Long.toString(this.appId));

        return jsonObject;
    }
}

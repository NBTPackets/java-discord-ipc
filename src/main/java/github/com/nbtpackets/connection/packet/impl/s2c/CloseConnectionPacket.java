package github.com.nbtpackets.connection.packet.impl.s2c;

import github.com.nbtpackets.connection.packet.S2CPacket;
import github.com.nbtpackets.connection.packet.opcode.Opcode;

public record CloseConnectionPacket(int code, String message) implements S2CPacket {

    @Override
    public Opcode getOpcode() {
        return Opcode.Close;
    }
}

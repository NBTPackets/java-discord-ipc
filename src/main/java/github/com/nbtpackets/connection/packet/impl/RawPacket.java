package github.com.nbtpackets.connection.packet.impl;

import github.com.nbtpackets.connection.packet.S2CPacket;
import github.com.nbtpackets.connection.packet.opcode.Opcode;

public class RawPacket implements S2CPacket {

    @Override
    public Opcode getOpcode() {
        return null;
    }
}

package github.com.nbtpackets.connection.packet;

import github.com.nbtpackets.connection.packet.opcode.Opcode;

public interface Packet {

    Opcode getOpcode();
}

package github.com.nbtpackets;

import java.io.InputStream;

public record UserAvatar(InputStream inputStream, AvatarType avatarType) {
}

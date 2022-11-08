package xyz.szambo.blocks.utils;

import org.bukkit.ChatColor;

public class ChatUtil {

    public static String fixColor(String message) {
        return message == null ? "" : ChatColor.translateAlternateColorCodes('&', message).replace(">>", "»").replace("<<", "«");
    }
}

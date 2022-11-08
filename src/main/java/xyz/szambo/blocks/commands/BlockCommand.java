package xyz.szambo.blocks.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import xyz.szambo.blocks.menus.BlocksMenu;

public class BlockCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player p = (Player) sender;
        p.openInventory(BlocksMenu.blocks());
        return false;
    }
}

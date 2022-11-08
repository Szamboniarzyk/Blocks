package xyz.szambo.blocks.utils;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import xyz.szambo.blocks.ConfigManager.ConfigManager;
import xyz.szambo.blocks.Main;

public class ReplaceUtil {
    public static void replacer(Player p, Material item, Material block) {
        if (p.getInventory().containsAtLeast(new ItemStack(item), 9)) {
            Boolean b = null;

            for(int x = 0; x < 256; ++x) {
                if (!p.getInventory().containsAtLeast(new ItemStack(item), 9)) {
                    if (b) {
                        p.closeInventory();
                        p.sendTitle(ConfigManager.prefix, ChatUtil.fixColor(Main.instance.getConfig().getString("messages.replaced")));
                    }

                    return;
                }

                p.getInventory().removeItem(new ItemStack[]{new ItemStack(item, 9)});
                p.getInventory().addItem(new ItemStack[]{new ItemStack(block)});
                b = true;
            }

        } else {
            p.closeInventory();
            p.sendTitle(ConfigManager.prefix, ChatUtil.fixColor(Main.instance.getConfig().getString("messages.no-items")));
        }
    }

    }

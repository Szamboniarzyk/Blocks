package xyz.szambo.blocks.utils;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import xyz.szambo.blocks.ConfigManager.ConfigManager;
import xyz.szambo.blocks.Main;

public class ChangeUtil {
    public static void Change(Player player, Material ingot, Material block) {
        Inventory inventory = player.getInventory();
        ItemStack[] content = inventory.getContents();
        ItemStack mat = new ItemStack(ingot);
        int size = inventory.getSize();
        int amount = 0;

        int modulo;
        for(modulo = 0; modulo < size; ++modulo) {
            ItemStack is = inventory.getItem(modulo);
            if (is != null && is.getType().equals(ingot)) {
                amount += is.getAmount();
            }
        }

        modulo = amount % 9;
        int times = amount / 9;
        int freeSlots = 0;

        int i;
        for(i = 0; i < size; ++i) {
            if (inventory.getItem(i) == null) {
                ++freeSlots;
            }
        }

        if (freeSlots < times / 64) {
            player.closeInventory();
            player.sendMessage(ConfigManager.prefix + ChatUtil.fixColor(Main.instance.getConfig().getString("messages.full-eq")));
        } else {
            if (amount >= 9) {
                for(i = 0; i < size; ++i) {
                    if (inventory.getItem(i) != null && inventory.getItem(i).getType().equals(ingot)) {
                        inventory.removeItem(new ItemStack[]{inventory.getItem(i)});
                    }
                }

                for(i = 0; i < modulo; ++i) {
                    inventory.addItem(new ItemStack[]{mat});
                }

                boolean refund = false;

                for(int b = 0; b < times; ++b) {
                    inventory.addItem(new ItemStack[]{new ItemStack(block)});
                }
            }

        }
    }


    public static void ChangeAll(Player player) {
        ReplaceUtil.replacer(player, Material.NETHERITE_INGOT, Material.NETHERITE_BLOCK);
        ReplaceUtil.replacer(player, Material.EMERALD, Material.EMERALD_BLOCK);
        ReplaceUtil.replacer(player, Material.DIAMOND, Material.DIAMOND_BLOCK);
        ReplaceUtil.replacer(player, Material.GOLD_INGOT, Material.GOLD_BLOCK);
        ReplaceUtil.replacer(player, Material.IRON_INGOT, Material.IRON_BLOCK);
    }

}

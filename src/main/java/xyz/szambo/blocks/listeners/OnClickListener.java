package xyz.szambo.blocks.listeners;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import xyz.szambo.blocks.ConfigManager.ConfigManager;
import xyz.szambo.blocks.Main;
import xyz.szambo.blocks.utils.ChangeUtil;
import xyz.szambo.blocks.utils.ChatUtil;

public class OnClickListener implements Listener {

    @EventHandler
    public void onClick(InventoryClickEvent e) {

        Player p = (Player) e.getWhoClicked();
        if (e.getView().getTitle().equalsIgnoreCase(ChatUtil.fixColor(Main.instance.getConfig().getString("gui.title")))) {
            if (e.getCurrentItem() != null) {
                e.setCancelled(true);
            }
            if (e.getCurrentItem().getType().equals(Material.valueOf(Main.instance.getConfig().getString("gui.netherite.material")))) {
                if (p.getInventory().contains(Material.NETHERITE_INGOT, 9)) {
                    ChangeUtil.Change(p, Material.NETHERITE_INGOT, Material.NETHERITE_BLOCK);
                    p.closeInventory();
                    p.sendTitle(ConfigManager.prefix, ChatUtil.fixColor(Main.instance.getConfig().getString("messages.replaced")));
                } else {
                    p.closeInventory();
                    p.sendTitle(ConfigManager.prefix, ChatUtil.fixColor(Main.instance.getConfig().getString("messages.no-items")));
                }
            }
            if (e.getCurrentItem().getType().equals(Material.valueOf(Main.instance.getConfig().getString("gui.emerald.material")))) {
                if (p.getInventory().contains(Material.EMERALD, 9)) {
                    ChangeUtil.Change(p, Material.EMERALD, Material.EMERALD_BLOCK);
                    p.closeInventory();
                    p.sendTitle(ConfigManager.prefix, ChatUtil.fixColor(Main.instance.getConfig().getString("messages.replaced")));
                } else {
                    p.closeInventory();
                    p.sendTitle(ConfigManager.prefix, ChatUtil.fixColor(Main.instance.getConfig().getString("messages.no-items")));
                }
            }
            if (e.getCurrentItem().getType().equals(Material.valueOf(Main.instance.getConfig().getString("gui.diamond.material")))) {
                if (p.getInventory().contains(Material.DIAMOND, 9)) {
                ChangeUtil.Change(p, Material.DIAMOND, Material.DIAMOND_BLOCK);
                    p.closeInventory();
                    p.sendTitle(ConfigManager.prefix, ChatUtil.fixColor(Main.instance.getConfig().getString("messages.replaced")));
                } else {
                    p.closeInventory();
                    p.sendTitle(ConfigManager.prefix, ChatUtil.fixColor(Main.instance.getConfig().getString("messages.no-items")));
                }
            }
            if (e.getCurrentItem().getType().equals(Material.valueOf(Main.instance.getConfig().getString("gui.gold.material")))) {
                if (p.getInventory().contains(Material.GOLD_INGOT, 9)) {
                    ChangeUtil.Change(p, Material.GOLD_INGOT, Material.GOLD_BLOCK);
                    p.closeInventory();
                    p.sendTitle(ConfigManager.prefix, ChatUtil.fixColor(Main.instance.getConfig().getString("messages.replaced")));
                } else {
                    p.closeInventory();
                    p.sendTitle(ConfigManager.prefix, ChatUtil.fixColor(Main.instance.getConfig().getString("messages.no-items")));
                }
            }
            if (e.getCurrentItem().getType().equals(Material.valueOf(Main.instance.getConfig().getString("gui.iron.material")))) {
                if (p.getInventory().contains(Material.IRON_INGOT, 9)) {
                    ChangeUtil.Change(p, Material.IRON_INGOT, Material.IRON_BLOCK);
                    p.closeInventory();
                    p.sendTitle(ConfigManager.prefix, ChatUtil.fixColor(Main.instance.getConfig().getString("messages.replaced")));
                } else {
                    p.closeInventory();
                    p.sendTitle(ConfigManager.prefix, ChatUtil.fixColor(Main.instance.getConfig().getString("messages.no-items")));
                }
            }
            if (e.getCurrentItem().getType().equals(Material.valueOf(Main.instance.getConfig().getString("gui.replace-all.material")))) {
                    ChangeUtil.ChangeAll(p);
                    p.closeInventory();
                    p.sendTitle(ConfigManager.prefix, ChatUtil.fixColor(Main.instance.getConfig().getString("messages.replaced")));
            }
        }
    }
}

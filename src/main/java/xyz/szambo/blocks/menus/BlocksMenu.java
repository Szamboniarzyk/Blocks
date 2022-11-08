package xyz.szambo.blocks.menus;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import xyz.szambo.blocks.Main;
import xyz.szambo.blocks.utils.ChangeUtil;
import xyz.szambo.blocks.utils.ChatUtil;

import java.util.ArrayList;
import java.util.List;

public class BlocksMenu {

    public static Inventory blocks() {
        Inventory inventory = Bukkit.createInventory((InventoryHolder)null, (Main.instance.getConfig().getInt("gui.rows") * 9), ChatUtil.fixColor(Main.instance.getConfig().getString("gui.title")));
        ItemStack filler = new ItemStack(Material.valueOf(Main.instance.getConfig().getString("gui.filler-material")));
        ItemMeta meta = filler.getItemMeta();
        //
        // Netherite Itemstack
        //
        ItemStack netherite = new ItemStack(Material.valueOf(Main.instance.getConfig().getString("gui.netherite.material")));
        ItemMeta meta1 = netherite.getItemMeta();
        meta1.setDisplayName(ChatUtil.fixColor(Main.instance.getConfig().getString("gui.netherite.title")));
        List<String> list = new ArrayList();
        for(String s : Main.instance.getConfig().getStringList("gui.netherite.lore")) {
            list.add(ChatUtil.fixColor(s));
            meta1.setLore(list);
            netherite.setItemMeta(meta1);

        }

        //
        // Emerald Itemstack
        //
        ItemStack emerald = new ItemStack(Material.valueOf(Main.instance.getConfig().getString("gui.emerald.material")));
        ItemMeta meta2 = emerald.getItemMeta();
        meta2.setDisplayName(ChatUtil.fixColor(Main.instance.getConfig().getString("gui.emerald.title")));
        List<String> list1 = new ArrayList();
        for(String s1 : Main.instance.getConfig().getStringList("gui.emerald.lore")) {
            list1.add(ChatUtil.fixColor(s1));
            meta2.setLore(list1);
            emerald.setItemMeta(meta2);
        }
        //
        // Diamond Itemstack
        //
        ItemStack diamond = new ItemStack(Material.valueOf(Main.instance.getConfig().getString("gui.diamond.material")));
        ItemMeta meta3 = diamond.getItemMeta();
        meta3.setDisplayName(ChatUtil.fixColor(Main.instance.getConfig().getString("gui.diamond.title")));
        List<String> list2 = new ArrayList();
        for(String s2 : Main.instance.getConfig().getStringList("gui.diamond.lore")) {
            list2.add(ChatUtil.fixColor(s2));
            meta3.setLore(list2);
            diamond.setItemMeta(meta3);
        }
        //
        // Gold Itemstack
        //
        ItemStack gold = new ItemStack(Material.valueOf(Main.instance.getConfig().getString("gui.gold.material")));
        ItemMeta meta4 = gold.getItemMeta();
        meta4.setDisplayName(ChatUtil.fixColor(Main.instance.getConfig().getString("gui.gold.title")));
        List<String> list3 = new ArrayList();
        for(String s3 : Main.instance.getConfig().getStringList("gui.gold.lore")) {
            list3.add(ChatUtil.fixColor(s3));
            meta4.setLore(list3);
            gold.setItemMeta(meta4);
        }
        //
        // Iron Itemstack
        //
        ItemStack iron = new ItemStack(Material.valueOf(Main.instance.getConfig().getString("gui.iron.material")));
        ItemMeta meta5 = iron.getItemMeta();
        meta5.setDisplayName(ChatUtil.fixColor(Main.instance.getConfig().getString("gui.iron.title")));
        List<String> list4 = new ArrayList();
        for(String s4 : Main.instance.getConfig().getStringList("gui.iron.lore")) {
            list4.add(ChatUtil.fixColor(s4));
            meta5.setLore(list4);
            iron.setItemMeta(meta5);
        }
        //
        // Replace all Itemstack
        //
        ItemStack all = new ItemStack(Material.valueOf(Main.instance.getConfig().getString("gui.replace-all.material")));
        ItemMeta meta6 = all.getItemMeta();
        meta6.setDisplayName(ChatUtil.fixColor(Main.instance.getConfig().getString("gui.replace-all.title")));
        List<String> list5 = new ArrayList();
        for(String s5 : Main.instance.getConfig().getStringList("gui.replace-all.lore")) {
            list5.add(ChatUtil.fixColor(s5));
            meta6.setLore(list5);
            all.setItemMeta(meta6);
        }
        for (int i = 0; i < (Main.instance.getConfig().getInt("gui.rows") * 9); i++) {
            inventory.setItem(i, filler);
        }
        if (Main.instance.getConfig().getBoolean("gui.materials.netherite") == true) {
            inventory.setItem(Main.instance.getConfig().getInt("gui.netherite.slot"), netherite);
        }
        if (Main.instance.getConfig().getBoolean("gui.materials.emerald") == true) {
            inventory.setItem(Main.instance.getConfig().getInt("gui.emerald.slot"), emerald);
        }
        if (Main.instance.getConfig().getBoolean("gui.materials.diamond") == true) {
            inventory.setItem(Main.instance.getConfig().getInt("gui.diamond.slot"), diamond);
        }
        if (Main.instance.getConfig().getBoolean("gui.materials.gold") == true) {
            inventory.setItem(Main.instance.getConfig().getInt("gui.gold.slot"), gold);
        }
        if (Main.instance.getConfig().getBoolean("gui.materials.iron") == true) {
            inventory.setItem(Main.instance.getConfig().getInt("gui.iron.slot"), iron);
        }
        if (Main.instance.getConfig().getBoolean("gui.materials.replace-all") == true) {
            inventory.setItem(Main.instance.getConfig().getInt("gui.replace-all.slot"), all);
        }
      return inventory;

    }
}

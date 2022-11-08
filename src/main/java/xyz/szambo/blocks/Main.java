package xyz.szambo.blocks;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import xyz.szambo.blocks.commands.BlockCommand;
import xyz.szambo.blocks.listeners.OnClickListener;

public final class Main extends JavaPlugin {

    public static Plugin instance;
    @Override
    public void onEnable() {

        System.out.println("Thanks for download the plugin ^^");
        instance = this;
        instance.saveDefaultConfig();
        getCommand("blocks").setExecutor(new BlockCommand());
        getServer().getPluginManager().registerEvents(new OnClickListener(), this);


    }
}

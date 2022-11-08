package xyz.szambo.blocks.ConfigManager;

import eu.okaeri.configs.OkaeriConfig;
import eu.okaeri.configs.annotation.Comment;
import eu.okaeri.configs.annotation.NameModifier;
import eu.okaeri.configs.annotation.NameStrategy;
import eu.okaeri.configs.annotation.Names;
import xyz.szambo.blocks.Main;
import xyz.szambo.blocks.utils.ChatUtil;

@Names(strategy = NameStrategy.HYPHEN_CASE, modifier = NameModifier.TO_LOWER_CASE)
public class ConfigManager extends OkaeriConfig {
    @Comment("Main prefix of plugin - this prefix is not title of gui")
    public static String prefix = ChatUtil.fixColor(Main.instance.getConfig().getString("prefix"));


}



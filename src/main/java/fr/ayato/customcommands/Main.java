package fr.ayato.customcommands;

import fr.ayato.customcommands.commands.Discord;
import fr.ayato.customcommands.commands.Reglement;
import fr.ayato.customcommands.commands.Site;
import fr.ayato.customcommands.commands.Vote;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Collections;

public class Main extends JavaPlugin {

    public static Main getInstance() {
        return JavaPlugin.getPlugin(Main.class);
    }

    @Override
    public void onEnable() {
        System.out.println("--------------------");
        System.out.println(ChatColor.AQUA + "CustomCommands initialized !");
        System.out.println("--------------------");
        saveDefaultConfig();

        getCommand("discord").setExecutor(new Discord());
        getCommand("site").setExecutor(new Site());
        getCommand("reglement").setExecutor(new Reglement());
        getCommand("vote").setExecutor(new Vote());
        getCommand("cashprize").setExecutor(new CashPrize());
        getCommand("cashprize").setAliases(Collections.singletonList("cp"));
    }

    @Override
    public void onDisable() {
        System.out.println("--------------------");
        System.out.println(ChatColor.AQUA + "CustomCommands disabled !");
        System.out.println("--------------------");
    }
}

package fr.ayato.customcommands.utils;

import fr.ayato.customcommands.Main;

import java.util.List;

public class Config {

    public static String getDiscordUrl() {
        return Main.getInstance().getConfig().getString("discord.url");
    }

    public static List<String> getDiscordMessage() {
        return Main.getInstance().getConfig().getStringList("discord.message");
    }

    public static String getReglementUrl() {
        return Main.getInstance().getConfig().getString("reglement.url");
    }

    public static List<String> getReglementMessage() {
        return Main.getInstance().getConfig().getStringList("reglement.message");
    }

    public static String getVoteUrl() {
        return Main.getInstance().getConfig().getString("vote.url");
    }

    public static List<String> getVoteMessage() {
        return Main.getInstance().getConfig().getStringList("vote.message");
    }

    public static String getSiteUrl() {
        return Main.getInstance().getConfig().getString("site.url");
    }

    public static List<String> getSiteMessage() {
        return Main.getInstance().getConfig().getStringList("site.message");
    }

    public static String getCashPrizeUrl() {
        return Main.getInstance().getConfig().getString("cashprize.url");
    }

    public static List<String> getCashPrizeMessage() {
        return Main.getInstance().getConfig().getStringList("cashprize.message");
    }

}

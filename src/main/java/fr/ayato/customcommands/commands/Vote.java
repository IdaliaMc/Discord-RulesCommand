package fr.ayato.customcommands.commands;

import fr.ayato.customcommands.utils.Config;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.List;

public class Vote implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        Player player = (Player) commandSender;
        String url = Config.getVoteUrl();
        List<String> message = Config.getVoteMessage();
        for (String msg : message) {
            if (msg.contains("%url%")) {
                msg = msg.replace("%url%", url);
            }
            player.sendMessage(msg);
        }
        return false;
    }
}

package fr.ayato.customcommands;

import fr.ayato.customcommands.utils.Config;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.List;

public class CashPrize implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        Player player = (Player) commandSender;
        String url = Config.getCashPrizeUrl();
        List<String> message = Config.getCashPrizeMessage();
        for (String msg : message) {
            if (msg.contains("%url%")) {
                msg = msg.replace("%url%", url);
            }
            player.sendMessage(msg);
        }
        return false;
    }
}

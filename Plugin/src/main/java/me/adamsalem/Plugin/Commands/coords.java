package me.adamsalem.Plugin.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static org.bukkit.Bukkit.getPlayer;

public class coords implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player player && label.equalsIgnoreCase("coords")) {
                player.sendMessage("X: " + player.getLocation().getX() +
                        " Y: " + player.getLocation().getY()
                        + "  " +
                        " Z: " + player.getLocation().getZ());
        }
        return true;
    }


}

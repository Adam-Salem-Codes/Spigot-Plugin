package me.adamsalem.Plugin.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static org.bukkit.Bukkit.getServer;

public class getCoords implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player player && label.equalsIgnoreCase("getcoords")) {
            for (Player p : getServer().getOnlinePlayers()) {
                if (p.getName().equals(args[0])) {

                    player.sendMessage(ChatColor.GOLD + "Currently Online Players: " + "" + getServer().getOnlinePlayers().size() + "/120");
                    double[] coords = {
                            getServer().getPlayer(args[0]).getLocation().getX(),
                            getServer().getPlayer(args[0]).getLocation().getY(),
                            getServer().getPlayer(args[0]).getLocation().getZ()
                    };

                    player.sendMessage(ChatColor.RED + "X: " + coords[0] + "" + ChatColor.GREEN + " \nY: " + coords[1] + "" + ChatColor.BLUE + " \nZ: " + coords[2]);
                }
            }
        }
        return true;
    }
}



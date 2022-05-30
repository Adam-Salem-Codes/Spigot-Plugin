package me.adamsalem.Plugin.listeners;

import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.entity.Monster;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;

public class ProjectileHitListener implements Listener {

    @EventHandler
    public void onProjectileHit(ProjectileHitEvent e){
        if(!(e.getEntity().getShooter() instanceof Player)){return;}

        Player p = (Player) e.getEntity().getShooter();

        if(e.getHitEntity() instanceof Block){
            p.sendMessage(ChatColor.RED + "Arrow hit block X: " + e.getHitBlock().getLocation().getX() + "" + ChatColor.GREEN +
                    " \nArrow hit block Y: " + e.getHitBlock().getLocation().getY() +
                    "" + ChatColor.BLUE + " \nArrow hit block Z: " + e.getHitBlock().getLocation().getZ() + "\n\n\n\n"
            );
        }
        else if(e.getHitEntity() instanceof Player){
            p.sendMessage( "You hit: " + ( (Player) e.getHitEntity()).getPlayer().getName() );
            p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
        } else if (e.getHitEntity() instanceof Monster) {
            p.sendMessage("You hit a: " + e.getHitEntity().getName());
            p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);

        }


    }

}

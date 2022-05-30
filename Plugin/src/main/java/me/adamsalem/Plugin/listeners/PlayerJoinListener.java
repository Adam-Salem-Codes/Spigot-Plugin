package me.adamsalem.Plugin.listeners;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;

public class PlayerJoinListener implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        event.getPlayer().sendTitle(ChatColor.GREEN + "" + ChatColor.BOLD + "Thank you for joining the Server!", ":)", 45, 100, 10);
        event.getPlayer().playSound(event.getPlayer().getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);

        ItemStack tpbow = new ItemStack(Material.BOW);
        tpbow.addEnchantment(Enchantment.ARROW_INFINITE, 1);
        tpbow.getItemMeta().setDisplayName("Toddler Slayer");
    }
}

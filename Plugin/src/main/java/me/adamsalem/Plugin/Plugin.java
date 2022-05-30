package me.adamsalem.Plugin;

import me.adamsalem.Plugin.Commands.*;
import me.adamsalem.Plugin.listeners.*;
import org.bukkit.plugin.java.JavaPlugin;
import java.util.Objects;

public final class Plugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
            getServer().getPluginManager().registerEvents(new EntityDeathListener(),this);
            getServer().getPluginManager().registerEvents(new PlayerJoinListener(),this);
            getServer().getPluginManager().registerEvents(new ProjectileHitListener(),this);
            Objects.requireNonNull(this.getCommand("getcoords")).setExecutor(new getCoords());
            Objects.requireNonNull(this.getCommand("coords")).setExecutor(new coords());
    }



}

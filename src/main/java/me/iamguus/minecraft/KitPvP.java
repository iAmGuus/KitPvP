package me.iamguus.minecraft;

import me.iamguus.minecraft.handlers.MongoHandler;
import me.iamguus.minecraft.handlers.PlayerHandler;
import me.iamguus.minecraft.listeners.ClickListener;
import me.iamguus.minecraft.listeners.JoinListener;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by guush on 7-8-2017.
 */
public class KitPvP extends JavaPlugin {

    public PlayerHandler playerHandler;
    public MongoHandler mongoHandler;

    public void onEnable() {
        playerHandler = new PlayerHandler(this);
        mongoHandler = new MongoHandler(this);

        new ClickListener(this);
        new JoinListener(this);

        System.out.println("KitPvP by iAmGuus has been enabled!");
    }

    public void onDisable() {
        System.out.println("KitPvP by iAmGuus is now disabling!");
    }
}

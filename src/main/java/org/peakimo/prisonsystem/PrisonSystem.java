package org.peakimo.prisonsystem;

import org.bukkit.plugin.java.JavaPlugin;
import org.peakimo.prisonsystem.Commands.Suspect;
import org.peakimo.prisonsystem.Commands.PrisonJail;
import org.peakimo.prisonsystem.Commands.PrisonerCommand;
import org.peakimo.prisonsystem.Commands.reload;

public final class PrisonSystem extends JavaPlugin {

    private static PrisonSystem plugin;

    public static  PrisonSystem instance;

    public static PrisonSystem getInstance(){

        return instance;

    }

    @Override
    public void onEnable() {
        // Plugin startup logic
        saveDefaultConfig();
        instance = this;


        getCommand("prisoner").setExecutor(new PrisonerCommand(this));
        getCommand("suspect").setExecutor(new Suspect());
        getCommand("prisonsystem-reload").setExecutor(new reload());
        getCommand("prisonjail").setExecutor(new PrisonJail());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}

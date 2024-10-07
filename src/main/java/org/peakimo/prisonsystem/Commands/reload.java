package org.peakimo.prisonsystem.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.peakimo.prisonsystem.PrisonSystem;

public class reload implements CommandExecutor {

    public PrisonSystem instance = PrisonSystem.getInstance(); // Default hame

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label,String[] args){

        Player bazikon = (Player) sender;

        if (sender.hasPermission("prisonsystem.admin")){

            instance.reloadConfig();
            sender.sendMessage(ChatColor.GOLD + "Prison-system reloaded!");
        }

        return true;
    }
}

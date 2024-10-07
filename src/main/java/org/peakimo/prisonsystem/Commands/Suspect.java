package org.peakimo.prisonsystem.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class Suspect implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){

        if (!(sender instanceof Player)) {
            sender.sendMessage("این فرمان فقط برای بازیکنان قابل استفاده است.");
            return true;
        }

        if (args.length != 1) {
            sender.sendMessage(color("correct format: /suspect (Player)"));
            return true;
        }

        String targetName = args[0];
        Player target = Bukkit.getPlayer(targetName);

        if (target == null) {
            sender.sendMessage(ChatColor.RED + "بازیکنی با نام " + targetName + " پیدا نشد.");
            return true;
        }

        ItemStack[] inventory = target.getInventory().getContents();
        int removedCount = 0;

        if (sender.hasPermission("PrisonSystem.guard")) {


            if (!target.hasPermission("cmdi.item.phone")){
            for (int i = 0; i < inventory.length; i++) {
                ItemStack item = inventory[i];
                if (item != null && item.getType() == Material.STRING) {
                    removedCount += item.getAmount();
                    inventory[i] = null; // حذف آیتم
                }
            }

            }
                for (int i = 0; i < inventory.length; i++) {
                    ItemStack item = inventory[i];
                    if (item != null && item.getType() == Material.STICK && item.getItemMeta().getDisplayName().equals(color("&c&lدریل سوراخ کننده"))) {
                        removedCount += item.getAmount();
                        inventory[i] = null; // حذف آیتم
                    }
                }

                target.getInventory().setContents(inventory); // به‌روزرسانی اینونتوری

                if (removedCount > 0) {

                    target.sendMessage(color("&cPolice item haye gheyr mojaz shoma ra hazf kard!"));
                    sender.sendMessage(color("&cItem haye gheyr mojaz " + targetName + " hazf shod!"));

                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(),"wanted add " + targetName + " 1" );

                } else {
                    sender.sendMessage(color("&aHich item mashkoki peyda nashod az: " + targetName));
                }

        }

        return true;
    }
    private String color(String str) {


        //CodeColor
        return ChatColor.translateAlternateColorCodes('&', str);
        //CodeColor

    }
}


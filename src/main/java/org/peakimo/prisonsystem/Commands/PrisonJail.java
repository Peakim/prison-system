package org.peakimo.prisonsystem.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.peakimo.prisonsystem.PrisonSystem;

public class PrisonJail implements CommandExecutor {

    private PrisonSystem instance = PrisonSystem.getInstance();
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        Player bazikon = (Player) sender;


        if (args.length != 2){
            sender.sendMessage((color("&cUse: /Prisonjail (cell-name) (player)")));
            sender.sendMessage((color("&cList All Prison: Prison1,Prison2 ........ to Prison18 :)")));
            return true;

        }


        if (args.length == 1) {

            if (args[0].equalsIgnoreCase("Prison1") || args[0].equalsIgnoreCase("Prison2") ||
                    args[0].equalsIgnoreCase("Prison3") || args[0].equalsIgnoreCase("Prison4") ||
                    args[0].equalsIgnoreCase("Prison5") || args[0].equalsIgnoreCase("Prison6") ||
                    args[0].equalsIgnoreCase("Prison7") || args[0].equalsIgnoreCase("Prison8") ||
                    args[0].equalsIgnoreCase("Prison9") || args[0].equalsIgnoreCase("Prison10") ||
                    args[0].equalsIgnoreCase("Prison11") || args[0].equalsIgnoreCase("Prison12") ||
                    args[0].equalsIgnoreCase("Prison13") || args[0].equalsIgnoreCase("Prison14") ||
                    args[0].equalsIgnoreCase("Prison15") || args[0].equalsIgnoreCase("Prison16") ||
                    args[0].equalsIgnoreCase("Prison17") || args[0].equalsIgnoreCase("Prison18")) {

                sender.sendMessage(color("&c you dont enter cell-name!"));
                return true;

            }
        }

        String targetName = args[0];
        Player targetPlayer = Bukkit.getPlayer(args[1]);

        if (args.length == 2 && targetPlayer == null){
            sender.sendMessage(color("&cPlayername incorrect!"));
            return true;
        }


        if (bazikon.hasPermission("Prisonsystem.guard")){

            // Config

            // Prison 1

            String prison1_c1 = instance.getConfig().getString("Prison1-command1");
            String prison1_c2 = instance.getConfig().getString("Prison1-command2");

            String prison1_c1_CP = prison1_c1.replace("%PLAYER%",targetPlayer.getPlayer().getName());
            String prison1_c2_CP = prison1_c2.replace("%PLAYER%",targetPlayer.getPlayer().getName());

            // Prison 2

            String prison2_c1 = instance.getConfig().getString("Prison2-command1");
            String prison2_c2 = instance.getConfig().getString("Prison2-command2");

            String prison2_c1_CP = prison2_c1.replace("%PLAYER%",targetPlayer.getPlayer().getName());
            String prison2_c2_CP = prison2_c2.replace("%PLAYER%",targetPlayer.getPlayer().getName());

            // Prison 3

            String prison3_c1 = instance.getConfig().getString("Prison3-command1");
            String prison3_c2 = instance.getConfig().getString("Prison3-command2");

            String prison3_c1_CP = prison3_c1.replace("%PLAYER%",targetPlayer.getPlayer().getName());
            String prison3_c2_CP = prison3_c2.replace("%PLAYER%",targetPlayer.getPlayer().getName());

            // Prison 4

            String prison4_c1 = instance.getConfig().getString("Prison4-command1");
            String prison4_c2 = instance.getConfig().getString("Prison4-command2");

            String prison4_c1_CP = prison4_c1.replace("%PLAYER%",targetPlayer.getPlayer().getName());
            String prison4_c2_CP = prison4_c2.replace("%PLAYER%",targetPlayer.getPlayer().getName());

            // Prison 5

            String prison5_c1 = instance.getConfig().getString("Prison5-command1");
            String prison5_c2 = instance.getConfig().getString("Prison5-command2");

            String prison5_c1_CP = prison5_c1.replace("%PLAYER%",targetPlayer.getPlayer().getName());
            String prison5_c2_CP = prison5_c2.replace("%PLAYER%",targetPlayer.getPlayer().getName());

            // Prison 6

            String prison6_c1 = instance.getConfig().getString("Prison6-command1");
            String prison6_c2 = instance.getConfig().getString("Prison6-command2");

            String prison6_c1_CP = prison6_c1.replace("%PLAYER%",targetPlayer.getPlayer().getName());
            String prison6_c2_CP = prison6_c2.replace("%PLAYER%",targetPlayer.getPlayer().getName());

            // Prison 7

            String prison7_c1 = instance.getConfig().getString("Prison7-command1");
            String prison7_c2 = instance.getConfig().getString("Prison7-command2");

            String prison7_c1_CP = prison7_c1.replace("%PLAYER%",targetPlayer.getPlayer().getName());
            String prison7_c2_CP = prison7_c2.replace("%PLAYER%",targetPlayer.getPlayer().getName());

            // Prison 8

            String prison8_c1 = instance.getConfig().getString("Prison8-command1");
            String prison8_c2 = instance.getConfig().getString("Prison8-command2");

            String prison8_c1_CP = prison8_c1.replace("%PLAYER%",targetPlayer.getPlayer().getName());
            String prison8_c2_CP = prison8_c2.replace("%PLAYER%",targetPlayer.getPlayer().getName());

            // Prison 9

            String prison9_c1 = instance.getConfig().getString("Prison9-command1");
            String prison9_c2 = instance.getConfig().getString("Prison9-command2");

            String prison9_c1_CP = prison9_c1.replace("%PLAYER%",targetPlayer.getPlayer().getName());
            String prison9_c2_CP = prison9_c2.replace("%PLAYER%",targetPlayer.getPlayer().getName());

            // Prison 10

            String prison10_c1 = instance.getConfig().getString("Prison10-command1");
            String prison10_c2 = instance.getConfig().getString("Prison10-command2");

            String prison10_c1_CP = prison10_c1.replace("%PLAYER%",targetPlayer.getPlayer().getName());
            String prison10_c2_CP = prison10_c2.replace("%PLAYER%",targetPlayer.getPlayer().getName());

            // Prison 11

            String prison11_c1 = instance.getConfig().getString("Prison11-command1");
            String prison11_c2 = instance.getConfig().getString("Prison11-command2");

            String prison11_c1_CP = prison11_c1.replace("%PLAYER%",targetPlayer.getPlayer().getName());
            String prison11_c2_CP = prison11_c2.replace("%PLAYER%",targetPlayer.getPlayer().getName());

            // Prison 12

            String prison12_c1 = instance.getConfig().getString("Prison12-command1");
            String prison12_c2 = instance.getConfig().getString("Prison12-command2");

            String prison12_c1_CP = prison12_c1.replace("%PLAYER%",targetPlayer.getPlayer().getName());
            String prison12_c2_CP = prison12_c2.replace("%PLAYER%",targetPlayer.getPlayer().getName());

            // Prison 13

            String prison13_c1 = instance.getConfig().getString("Prison13-command1");
            String prison13_c2 = instance.getConfig().getString("Prison13-command2");

            String prison13_c1_CP = prison13_c1.replace("%PLAYER%",targetPlayer.getPlayer().getName());
            String prison13_c2_CP = prison13_c2.replace("%PLAYER%",targetPlayer.getPlayer().getName());

            // Prison 14

            String prison14_c1 = instance.getConfig().getString("Prison14-command1");
            String prison14_c2 = instance.getConfig().getString("Prison14-command2");

            String prison14_c1_CP = prison14_c1.replace("%PLAYER%",targetPlayer.getPlayer().getName());
            String prison14_c2_CP = prison14_c2.replace("%PLAYER%",targetPlayer.getPlayer().getName());

            // Prison 15

            String prison15_c1 = instance.getConfig().getString("Prison15-command1");
            String prison15_c2 = instance.getConfig().getString("Prison15-command2");

            String prison15_c1_CP = prison15_c1.replace("%PLAYER%",targetPlayer.getPlayer().getName());
            String prison15_c2_CP = prison15_c2.replace("%PLAYER%",targetPlayer.getPlayer().getName());

            // Prison 16

            String prison16_c1 = instance.getConfig().getString("Prison16-command1");
            String prison16_c2 = instance.getConfig().getString("Prison16-command2");

            String prison16_c1_CP = prison16_c1.replace("%PLAYER%",targetPlayer.getPlayer().getName());
            String prison16_c2_CP = prison16_c2.replace("%PLAYER%",targetPlayer.getPlayer().getName());

            // Prison 17

            String prison17_c1 = instance.getConfig().getString("Prison17-command1");
            String prison17_c2 = instance.getConfig().getString("Prison17-command2");

            String prison17_c1_CP = prison17_c1.replace("%PLAYER%",targetPlayer.getPlayer().getName());
            String prison17_c2_CP = prison17_c2.replace("%PLAYER%",targetPlayer.getPlayer().getName());

            // Prison 18

            String prison18_c1 = instance.getConfig().getString("Prison18-command1");
            String prison18_c2 = instance.getConfig().getString("Prison18-command2");

            String prison18_c1_CP = prison18_c1.replace("%PLAYER%",targetPlayer.getPlayer().getName());
            String prison18_c2_CP = prison18_c2.replace("%PLAYER%",targetPlayer.getPlayer().getName());

            if (targetPlayer == null) {
                sender.sendMessage(ChatColor.RED + "بازیکنی با نام " + targetName + " پیدا نشد.");
                return true;
            }



            if (targetPlayer != null && targetPlayer.isOnline()){



                    if (args.length >= 1 && args[0].equalsIgnoreCase("Prison1")) {       // Prison 1


                            if (args.length != 2) {

                                sender.sendMessage(color("&cinvalid player data"));
                                return false;
                            }

                            if (targetPlayer == null || !targetPlayer.isOnline()) {
                                sender.sendMessage("&cPlayer is not online");
                                return true;
                            }
                            if (targetPlayer != null) {

                                if (!targetPlayer.hasPermission("cmdi.item.phone")) {

                                    targetPlayer.sendMessage(color("&aYou go to jail!"));
                                    bazikon.sendMessage(color("&aPlayer transfer to jail1"));

                                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), prison1_c1_CP);
                                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), prison1_c2_CP);

                                }

                            }
                    }

                if (args.length >= 1 && args[0].equalsIgnoreCase("Prison2")) {       // Prison 2


                    if (args.length != 2) {

                        sender.sendMessage(color("&cinvalid player data"));
                        return false;
                    }

                    if (targetPlayer == null || !targetPlayer.isOnline()) {
                        sender.sendMessage("&cPlayer is not online");
                        return true;
                    }
                    if (targetPlayer != null) {

                        if (!targetPlayer.hasPermission("cmdi.item.phone")) {

                            targetPlayer.sendMessage(color("&aYou go to jail!"));
                            bazikon.sendMessage(color("&aPlayer transfer to jail2"));

                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), prison2_c1_CP);
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), prison2_c2_CP);

                        }

                    }
                }

                if (args.length >= 1 && args[0].equalsIgnoreCase("Prison3")) {       // Prison 3


                    if (args.length != 2) {

                        sender.sendMessage(color("&cinvalid player data"));
                        return false;
                    }

                    if (targetPlayer == null || !targetPlayer.isOnline()) {
                        sender.sendMessage("&cPlayer is not online");
                        return true;
                    }
                    if (targetPlayer != null) {

                        if (!targetPlayer.hasPermission("cmdi.item.phone")) {

                            targetPlayer.sendMessage(color("&aYou go to jail!"));
                            bazikon.sendMessage(color("&aPlayer transfer to jail3"));

                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), prison3_c1_CP);
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), prison3_c2_CP);

                        }

                    }
                }

                if (args.length >= 1 && args[0].equalsIgnoreCase("Prison4")) {       // Prison 4


                    if (args.length != 2) {

                        sender.sendMessage(color("&cinvalid player data"));
                        return false;
                    }

                    if (targetPlayer == null || !targetPlayer.isOnline()) {
                        sender.sendMessage("&cPlayer is not online");
                        return true;
                    }
                    if (targetPlayer != null) {

                        if (!targetPlayer.hasPermission("cmdi.item.phone")) {

                            targetPlayer.sendMessage(color("&aYou go to jail!"));
                            bazikon.sendMessage(color("&aPlayer transfer to jail4"));

                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), prison4_c1_CP);
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), prison4_c2_CP);

                        }

                    }
                }

                if (args.length >= 1 && args[0].equalsIgnoreCase("Prison5")) {       // Prison 5


                    if (args.length != 2) {

                        sender.sendMessage(color("&cinvalid player data"));
                        return false;
                    }

                    if (targetPlayer == null || !targetPlayer.isOnline()) {
                        sender.sendMessage("&cPlayer is not online");
                        return true;
                    }
                    if (targetPlayer != null) {

                        if (!targetPlayer.hasPermission("cmdi.item.phone")) {

                            targetPlayer.sendMessage(color("&aYou go to jail!"));
                            bazikon.sendMessage(color("&aPlayer transfer to jail5"));

                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), prison5_c1_CP);
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), prison5_c2_CP);

                        }

                    }
                }


                if (args.length >= 1 && args[0].equalsIgnoreCase("Prison6")) {       // Prison 6


                    if (args.length != 2) {

                        sender.sendMessage(color("&cinvalid player data"));
                        return false;
                    }

                    if (targetPlayer == null || !targetPlayer.isOnline()) {
                        sender.sendMessage("&cPlayer is not online");
                        return true;
                    }
                    if (targetPlayer != null) {

                        if (!targetPlayer.hasPermission("cmdi.item.phone")) {

                            targetPlayer.sendMessage(color("&aYou go to jail!"));
                            bazikon.sendMessage(color("&aPlayer transfer to jail6"));

                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), prison6_c1_CP);
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), prison6_c2_CP);

                        }

                    }
                }

                if (args.length >= 1 && args[0].equalsIgnoreCase("Prison7")) {       // Prison 7


                    if (args.length != 2) {

                        sender.sendMessage(color("&cinvalid player data"));
                        return false;
                    }

                    if (targetPlayer == null || !targetPlayer.isOnline()) {
                        sender.sendMessage("&cPlayer is not online");
                        return true;
                    }
                    if (targetPlayer != null) {

                        if (!targetPlayer.hasPermission("cmdi.item.phone")) {

                            targetPlayer.sendMessage(color("&aYou go to jail!"));
                            bazikon.sendMessage(color("&aPlayer transfer to jail7"));

                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), prison7_c1_CP);
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), prison7_c2_CP);

                        }

                    }
                }

                if (args.length >= 1 && args[0].equalsIgnoreCase("Prison8")) {       // Prison 8


                    if (args.length != 2) {

                        sender.sendMessage(color("&cinvalid player data"));
                        return false;
                    }

                    if (targetPlayer == null || !targetPlayer.isOnline()) {
                        sender.sendMessage("&cPlayer is not online");
                        return true;
                    }
                    if (targetPlayer != null) {

                        if (!targetPlayer.hasPermission("cmdi.item.phone")) {

                            targetPlayer.sendMessage(color("&aYou go to jail!"));
                            bazikon.sendMessage(color("&aPlayer transfer to jail8"));

                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), prison8_c1_CP);
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), prison8_c2_CP);

                        }

                    }
                }

                if (args.length >= 1 && args[0].equalsIgnoreCase("Prison9")) {       // Prison 9


                    if (args.length != 2) {

                        sender.sendMessage(color("&cinvalid player data"));
                        return false;
                    }

                    if (targetPlayer == null || !targetPlayer.isOnline()) {
                        sender.sendMessage("&cPlayer is not online");
                        return true;
                    }
                    if (targetPlayer != null) {

                        if (!targetPlayer.hasPermission("cmdi.item.phone")) {

                            targetPlayer.sendMessage(color("&aYou go to jail!"));
                            bazikon.sendMessage(color("&aPlayer transfer to jail9"));

                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), prison9_c1_CP);
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), prison9_c2_CP);

                        }

                    }
                }

                if (args.length >= 1 && args[0].equalsIgnoreCase("Prison10")) {       // Prison 10


                    if (args.length != 2) {

                        sender.sendMessage(color("&cinvalid player data"));
                        return false;
                    }

                    if (targetPlayer == null || !targetPlayer.isOnline()) {
                        sender.sendMessage("&cPlayer is not online");
                        return true;
                    }
                    if (targetPlayer != null) {

                        if (!targetPlayer.hasPermission("cmdi.item.phone")) {

                            targetPlayer.sendMessage(color("&aYou go to jail!"));
                            bazikon.sendMessage(color("&aPlayer transfer to jail10"));

                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), prison10_c1_CP);
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), prison10_c2_CP);

                        }

                    }
                }

                if (args.length >= 1 && args[0].equalsIgnoreCase("Prison11")) {       // Prison 11


                    if (args.length != 2) {

                        sender.sendMessage(color("&cinvalid player data"));
                        return false;
                    }

                    if (targetPlayer == null || !targetPlayer.isOnline()) {
                        sender.sendMessage("&cPlayer is not online");
                        return true;
                    }
                    if (targetPlayer != null) {

                        if (!targetPlayer.hasPermission("cmdi.item.phone")) {

                            targetPlayer.sendMessage(color("&aYou go to jail!"));
                            bazikon.sendMessage(color("&aPlayer transfer to jail11"));

                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), prison11_c1_CP);
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), prison11_c2_CP);

                        }

                    }
                }

                if (args.length >= 1 && args[0].equalsIgnoreCase("Prison12")) {       // Prison 12


                    if (args.length != 2) {

                        sender.sendMessage(color("&cinvalid player data"));
                        return false;
                    }

                    if (targetPlayer == null || !targetPlayer.isOnline()) {
                        sender.sendMessage("&cPlayer is not online");
                        return true;
                    }
                    if (targetPlayer != null) {

                        if (!targetPlayer.hasPermission("cmdi.item.phone")) {

                            targetPlayer.sendMessage(color("&aYou go to jail!"));
                            bazikon.sendMessage(color("&aPlayer transfer to jail12"));

                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), prison12_c1_CP);
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), prison12_c2_CP);

                        }

                    }
                }

                if (args.length >= 1 && args[0].equalsIgnoreCase("Prison13")) {       // Prison 13


                    if (args.length != 2) {

                        sender.sendMessage(color("&cinvalid player data"));
                        return false;
                    }

                    if (targetPlayer == null || !targetPlayer.isOnline()) {
                        sender.sendMessage("&cPlayer is not online");
                        return true;
                    }
                    if (targetPlayer != null) {

                        if (!targetPlayer.hasPermission("cmdi.item.phone")) {

                            targetPlayer.sendMessage(color("&aYou go to jail!"));
                            bazikon.sendMessage(color("&aPlayer transfer to jail13"));

                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), prison13_c1_CP);
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), prison13_c1_CP);

                        }

                    }
                }

                if (args.length >= 1 && args[0].equalsIgnoreCase("Prison14")) {       // Prison 14


                    if (args.length != 2) {

                        sender.sendMessage(color("&cinvalid player data"));
                        return false;
                    }

                    if (targetPlayer == null || !targetPlayer.isOnline()) {
                        sender.sendMessage("&cPlayer is not online");
                        return true;
                    }
                    if (targetPlayer != null) {

                        if (!targetPlayer.hasPermission("cmdi.item.phone")) {

                            targetPlayer.sendMessage(color("&aYou go to jail!"));
                            bazikon.sendMessage(color("&aPlayer transfer to jail14"));

                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), prison14_c1_CP);
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), prison14_c2_CP);

                        }

                    }
                }

                if (args.length >= 1 && args[0].equalsIgnoreCase("Prison15")) {       // Prison 15


                    if (args.length != 2) {

                        sender.sendMessage(color("&cinvalid player data"));
                        return false;
                    }

                    if (targetPlayer == null || !targetPlayer.isOnline()) {
                        sender.sendMessage("&cPlayer is not online");
                        return true;
                    }
                    if (targetPlayer != null) {

                        if (!targetPlayer.hasPermission("cmdi.item.phone")) {

                            targetPlayer.sendMessage(color("&aYou go to jail!"));
                            bazikon.sendMessage(color("&aPlayer transfer to jail15"));

                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), prison15_c1_CP);
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), prison15_c2_CP);

                        }

                    }
                }

                if (args.length >= 1 && args[0].equalsIgnoreCase("Prison16")) {       // Prison 16


                    if (args.length != 2) {

                        sender.sendMessage(color("&cinvalid player data"));
                        return false;
                    }

                    if (targetPlayer == null || !targetPlayer.isOnline()) {
                        sender.sendMessage("&cPlayer is not online");
                        return true;
                    }
                    if (targetPlayer != null) {

                        if (!targetPlayer.hasPermission("cmdi.item.phone")) {

                            targetPlayer.sendMessage(color("&aYou go to jail!"));
                            bazikon.sendMessage(color("&aPlayer transfer to jail16"));

                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), prison16_c1_CP);
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), prison16_c2_CP);

                        }

                    }
                }

                if (args.length >= 1 && args[0].equalsIgnoreCase("Prison17")) {       // Prison 17


                    if (args.length != 2) {

                        sender.sendMessage(color("&cinvalid player data"));
                        return false;
                    }

                    if (targetPlayer == null || !targetPlayer.isOnline()) {
                        sender.sendMessage("&cPlayer is not online");
                        return true;
                    }
                    if (targetPlayer != null) {

                        if (!targetPlayer.hasPermission("cmdi.item.phone")) {

                            targetPlayer.sendMessage(color("&aYou go to jail!"));
                            bazikon.sendMessage(color("&aPlayer transfer to jail17"));

                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), prison17_c1_CP);
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), prison17_c2_CP);

                        }

                    }
                }

                if (args.length >= 1 && args[0].equalsIgnoreCase("Prison18")) {       // Prison 1


                    if (args.length != 2) {

                        sender.sendMessage(color("&cinvalid player data"));
                        return false;
                    }

                    if (targetPlayer == null || !targetPlayer.isOnline()) {
                        sender.sendMessage("&cPlayer is not online");
                        return true;
                    }
                    if (targetPlayer != null) {

                        if (!targetPlayer.hasPermission("cmdi.item.phone")) {

                            targetPlayer.sendMessage(color("&aYou go to jail!"));
                            bazikon.sendMessage(color("&aPlayer transfer to jail18"));

                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), prison18_c1_CP);
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), prison18_c2_CP);

                        }

                    }
                }

                // End





            }


        }
        return true;
    }
    private String color (String str){


        //CodeColor
        return ChatColor.translateAlternateColorCodes('&', str);
        //CodeColor

    }
}

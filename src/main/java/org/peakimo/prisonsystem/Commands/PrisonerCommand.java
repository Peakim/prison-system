package org.peakimo.prisonsystem.Commands;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.peakimo.prisonsystem.PrisonSystem;

public class PrisonerCommand implements CommandExecutor {
    private final PrisonSystem plugin;

    public PrisonerCommand(PrisonSystem plugin) {
        this.plugin = plugin;
    }

    private PrisonSystem instance = PrisonSystem.getInstance();

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        Player player = (Player) sender;
        Block block = player.getTargetBlock(null, 5);

        String ServerCommand1 = instance.getConfig().getString("ServerCommand1");
        String ServerCommand2 = instance.getConfig().getString("ServerCommand2");

        if (args.length == 1 && args[0].equals("nakh")) {

            if (!player.hasPermission("cmdi.item.phone")) {
                player.sendMessage(color("&aShoma bayad 10 sanie be in item negah konid."));
                if (block.getType() == Material.SEA_PICKLE) {

                    Bukkit.getScheduler().runTaskLater(plugin, () -> {


                        ItemStack string = new ItemStack(Material.STRING);
                        ItemMeta string_meta = string.getItemMeta();
                        string_meta.setDisplayName(color("&f&lتکه نخ"));

                        string.setItemMeta(string_meta);

                        player.getInventory().addItem(string);
                        player.sendMessage(color("&aShoma 10 sanie be sea_pickle negah kardid va yek teke nakh gereftid!"));

                    }, 20 * 10); // 10 Seconds

                }
            }

        }
        // ItemStack Define
        ItemStack iron_shovel = new ItemStack(Material.IRON_SHOVEL,1);
        //End
        //ItemStack define ghashogh
        ItemStack spoon = new ItemStack(Material.IRON_SHOVEL);
        ItemMeta spoon_meta = spoon.getItemMeta();
        spoon_meta.setDisplayName(color("&f&lقاشق"));
        spoon.setItemMeta(spoon_meta);


        //ItemStack define Drill
        ItemStack stickdrill = new ItemStack(Material.STICK);
        ItemMeta stickdrill_meta = stickdrill.getItemMeta();
        stickdrill_meta.setDisplayName(color("&c&lدریل سوراخ کننده"));
        stickdrill.setItemMeta(stickdrill_meta);


        if (!player.hasPermission("cmdi.item.phone")) {
            if (args.length == 1 && args[0].equals("washwork")) {

                if(player.getInventory().contains(iron_shovel))

                player.sendMessage(color("&fAgar 1 Iron_shovel darid 10 sanie roye BLAST_FURNACE sabr konid ta ghashogh begirid!"));

                if (block.getType() == Material.BLAST_FURNACE) {

                    Bukkit.getScheduler().runTaskLater(plugin, () -> {

                        player.getInventory().remove(new ItemStack(iron_shovel));
                        player.getInventory().addItem(spoon);

                    }, 20 * 10); // 10 seconds

                }
            }
        }

        if (!player.hasPermission("cmdi.item.phone")) {

            if (args.length == 1 && args[0].equals("craftdrill")) {

                // Define ItemStack

                ItemStack string20 = new ItemStack(Material.STRING,20);
                ItemMeta string20ItemMeta = string20.getItemMeta();
                string20ItemMeta.setDisplayName(color("&f&lتکه نخ"));
                string20.setItemMeta(string20ItemMeta);

                if (player.getInventory().contains(spoon) && player.getInventory().contains(string20)){
                    player.sendMessage(color("&aYou got Drill!"));

                    player.getInventory().removeItem(spoon);
                    player.getInventory().removeItem(string20);

                    player.getInventory().addItem(new ItemStack(stickdrill));

                } else {
                    player.sendMessage(color("Shoma 1 ghashogh va 20 teke nakh niaz darid."));

                }
            }


        }

        if (!player.hasPermission("cmdi.item.phone")) {

            if (args.length == 1 && args[0].equals("escape")) {

                if (block.getType() == Material.IRON_BLOCK){
                    if (player.getInventory().getItemInMainHand().equals(stickdrill)){

                        Bukkit.getScheduler().runTaskLater(plugin, () -> {

                            if (block.getType() == Material.IRON_BLOCK) {
                            if (player.getInventory().getItemInMainHand().equals(stickdrill)) {

                                player.getInventory().removeItem(stickdrill);
                                player.sendMessage(color("&f&lHayat zendan shekaste shod!!"));

                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(),ServerCommand1);
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(),ServerCommand2);

                            }
                        }

                        }, 20 * 10); // 10 seconds

                    } else {

                        player.sendMessage(color("&cShoma bayad drill ra dar dast asli khod begirid!"));

                    }



                } else {

                    player.sendMessage(color("&cShoma ro be roye gate farar nistid!"));

                }


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


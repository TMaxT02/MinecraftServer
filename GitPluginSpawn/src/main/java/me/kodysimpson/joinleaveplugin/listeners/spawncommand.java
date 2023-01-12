package me.kodysimpson.joinleaveplugin.listeners;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class spawncommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            Location loc = new Location(Bukkit.getWorld("world"), -11, 54, 15, 0, 0);
            player.teleport(loc);
            player.sendMessage("§8• §3Du wurdest zum Spawn teleportiert!");
        }
        return false;
    }
}

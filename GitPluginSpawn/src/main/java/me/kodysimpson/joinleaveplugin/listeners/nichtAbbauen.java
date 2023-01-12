package me.kodysimpson.joinleaveplugin.listeners;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerHarvestBlockEvent;
import org.bukkit.event.player.PlayerJoinEvent;

import static org.bukkit.GameMode.SURVIVAL;

public class nichtAbbauen implements Listener {
    @EventHandler
    public void nichtAbauen(BlockBreakEvent e) {
        Player player = e.getPlayer();
        if (player.getGameMode() == SURVIVAL){
            player.sendMessage("§3• Du darfst §6V§3a§4l§5i§6r§ba§c.§dd§ee §3nicht verändern!");
            e.setCancelled(true);
        }
    }

    @EventHandler
    public void nichtSetzen(BlockPlaceEvent e) {
        Player player = e.getPlayer();
        if (player.getGameMode() == SURVIVAL){
            player.sendMessage("§3• Du darfst §6V§3a§4l§5i§6r§ba§c.§dd§ee §3nicht verändern!");
            e.setCancelled(true);
        }
    }
}
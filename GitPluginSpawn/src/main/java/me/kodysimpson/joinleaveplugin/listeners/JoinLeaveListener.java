package me.kodysimpson.joinleaveplugin.listeners;

import org.bukkit.*;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Firework;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.inventory.meta.FireworkMeta;

import java.io.IOException;

public class JoinLeaveListener implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {

        Player player = e.getPlayer();
        Location loc = new Location(Bukkit.getWorld("world"), -11, 54, 15, 0, 0);
        spawnFireworks(loc, 5);


        player.teleport(loc);

        if (player.hasPlayedBefore()) {
            e.setJoinMessage("§3Der Reisende "
                    + ChatColor.RED + e.getPlayer().getDisplayName()
                    + " §3hat "
                    + "§6V§3a§4l§5i§6r§ba§c.§dd§ee "
                    + "§3betreten");
        } else {
            e.setJoinMessage("Der Spieler" + e.getPlayer() + "");
        }

    }

    @EventHandler
    public void onLeave(PlayerQuitEvent e) {
        Player player = e.getPlayer();
        e.setQuitMessage("§3Der Reisende "
                + ChatColor.RED + e.getPlayer().getDisplayName()
                + " §3hat "
                + "§6V§3a§4l§5i§6r§ba§c.§dd§ee "
                + "§3verlassen");
    }


    public static void spawnFireworks(Location location, int amount) {
        Location loc = location;
        Firework fw = (Firework) loc.getWorld().spawnEntity(loc, EntityType.FIREWORK);
        FireworkMeta fwm = fw.getFireworkMeta();

        fwm.setPower(2);
        fwm.addEffect(FireworkEffect.builder().withColor(Color.LIME).flicker(true).build());

        fw.setFireworkMeta(fwm);
        fw.detonate();

        for (int i = 0; i < amount; i++) {
            Firework fw2 = (Firework) loc.getWorld().spawnEntity(loc, EntityType.FIREWORK);
            fw2.setFireworkMeta(fwm);
        }
    }
}
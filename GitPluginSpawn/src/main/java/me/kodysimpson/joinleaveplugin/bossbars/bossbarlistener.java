package me.kodysimpson.joinleaveplugin.bossbars;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.boss.BarColor;
import org.bukkit.boss.BarStyle;
import org.bukkit.boss.BossBar;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class bossbarlistener implements Listener {
    BossBar bossBar;
    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        bossBar = Bukkit.createBossBar("§3Willkommen auf §6V§3a§4l§5i§6r§ba§c.§dd§ee",
                BarColor.PURPLE,
                BarStyle.SOLID);
        Player player = e.getPlayer();
        bossBar.addPlayer(player);
    }
}

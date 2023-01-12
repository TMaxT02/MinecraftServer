package me.kodysimpson.joinleaveplugin.scoreboard;

import jdk.tools.jlink.plugin.Plugin;
import me.kodysimpson.joinleaveplugin.JoinLeavePlugin;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.scoreboard.*;

public class listenerscoreboard implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        Player p = e.getPlayer();
        JoinLeavePlugin.getInstance().statsBoard.setScoreboard(p);
        Bukkit.getScheduler().runTaskTimer(JoinLeavePlugin.getInstance(), () -> {
            JoinLeavePlugin.getInstance().statsBoard.coinCount++;
            JoinLeavePlugin.getInstance().statsBoard.friendcoundt--;
            JoinLeavePlugin.getInstance().statsBoard.updateScoreBoard(p);
        }, 0, 20);
    }
}

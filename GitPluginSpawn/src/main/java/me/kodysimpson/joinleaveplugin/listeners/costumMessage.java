package me.kodysimpson.joinleaveplugin.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatEvent;

import static org.bukkit.Bukkit.broadcastMessage;
import static org.bukkit.GameMode.SURVIVAL;

public class costumMessage implements Listener {
    @EventHandler
    public void costum(PlayerChatEvent e) {







        Player player = e.getPlayer();
        String msg = e.getMessage();
        broadcastMessage("§8• §3" + player.getDisplayName() + " §8➤  §3"+ msg);
        e.setCancelled(true);
    }
}

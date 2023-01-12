package me.kodysimpson.joinleaveplugin.money;

import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import java.io.File;
import java.io.IOException;

public class onJoin implements Listener {


    private File file = new File("plugins//server//money.yml");
    private YamlConfiguration yamlConfiguration = YamlConfiguration.loadConfiguration(file);

    @EventHandler
    public void onJoin(PlayerJoinEvent e) throws IOException {
        yamlConfiguration.save(this.file);
        Player player = e.getPlayer();
        yamlConfiguration.set(player.getDisplayName() + "_money", (Integer) 0);
        yamlConfiguration.save(this.file);
    }
}
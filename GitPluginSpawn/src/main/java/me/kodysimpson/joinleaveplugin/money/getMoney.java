package me.kodysimpson.joinleaveplugin.money;

import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import javax.print.DocFlavor;
import java.io.File;

public class getMoney {
    public getMoney(Player p) {
    }

    public void getMoneyPlayer(Player p) {
        File file = new File("plugins//server//money.yml");
        YamlConfiguration yamlConfiguration = YamlConfiguration.loadConfiguration(file);
        String geld = String.valueOf(yamlConfiguration.getInt("immerluck_money"));
    }
}

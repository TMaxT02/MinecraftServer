package me.kodysimpson.joinleaveplugin;

import me.kodysimpson.joinleaveplugin.bossbars.bossbarlistener;
import me.kodysimpson.joinleaveplugin.listeners.*;
import me.kodysimpson.joinleaveplugin.money.MoneyCommand;
import me.kodysimpson.joinleaveplugin.money.onJoin;
import me.kodysimpson.joinleaveplugin.scoreboard.StatsBoard;
import me.kodysimpson.joinleaveplugin.scoreboard.listenerscoreboard;
import org.bukkit.boss.BossBar;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

public final class JoinLeavePlugin extends JavaPlugin {
    private static JoinLeavePlugin instance;
    public StatsBoard statsBoard = new StatsBoard();
    BossBar bossBar;
    @Override
    public void onEnable() {

        instance = this;
        this.getCommand("money").setExecutor(new MoneyCommand());
        getServer().getPluginManager().registerEvents(new bossbarlistener(), this);
        getServer().getPluginManager().registerEvents(new listenerscoreboard(), this);
        getServer().getPluginManager().registerEvents(new JoinLeaveListener(), this);
        getServer().getPluginManager().registerEvents(new nichtAbbauen(), this);
        getServer().getPluginManager().registerEvents(new costumMessage(), this);
        this.getCommand("spawn").setExecutor(new spawncommand());
        this.getCommand("discord").setExecutor(new links());
        getServer().getPluginManager().registerEvents(new onJoin(), this);
    }

    public static JoinLeavePlugin getInstance() {
        return instance;
    }
}

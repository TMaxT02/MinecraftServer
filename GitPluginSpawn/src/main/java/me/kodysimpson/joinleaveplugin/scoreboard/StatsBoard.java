package me.kodysimpson.joinleaveplugin.scoreboard;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.*;

public class StatsBoard {
    public int coinCount = 0;
    public int friendcoundt = 0;
    public void setScoreboard(Player p){
        Scoreboard board = Bukkit.getScoreboardManager().getNewScoreboard();
        Objective obj = board.registerNewObjective("stats","dummy");
        obj.setDisplaySlot(DisplaySlot.SIDEBAR);
        obj.setDisplayName("Stats");
        Team coins = board.registerNewTeam("coins");
        Team friends = board.registerNewTeam("friends");

        obj.getScore("Coins").setScore(3);
        obj.getScore("§d").setScore(2);
        obj.getScore("Freunde").setScore(1);
        obj.getScore("§e").setScore(0);

        coins.addEntry("§d");
        coins.setPrefix("§e" + coinCount );

        friends.addEntry("§e");
        friends.setPrefix("§a" + friendcoundt);

        p.setScoreboard(board);
    }

    public void updateScoreBoard(Player p){
        Scoreboard board = p.getScoreboard();
        Team coins = board.getTeam("coins");
        Team friends = board.getTeam("friends");
        coins.setPrefix("§e" + coinCount);
        friends.setPrefix("§a" + friendcoundt);
    }

}

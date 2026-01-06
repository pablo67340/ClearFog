package de.rapha149.clearfog;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChangedWorldEvent;
import org.bukkit.event.player.PlayerJoinEvent;

public class Events implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        Scheduler.runForEntity(player, () -> Util.updateViewDistance(player, false));
    }

    @EventHandler
    public void onWorldChanged(PlayerChangedWorldEvent event) {
        Util.updateViewDistance(event.getPlayer(), false);
    }
}

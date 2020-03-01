package me.dionjava.cancelevents.listeners;

import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class InteractEvent implements Listener {
	  @EventHandler
	  public void onPlayerInteractEvent(PlayerInteractEvent e) {
	    if (e.getAction() == Action.LEFT_CLICK_AIR || e.getAction() == Action.LEFT_CLICK_BLOCK || e.getAction() == Action.RIGHT_CLICK_AIR)
	      return; 
	    if (e.getClickedBlock().getType() == Material.MOB_SPAWNER) {
	      Player p = e.getPlayer();
	      if (p.getGameMode() == GameMode.CREATIVE)
	        e.setCancelled(true); 
	    } 
	  }
	}

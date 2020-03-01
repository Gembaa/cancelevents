package me.dionjava.cancelevents;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import me.dionjava.cancelevents.listeners.InteractEvent;

public class Main extends JavaPlugin {
	  public void onEnable() {
		    Bukkit.getServer().getPluginManager().registerEvents(new InteractEvent(), this);
		    System.out.println("CancelEvents On!");
		  }
		  
		  public void onDisable() {
			  System.out.println("CancelEvents Off!");
		  }
		}

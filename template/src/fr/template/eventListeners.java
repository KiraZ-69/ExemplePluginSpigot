package fr.template;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;



public class eventListeners implements Listener {
	
	@EventHandler
	public void onJoin(PlayerJoinEvent event) {
		


	// broadcast message
		Bukkit.broadcastMessage("test event successfull");	
	}
	

	
	
	
	

	
	
	
	

	 


}

package fr.template;

import java.util.Arrays;

import org.bukkit.Bukkit;


public class giveallcommands implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] args) {
		
		
// broadcast message
		bukkit.broadcastmessage("Commande execute whith success");
	
		
		
		
		return false;
	}

}

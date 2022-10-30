package fr.template;

import org.bukkit.plugin.java.JavaPlugin;




public class main extends JavaPlugin {
	
	
	@Override
	public void onEnable() {
		System.out.println("[]==========[exemple]==========[]");
		System.out.println("exemple plugin start.");
		System.out.println("[]==========[exemple]==========[]");
		getCommand("testcms").setExecutor(new testcmd());
		getServer().getPluginManager().registerEvents(new eventListeners(), this);

		
	}

	@Override
	public void onDisable() {
		System.out.println("[]==========[exemple]==========[]");
		System.out.println("exemple plugin stop.");
		System.out.println("[]==========[exemple]==========[]");
	}
	

	
}

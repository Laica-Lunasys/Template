package net.shiroumi.template;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{

	public void onEnable(){
		getLogger().info("TestPlugin Enabled.");
	}
	public void onDisable(){
		getLogger().info("TestPlugin Disabled.");
	}
}

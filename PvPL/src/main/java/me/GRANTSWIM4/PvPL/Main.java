package me.GRANTSWIM4.PvPL;



import org.bukkit.plugin.java.JavaPlugin;




public final class Main extends JavaPlugin
{
@Override
public void onEnable()
{
	
	{
		// Welcome message
		getLogger().info("Protecting your server form PvP logger since 2014!");
		  
		 

			
		// Register events
		getServer().getPluginManager().registerEvents(new PvPEvent(this), this);
	}
}
	
	
		


/**
 * Bukkit disable.
 */
@Override
public void onDisable()
{
	// Goodbye message
	getLogger().info("It's been a honor protecting your server Bye!");			
}
}

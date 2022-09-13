package fr.reyfox.modplus;

import org.bukkit.plugin.java.JavaPlugin;

import fr.reyfox.modplusdb.Database;
import fr.reyfox.modplusdb.SQLite;


public class Index extends JavaPlugin {
	
	
	private Database db;

	 ///OnEnable function
	 
	@Override
	public void onEnable() {
		
		System.out.println("[ModPlus] is now [ON]");
		this.db = new SQLite(this);
		this.db.load();

		
	
	}
	
	///Return the db
	
	public Database getSanction() {
        return this.db;
    }
	
	///OnDisable Function.
	@Override
	public void onDisable() {
		
		System.out.println("§a [ModPlus] §r is now §4 [OFF]");
		
	}

	

}

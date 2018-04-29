package net.hashcodedevelopement.chataddon;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class ChatAddon extends JavaPlugin implements Listener {
	
	@Override
	public void onEnable() {
		System.out.println(" ");
		System.out.println("   _____ _           _               _     _             \n  / ____| |         | |     /\\      | |   | |             | |    | |__   __ _| |_   /  \\   __| | __| | ___  _ __  \n | |    | '_ \\ / _` | __| / /\\ \\ / _` |/ _` |/ _ \\| '_ \\ \n | |____| | | | (_| | |_ / ____ \\ (_| | (_| | (_) | | | |\n  \\_____|_| |_|\\__,_|\\__/_/    \\_\\__,_|\\__,_|\\___/|_| |_|");
		System.out.println(" ");
		System.out.println("Coded by HashCodeDevelopement | Cerus");
		System.out.println(" ");
		
		Bukkit.getPluginManager().registerEvents(this, this);
	}
	
	@EventHandler
	public void onChat(AsyncPlayerChatEvent e){
		
	}

}

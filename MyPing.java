package fr.itstimetovape;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;

public class MyPing implements CommandExecutor {
	
	public Main pl;

	public MyPing(Main pl) {
		this.pl = pl;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] args) {
		
		Player p = (Player) sender;
		int Ping = ((CraftPlayer) p).getHandle().ping;
		
		if(cmd.getName().equalsIgnoreCase("ping")){
			
			String message = this.pl.getConfig().getString("message");
			p.sendMessage(ChatColor.GREEN + message + " : " + ChatColor.GOLD + Ping);
			
				
			}
			
		
		
		
		return false;
	}
}
		


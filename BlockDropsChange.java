package heart.itstimetovape;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.RegisteredServiceProvider;

import net.milkbowl.vault.economy.Economy;

public class Rankup implements CommandExecutor {
	
	public static Economy economy = null;
	
	private boolean setupEconomy()
    {
        RegisteredServiceProvider<Economy> economyProvider = Bukkit.getServer().getServicesManager().getRegistration(net.milkbowl.vault.economy.Economy.class);
        if (economyProvider != null) {
            economy = economyProvider.getProvider();
        }

        return (economy != null);
    }


	
	

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] args) {
		
		
		
		Player p = (Player) sender;
		
		double balance = economy.getBalance(p);
		
		if(cmd.getName().equalsIgnoreCase("rankup")){
			
			if(setupEconomy()){
				
				if(p.hasPermission("rank.A")){
					
					if(balance >= 1000){
					
	                Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "manuadd " + p.getName() + " B");
					p.sendMessage("§aTu es passé au rank §bB !");
					Bukkit.broadcastMessage("§a" + p.getName() + " §bPasse au rank B !");
					
					return true;
				

					
				}
				} else if(balance < 1000){
					
					p.sendMessage("§cTu n'as pas assez d'argent pour rankup !");
					
				}
				
			}
			
			if(p.hasPermission("rank.B")){
				
				if(balance >= 2500){
				
                Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "manuadd " + p.getName() + " C");
				p.sendMessage("§aTu es passé au rank §bC !");
				Bukkit.broadcastMessage("§a" + p.getName() + " §bPasse au rank C !");
				
				return true;
				
				}
			} else if(balance < 2500){
				
				p.sendMessage("§cTu n'as pas assez d'argent pour rankup !");
				
			}
				
				if(p.hasPermission("rank.C")){
					
					if(balance >= 5000){
					
	                Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "manuadd " + p.getName() + " d");
					p.sendMessage("§aTu es passé au rank §bD !");
					Bukkit.broadcastMessage("§a" + p.getName() + " §bPasse au rank D !");
					
					return true;
					
					}
				} else if(balance < 5000){
					
					p.sendMessage("§cTu n'as pas assez d'argent pour rankup !");
				}
				
				if(p.hasPermission("rank.D")){
					
					if(balance >= 7500){
					 
	                Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "manuadd " + p.getName() + " E");
					p.sendMessage("§aTu es passé au rank §bE !");
					Bukkit.broadcastMessage("§a" + p.getName() + " §bPasse au rank E !");
					
					return true;
					
					} else if(balance < 7500){
						
						p.sendMessage("§cTu n'as pas assez d'argent pour rankup !");
						
					}
				
			} else {
				
				p.sendMessage("§cTu es déja au dernier rank !");
				
			}
			
		}
		
		if(cmd.getName().equalsIgnoreCase("ranks")) {
			
			if(p.hasPermission("rank.A")){
				
				p.sendMessage("§7---------------");
				p.sendMessage("§7A §b> §7B = §a1K");
				p.sendMessage("§7B §b> §7C = §a2.5K");
				p.sendMessage("§7C §b> §7D = §a5K");
				p.sendMessage("§7D §b> §7E = §a7.5K");
				p.sendMessage("§7Tu es rank §eA !");
				p.sendMessage("§7---------------");
				
				return true;
				
			}
			
			if(p.hasPermission("rank.B")){
				
				p.sendMessage("§7---------------");
				p.sendMessage("§7A §b> §7B = §a1K");
				p.sendMessage("§7B §b> §7C = §a2.5K");
				p.sendMessage("§7C §b> §7D = §a5K");
				p.sendMessage("§7D §b> §7E = §a7.5K");
				p.sendMessage("§7Tu es rank §eB !");
				p.sendMessage("§7---------------");
				
				return true;
				
			}
			
			if(p.hasPermission("rank.C")){
				
				p.sendMessage("§7---------------");
				p.sendMessage("§7A §b> §7B = §a1K");
				p.sendMessage("§7B §b> §7C = §a2.5K");
				p.sendMessage("§7C §b> §7D = §a5K");
				p.sendMessage("§7D §b> §7E = §a7.5K");
				p.sendMessage("§7Tu es rank §eC !");
				p.sendMessage("§7---------------");
				
				return true;
				
			}
			
			if(p.hasPermission("rank.D")){
				
				p.sendMessage("§7---------------");
				p.sendMessage("§7A §b> §7B = §a1K");
				p.sendMessage("§7B §b> §7C = §a2.5K");
				p.sendMessage("§7C §b> §7D = §a5K");
				p.sendMessage("§7D §b> §7E = §a7.5K");
				p.sendMessage("§7Tu es rank §eD !");
				p.sendMessage("§7---------------");
				
				return true;
				
			}
			
			if(p.hasPermission("rank.E")){
				
				p.sendMessage("§7---------------");
				p.sendMessage("§7A §b> §7B = §a1K");
				p.sendMessage("§7B §b> §7C = §a2.5K");
				p.sendMessage("§7C §b> §7D = §a5K");
				p.sendMessage("§7D §b> §7E = §a7.5K");
				p.sendMessage("§7Tu es rank §eE !");
				p.sendMessage("§7---------------");
				
				return true;
				
			}
			

			
		}
		
		
		return false;
	}

}

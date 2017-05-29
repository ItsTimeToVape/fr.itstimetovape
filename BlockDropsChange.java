package fr.itstimetovape;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

public class BlockDropsChange implements Listener {
	
	public MainBlock pl;
	
	public BlockDropsChange(MainBlock pl){
		this.pl = pl;
	}
	
    @EventHandler
    public void breakBlock(BlockBreakEvent e){
       
        //CREER UNE VARIABLE LOCATION
        Location breakLoc = e.getBlock().getLocation();
        
        ItemStack diamond = new ItemStack(Material.valueOf(pl.getConfig().getString("diamond")));
        ItemStack diamond_block = new ItemStack(Material.valueOf(pl.getConfig().getString("diamond_block")));
        ItemStack iron = new ItemStack(Material.valueOf(pl.getConfig().getString("iron_ore")));
        ItemStack iron_block = new ItemStack(Material.valueOf(pl.getConfig().getString("iron_block")));
        ItemStack gold = new ItemStack(Material.valueOf(pl.getConfig().getString("gold_ore")));
        ItemStack gold_block = new ItemStack(Material.valueOf(pl.getConfig().getString("gold_block")));
        ItemStack emerald = new ItemStack(Material.valueOf(pl.getConfig().getString("emerald_ore")));
        ItemStack emerald_block = new ItemStack(Material.valueOf(pl.getConfig().getString("emerald_block")));
        ItemStack coal = new ItemStack(Material.valueOf(pl.getConfig().getString("coal_ore")));
        ItemStack coal_block = new ItemStack(Material.valueOf(pl.getConfig().getString("coal_block")));
        ItemStack dirt = new ItemStack(Material.valueOf(pl.getConfig().getString("dirt")));
        ItemStack stone = new ItemStack(Material.valueOf(pl.getConfig().getString("stone")));
        ItemStack grass = new ItemStack(Material.valueOf(pl.getConfig().getString("grass_block")));
        ItemStack wood = new ItemStack(Material.valueOf(pl.getConfig().getString("wood")));
        ItemStack redstone = new ItemStack(Material.valueOf(pl.getConfig().getString("redstone_ore")));
        ItemStack redstone_block = new ItemStack(Material.valueOf(pl.getConfig().getString("redstone_block")));
        ItemStack quartz_ore = new ItemStack(Material.valueOf(pl.getConfig().getString("quartz_ore")));
        ItemStack quartz_block = new ItemStack(Material.valueOf(pl.getConfig().getString("quartz_block")));
        ItemStack obsidian = new ItemStack(Material.valueOf(pl.getConfig().getString("obsidian")));
        ItemStack log = new ItemStack(Material.valueOf(pl.getConfig().getString("log")));
        ItemStack gravel = new ItemStack(Material.valueOf(pl.getConfig().getString("gravel")));
        ItemStack snow = new ItemStack(Material.valueOf(pl.getConfig().getString("snow")));
        ItemStack lapis = new ItemStack(Material.valueOf(pl.getConfig().getString("lapis_ore")));
        ItemStack lapisblock = new ItemStack(Material.valueOf(pl.getConfig().getString("lapis_block")));
        ItemStack leaves = new ItemStack(Material.valueOf(pl.getConfig().getString("leaves")));
        ItemStack ice = new ItemStack(Material.valueOf(pl.getConfig().getString("ice")));
        ItemStack furnace = new ItemStack(Material.valueOf(pl.getConfig().getString("furnace")));
        ItemStack chest = new ItemStack(Material.valueOf(pl.getConfig().getString("chest")));
        
        switch(e.getBlock().getType()){
        
        
        case FURNACE:
        e.setCancelled(true);
        e.getBlock().setType(Material.AIR);
        breakLoc.getWorld().dropItemNaturally(breakLoc, furnace);
                
        break;
        
        case CHEST:
        e.setCancelled(true);
        e.getBlock().setType(Material.AIR);
        breakLoc.getWorld().dropItemNaturally(breakLoc, chest);
                
        break;
        
        case ICE:
        e.setCancelled(true);
        e.getBlock().setType(Material.AIR);
        breakLoc.getWorld().dropItemNaturally(breakLoc, ice);
                
        break;
        
        
        case LEAVES:
        e.setCancelled(true);
        e.getBlock().setType(Material.AIR);
        breakLoc.getWorld().dropItemNaturally(breakLoc, leaves);
            
        break;
        
        
        case LAPIS_ORE:
        e.setCancelled(true);
        e.getBlock().setType(Material.AIR);
        breakLoc.getWorld().dropItemNaturally(breakLoc, lapis);
        
        break;
        
        case LAPIS_BLOCK:
        e.setCancelled(true);
        e.getBlock().setType(Material.AIR);
        breakLoc.getWorld().dropItemNaturally(breakLoc, lapisblock);
        
        break;
        
        
        case GLOWING_REDSTONE_ORE:
        e.setCancelled(true);
        e.getBlock().setType(Material.AIR);
        breakLoc.getWorld().dropItemNaturally(breakLoc, redstone);
        
        case SNOW_BLOCK:
        e.setCancelled(true);
        e.getBlock().setType(Material.AIR);
        //CA VA DROP 2 LINGOTS DE FER
        breakLoc.getWorld().dropItemNaturally(breakLoc, snow);
        
        break;
        
        case GRAVEL:
        e.setCancelled(true);
        e.getBlock().setType(Material.AIR);
        //CA VA DROP 2 LINGOTS DE FER
        breakLoc.getWorld().dropItemNaturally(breakLoc, gravel);
        
        break;
        
        case LOG:
        e.setCancelled(true);
        e.getBlock().setType(Material.AIR);
        //CA VA DROP 2 LINGOTS DE FER
        breakLoc.getWorld().dropItemNaturally(breakLoc, log);
        
        break;
        
        case OBSIDIAN:
        e.setCancelled(true);
        e.getBlock().setType(Material.AIR);
        //CA VA DROP 2 LINGOTS DE FER
        breakLoc.getWorld().dropItemNaturally(breakLoc, obsidian);
        
        break;
        
        
        case QUARTZ_ORE:
        e.setCancelled(true);
        e.getBlock().setType(Material.AIR);
        //CA VA DROP 2 LINGOTS DE FER
        breakLoc.getWorld().dropItemNaturally(breakLoc, quartz_ore);
        
        break;
        
        case QUARTZ_BLOCK:
        e.setCancelled(true);
        e.getBlock().setType(Material.AIR);
        //CA VA DROP 2 LINGOTS DE FER
        breakLoc.getWorld().dropItemNaturally(breakLoc, quartz_block);
        
        break;
       
        case REDSTONE_ORE:
        e.setCancelled(true);
        e.getBlock().setType(Material.AIR);
        //CA VA DROP 2 LINGOTS DE FER
        breakLoc.getWorld().dropItemNaturally(breakLoc, redstone);
        
        break;
        
        case REDSTONE_BLOCK:
        e.setCancelled(true);
        e.getBlock().setType(Material.AIR);
        //CA VA DROP 2 LINGOTS DE FER
        breakLoc.getWorld().dropItemNaturally(breakLoc, redstone_block);
        
        break;
        
        
        case WOOD:
        e.setCancelled(true);
        e.getBlock().setType(Material.AIR);
        //CA VA DROP 2 LINGOTS DE FER
        breakLoc.getWorld().dropItemNaturally(breakLoc, wood);
            
        break;
        
        case STONE:
        e.setCancelled(true);
        e.getBlock().setType(Material.AIR);
        //CA VA DROP 2 LINGOTS DE FER
        breakLoc.getWorld().dropItemNaturally(breakLoc, stone);
            
        break;
        
        case DIRT:
        e.setCancelled(true);
        e.getBlock().setType(Material.AIR);
        //CA VA DROP 2 LINGOTS DE FER
        breakLoc.getWorld().dropItemNaturally(breakLoc, dirt);
            
        break;
        
        case GRASS:
        e.setCancelled(true);
        e.getBlock().setType(Material.AIR);
        //CA VA DROP 2 LINGOTS DE FER
        breakLoc.getWorld().dropItemNaturally(breakLoc, grass);
            
        break;
        
        
        case IRON_ORE:
        e.setCancelled(true);
        e.getBlock().setType(Material.AIR);
        //CA VA DROP 2 LINGOTS DE FER
        breakLoc.getWorld().dropItemNaturally(breakLoc, iron);
        
        break;
        
        case IRON_BLOCK:
        e.setCancelled(true);
        e.getBlock().setType(Material.AIR);
        //CA VA DROP 2 LINGOTS DE FER
        breakLoc.getWorld().dropItemNaturally(breakLoc, iron_block);
            
        break;
        
        case COAL_ORE:
        e.setCancelled(true);
        e.getBlock().setType(Material.AIR);
        //CA VA DROP 2 LINGOTS DE FER
        breakLoc.getWorld().dropItemNaturally(breakLoc, coal);
            
        break;
        
        case COAL_BLOCK:
        e.setCancelled(true);
        e.getBlock().setType(Material.AIR);
        //CA VA DROP 2 LINGOTS DE FER
        breakLoc.getWorld().dropItemNaturally(breakLoc, coal_block);
            
        break;
        
        case DIAMOND_ORE:
        e.setCancelled(true);
        e.getBlock().setType(Material.AIR);
        //CA VA DROP 2 LINGOTS DE FER
        breakLoc.getWorld().dropItemNaturally(breakLoc, diamond);
            
        break;
        
        case DIAMOND_BLOCK:
        e.setCancelled(true);
        e.getBlock().setType(Material.AIR);
        //CA VA DROP 2 LINGOTS DE FER
        breakLoc.getWorld().dropItemNaturally(breakLoc, diamond_block);
            
        break;
        
        case GOLD_ORE:
        e.setCancelled(true);
        e.getBlock().setType(Material.AIR);
        //CA VA DROP 2 LINGOTS DE FER
        breakLoc.getWorld().dropItemNaturally(breakLoc, gold);
            
        break;
        
        case GOLD_BLOCK:
        e.setCancelled(true);
        e.getBlock().setType(Material.AIR);
        //CA VA DROP 2 LINGOTS DE FER
        breakLoc.getWorld().dropItemNaturally(breakLoc, gold_block);
            
        break;
        
        case EMERALD_ORE:
        e.setCancelled(true);
        e.getBlock().setType(Material.AIR);
        //CA VA DROP 2 LINGOTS DE FER
        breakLoc.getWorld().dropItemNaturally(breakLoc, emerald);
            
        break;
        
        case EMERALD_BLOCK:
        e.setCancelled(true);
        e.getBlock().setType(Material.AIR);
        //CA VA DROP 2 LINGOTS DE FER
        breakLoc.getWorld().dropItemNaturally(breakLoc, emerald_block);
            
        break;
        
        default:
        break;
        }
    }
}



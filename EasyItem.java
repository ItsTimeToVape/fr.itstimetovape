package fr.itstimetovape;

import java.util.Arrays;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class EasyItem {
	
	Material material;
	int count;
	String name;
	String lore1;
	String lore2;
	String lore3;
	ItemStack item;
	ItemMeta meta;
	Enchantment enchantment;
	int enchantmentlevel;
	
	public EasyItem(Material material, int count, String name, String lore1, String lore2, String lore3){
		
		this.material = material;
		this.count = count;
		this.name = name;
		this.lore1 = lore1;
		this.lore2 = lore2;
		this.lore3 = lore3;
		
		this.item = new ItemStack(material, count);
		this.meta = item.getItemMeta();
		this.meta.setDisplayName(name);
		this.meta.setLore(Arrays.asList(lore1, lore2, lore3));
		this.item.setItemMeta(meta);
		
		
		
	}
	
	public EasyItem(Material material, int count, String name, Enchantment enchantment, int enchantmentlevel, String lore1, String lore2, String lore3){
		
		this.enchantmentlevel = enchantmentlevel;
		this.enchantment = enchantment;
		this.material = material;
		this.count = count;
		this.name = name;
		this.lore1 = lore1;
		this.lore2 = lore2;
		this.lore3 = lore3;
		
		this.item = new ItemStack(material, count);
		this.meta = item.getItemMeta();
		this.meta.setDisplayName(name);
		this.meta.setLore(Arrays.asList(lore1, lore2, lore3));
		this.meta.addEnchant(enchantment, enchantmentlevel, true);
		this.item.setItemMeta(meta);
		
		
		
	}
	
	public EasyItem(Material material, int count, String name, Enchantment enchantment, int enchantmentlevel){
		
		this.enchantmentlevel = enchantmentlevel;
		this.enchantment = enchantment;
		this.material = material;
		this.count = count;
		this.name = name;
		
		this.item = new ItemStack(material, count);
		this.meta = item.getItemMeta();
		this.meta.setDisplayName(name);
		this.meta.addEnchant(enchantment, enchantmentlevel, true);
		this.item.setItemMeta(meta);
		
		
		
	}
	
	public EasyItem(Material material, int count, String name, Enchantment enchantment){
		
		
		this.enchantment = enchantment;
		this.material = material;
		this.count = count;
		this.name = name;
		
		this.item = new ItemStack(material, count);
		this.meta = item.getItemMeta();
		this.meta.setDisplayName(name);
		this.meta.addEnchant(enchantment, 1, true);
		this.item.setItemMeta(meta);
		
		
		
	}
	
	public EasyItem(Material material, String name){
		
		this.material = material;
		
		this.name = name;
		
		this.item = new ItemStack(material, 1);
		this.meta = item.getItemMeta();
		this.meta.setDisplayName(name);
		this.item.setItemMeta(meta);
		
		
		
	}
	
	public EasyItem(Material material, int count, String name){
		
		this.material = material;
		this.count = count;
		this.name = name;
		
		this.item = new ItemStack(material, count);
		this.meta = item.getItemMeta();
		this.meta.setDisplayName(name);
		this.item.setItemMeta(meta);
		
		
		
	}
	
	
	public void getDetails() {
		
		System.out.println("Item Type: " + getType());
		System.out.println("Item Amount: " + getAmount());
		System.out.println("Item Enchantment: " + getEnchant());
		System.out.println("Item EnchantmentLevel: " + getEnchantLevel());
		System.out.println("Item Name: " + getName());
		System.out.println("Item Lore-1: " + getLore1());
		System.out.println("Item Lore-2: " + getLore2());
		System.out.println("Item Lore-3: " + getLore3());
		
	}
	
	public ItemStack toItemStack() {
		
		return item;
		
	}
	
	public String getName() {
		
		return meta.getDisplayName();
		
	}
	
	public Material getType() {
		
		return item.getType();
		
	}
	
	public int getAmount() {
		
		return count;
		
	}
	
	public Enchantment getEnchant() {
		
		return enchantment;
		
	}
	
	public int getEnchantLevel() {
		
		return enchantmentlevel;
		
	}

	
	public String getLore1() {
		
		return lore1;
		
	}
	
	public String getLore2() {
		
		return lore2;
		
	}
	
	public String getLore3() {
		
		return lore3;
		
	}
	
}

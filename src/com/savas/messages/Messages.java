package com.savas.messages;

import com.savas.Entity;
import com.savas.Managers.EntityManager;
import com.savas.Managers.InventoryManager;
import com.savas.Managers.PowerManager;
import com.savas.Managers.WeaponManager;

public class Messages{
	
	public static int ist;
	
	public static void playerStats() {
		
		System.out.println("-----------------------------------\n");
		System.out.println("Adýn : " + EntityManager.getName(Entity.Player));
		System.out.println("Senin Canýn : " + EntityManager.getHealth(Entity.Player));
		System.out.println("Senin Enerjin : " + EntityManager.getEnergy(Entity.Player) + "\n");
		System.out.println("-----------------------------------\n");
		
	}
	
	public static void enemyStats() {
		System.out.println("-----------------------------------\n");
		System.out.println("Düþmanýn Adý : " + EntityManager.getName(Entity.Enemy));
		System.out.println("Düþmanýn Enerjisi : " + EntityManager.getHealth(Entity.Enemy));
		System.out.println("Düþmanýn Enerjisi : " + EntityManager.getEnergy(Entity.Enemy) + "\n");
		System.out.println("-----------------------------------\n");
	}
	
	public static void EnemyStats() {
		
		System.out.println("-----------------------------------\n");
		System.out.println("Düþmanýn Adý: " + EntityManager.getName(Entity.Enemy));
		System.out.println("Düþmanýn Caný: " + EntityManager.getHealth(Entity.Enemy));
		System.out.println("Düþmanýn Enerjisi: " + EntityManager.getEnergy(Entity.Enemy) + "\n");
		System.out.println("-----------------------------------\n");
		
	}
	
	public static void attack() {
		int i;
		int sayi = 0;
		System.out.println("---------------------------------------------------------");
		System.out.println("| Weapon               Powers                           |");
		System.out.println("---------------------------------------------------------");
		System.out.print("| 1) Kes              2) " + InventoryManager.usingPowers.get(0) + "\n");
		sayi += 2;
		for(i = 1; i <= InventoryManager.usingPowers.size() - 1; i++) {
		System.out.print("|                     " + (sayi+1) + ") " + InventoryManager.usingPowers.get(i) + "\n");
		sayi++;
		}
		ist = sayi+1;
		System.out.println("---------------------------------------------------------");
	}
	/*if(slot == 3) {
		System.out.print("\n" + (i+1) + ") " + InventoryManager.inv.get(i));
	}
	else if(slot > 1) {
		System.out.print("          " + (i+1) + ") " + InventoryManager.inv.get(i));
	}
	else {
		System.out.print((i+1) + ") " + InventoryManager.inv.get(i));
	}
	slot++;*/
	public static void inventory() {
		int slot = 0;
		for (int i = 0; i<InventoryManager.inv.size(); i++) {
			if(InventoryManager.inv.get(i) != null) {
				if(slot == 3) {
					System.out.print("\n" + (i+1) + ") " + InventoryManager.inv.get(i));
					slot = 0;
				}
				else if(slot >= 1) {
					System.out.print("          " + (i+1) + ") " + InventoryManager.inv.get(i));
					slot++;
				}
				else {
					System.out.print((i+1) + ") " + InventoryManager.inv.get(i));
					slot++;
				}
				
			}
		}
	}
	
	public static void eylem() {
		System.out.println("\n------------------------------------\n");
		System.out.println("1) Oyna");
		System.out.println("2) Envanter");
		System.out.println("3) Geliþtirmeler");
		System.out.println("4) Çýk");
		System.out.println("\n------------------------------------");
		
	}

}

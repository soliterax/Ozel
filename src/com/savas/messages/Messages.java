package com.savas.messages;

import com.savas.Managers.ArenaManager;
import com.savas.Managers.BossManager;
import com.savas.Managers.BossManager.Boss;
import com.savas.Managers.InventoryManager;

@SuppressWarnings("unused")
public class Messages{
	
	public static int ist;
	
	public static void showArenas() {
		System.out.println("<----------------[ Arenalar ]---------------->");
		for(int i = 0; i< ArenaManager.arenas.size(); i++) {
			System.out.println((i+1) + ") " + ArenaManager.arenaName.get(ArenaManager.arenas.get(i)));
		}
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
	
	public static void stats(Boss bos) {
		System.out.println("\n------------------------------------");
		System.out.println("Düþmanýn Adý: " + BossManager.bossName.get(bos));
		System.out.println("Düþmanýn Caný: " + BossManager.bossHealth.get(bos));
		System.out.println("Düþmanýn Enerjisi: " + BossManager.bossEnergy.get(bos));
		System.out.println("Tehlike Seviyesi: " + BossManager.bossLevel.get(bos));
	}

}

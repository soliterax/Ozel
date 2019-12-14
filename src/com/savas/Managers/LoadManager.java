package com.savas.Managers;

import com.savas.Managers.InventoryManager.Types;
import com.savas.Managers.RingManager.Rings;
import com.savas.Managers.WeaponManager.Weapons;

import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

public class LoadManager {

	
	public static LinkedList<String> Tools = new LinkedList<String>();
	
	static void Systems() {
		
		new PowerManager();
		new EntityManager();
		new ArmManager();
		new WeaponManager();
		new RingManager();
		new ArenaManager();
		new LootManager();
		new BattleManager();
		new BossManager();
		new EffectManager();
		System.out.println("All System Loaded! Good Play Game :)");
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public static void setupAll() {
		Systems();
		Tools.addAll(WeaponManager.weaponList);
		Tools.addAll(PowerManager.nameList);
	}
	
	
	
	@SuppressWarnings("unused")
	private static void testTools() {
		InventoryManager.setWeapon(Weapons.Elementum_Sword);
		for(int i = 0; i < 5; i++) {
			InventoryManager.usingPowers.add(PowerManager.PowerList.get(PowerManager.nameList.get(i)));
		}
		InventoryManager.invAdd(RingManager.ringRawName.get(Rings.Blaze_Ring),Types.Ring);
		InventoryManager.invAdd(WeaponManager.weaponRawName.get(Weapons.Elementum_Sword),Types.Weapon);
		InventoryManager.invAdd(WeaponManager.weaponRawName.get(Weapons.Nyouboi), Types.Weapon);
		InventoryManager.invAdd(WeaponManager.weaponRawName.get(Weapons.Kanternka), Types.Weapon);
	}
	
	
	
	
}

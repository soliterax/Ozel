package com.savas.Managers;

import com.savas.Entity;
import com.savas.Tools.Rings;
import com.savas.Tools.Types;
import com.savas.Tools.Weapons;
import com.savas.messages.Messages;
import com.savas.messages.ToolsMessage;

import java.util.LinkedList;

public class LoadManager {

	
	public static LinkedList<String> Tools = new LinkedList<String>();
	
	public static void setupAll() {
		
		new PowerManager();
		new EntityManager();
		new ArmManager();
		new WeaponManager();
		new RingManager();
		new ArenaManager();
		new LootManager();
		Tools.addAll(WeaponManager.weaponList);
		Tools.addAll(PowerManager.nameList);
		
		//testTools();
		
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
	
	public static boolean attack(int index) {
		if(index == Messages.ist) {
			return true;
		}
		else if(Tools.get(index - 1) != null) {
			if(WeaponManager.weapon.get(Tools.get(index - 1)) == null) {
				if(ToolsMessage.sendMessage(PowerManager.PowerList.get(Tools.get(index - 1))) == true) {
					EntityManager.setEnergy(Entity.Player, EntityManager.getEnergy(Entity.Player) - PowerManager.energy.get(PowerManager.PowerList.get(Tools.get(index-1))));;
					EntityManager.setHealth(Entity.Enemy, EntityManager.getHealth(Entity.Enemy) - PowerManager.power.get(PowerManager.PowerList.get(Tools.get(index - 1))));
					if(EntityManager.getHealth(Entity.Enemy)<= 0) {
						return false;
					}
				}
			}
			else {
				if(ToolsMessage.sendMessage(WeaponManager.weapon.get(Tools.get(index - 1))) == true) {
					EntityManager.setHealth(Entity.Enemy, EntityManager.getHealth(Entity.Enemy) - WeaponManager.attackPower.get(WeaponManager.weapon.get(Tools.get(index - 1))));
					if(EntityManager.getHealth(Entity.Enemy)<= 0) {
						return false;
					}
				}
			}
			return true;
		}
		else {
			return false;
		}
	}
	
	
	
}

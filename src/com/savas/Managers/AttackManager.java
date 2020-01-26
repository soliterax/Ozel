package com.savas.Managers;

import com.savas.messages.ToolsMessage;

public class AttackManager {
	
	static WeaponManager weapons;
	static PowerManager powers;
	static InventoryManager inv;
	static EffectManager effects;
	static RingManager rings;
	static EntityManager entity;
	
	
	@SuppressWarnings("static-access")
	public static void saldiriWeapon() {
		
		ToolsMessage.sendMessage(inv.getWeapon());
		
	}
	
	@SuppressWarnings("static-access")
	public static void saldiriPower(int powerNumber) {
		
		ToolsMessage.sendMessage(inv.usingPowers.get(powerNumber-1));
		
	}
	
	
	//----------------------------------------------------------------------------------------------------------\\
	//                                                    |                                                     \\
	//                                                 Eklenti                                                  \\
	//                                                    |                                                     \\
	//----------------------------------------------------------------------------------------------------------\\
	
	public static void effectDamage() {
		
	}
	
	public static void effectBase() {
		
	}
	
	public static void accesoriesDamage() {
		
	}

}

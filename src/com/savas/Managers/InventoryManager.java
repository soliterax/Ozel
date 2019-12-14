package com.savas.Managers;

import java.util.HashMap;
import java.util.LinkedList;

import com.savas.Managers.ArmManager.Boots;
import com.savas.Managers.ArmManager.Chestplates;
import com.savas.Managers.ArmManager.Helmets;
import com.savas.Managers.ArmManager.Leggings;
import com.savas.Managers.PowerManager.Powers;
import com.savas.Managers.RingManager.Rings;
import com.savas.Managers.WeaponManager.Weapons;

public class InventoryManager {
	//Kullanilan Armorlar
	private static Helmets usingHelmet;
	private static Chestplates usingChestplate;
	private static Leggings usingLegging;
	private static Boots usingBoot;
	private static Weapons usingWeapon;
	//Maximum ne kadar olcagi burda
	public static Integer maxSlot = 30;
	public static Integer maxUsingPowers = 5;
	public static Integer maxUsingRings = 5;
	//Envanterde gozukmeyen sahip olunan seyler
	public static LinkedList<Powers> havingPowers = new LinkedList<Powers>();
	public static LinkedList<Rings> havingRings = new LinkedList<Rings>();
	//Envanter isleri
	public static LinkedList<String> inv = new LinkedList<String>();
	public static HashMap<String,Types> invTypes = new HashMap<String,Types>();
	//Kullanýlan ayrý þeyler
	public static LinkedList<Powers> usingPowers = new LinkedList<Powers>();
	public static LinkedList<Rings> usingRings = new LinkedList<Rings>();
	
	public static void setHelmet(Helmets helmet) {
		if(inv.contains(ArmManager.helmetRawName.get(helmet))) {
			inv.remove(inv.indexOf(ArmManager.helmetRawName.get(helmet)));
			usingHelmet = helmet;
		}
		else {
			return;
		}
	}
	
	public static void setChestplate(Chestplates cp) {
		if(inv.contains(ArmManager.chestplateRawName.get(cp))) {
			inv.remove(inv.indexOf(ArmManager.chestplateRawName.get(cp)));
			usingChestplate = cp;
		}
		else {
			return;
		}
	}
	
	public static void setLegging(Leggings leg) {
		if(inv.contains(ArmManager.leggingRawName.get(leg))) {
			inv.remove(inv.indexOf(ArmManager.leggingRawName.get(leg)));
			usingLegging = leg;
		}
		else {
			return;
		}
	}
	
	public static void setBoot(Boots bot) {
		if(inv.contains(ArmManager.bootRawName.get(bot))) {
			inv.remove(inv.indexOf(ArmManager.bootRawName.get(bot)));
			usingBoot = bot;
		}
		else {
			return;
		}
	}
	
	public static void setWeapon(Weapons weapon) {
		if(inv.contains(WeaponManager.weaponRawName.get(weapon))) {
			inv.remove(inv.indexOf(WeaponManager.weaponRawName.get(weapon)));
			usingWeapon = weapon;
		}
		else {
			return;
		}
	}
	
	public static Helmets getHelmet() {
		return usingHelmet;
	}
	
	public static Chestplates getChestplates() {
		return usingChestplate;
	}
	
	public static Leggings getLegging() {
		return usingLegging;
	}
	
	public static Boots getBoot() {
		return usingBoot;
	}

	public static Weapons getWeapon() {
		return usingWeapon;
	}
	
	public static void invAdd(String Tool,Types type) {
		if(inv.size() + 1  <= maxSlot) {
			inv.add(Tool);
			invTypes.put(Tool, type);
		}
		else {
			return;
		}
	}
	
	public static void invRemove(String Tool) {
		
		if(inv.size() != 0) {
			invTypes.remove(inv.get(inv.indexOf(Tool)));
			inv.remove(inv.indexOf(Tool));
			
		}
		
	}
	
	public static void usePower(Powers power) {
		if(usingPowers.size() +1 <= maxUsingPowers) {
			usingPowers.add(power);
		}
		else return;
	}
	
	public static void useRing(Rings ring) {
		if(inv.contains(RingManager.ringRawName.get(ring)) && usingRings.size() + 1 <= maxUsingRings) {
			inv.remove(inv.indexOf(RingManager.ringRawName.get(ring)));
			usingRings.add(RingManager.rings.get(RingManager.ringRawName.get(ring)));
		}
		else return;
	}
	
	public static void deusePower(Powers power) {
		if(usingPowers.size() - 1 != -1) {
			usingPowers.remove(usingPowers.indexOf(power));
		}
	}
	
	public static void deuseRing(Rings ring) {
		if(usingRings.size() - 1 != -1) {
			inv.add(RingManager.ringRawName.get(ring));
			usingRings.remove(usingRings.indexOf(ring));
		}
		else return;
	}
	
	public enum Types {
		Weapon,Arm,Ring,Power;

	}
	
}

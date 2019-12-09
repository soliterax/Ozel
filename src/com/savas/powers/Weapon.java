package com.savas.powers;

import com.savas.Managers.WeaponManager;
import com.savas.Tools.Weapons;

public class Weapon {
	
	public static void addWeapon(String Name, Weapons weapon, int attackPower) {
		WeaponManager.weaponList.add(Name);
		WeaponManager.weaponRawName.put(weapon, Name);
		WeaponManager.weapon.put(Name, weapon);
		WeaponManager.attackPower.put(weapon, attackPower);
	}

}

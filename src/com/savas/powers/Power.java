package com.savas.powers;

import com.savas.Managers.PowerManager;
import com.savas.Tools.Powers;

public class Power {
	
	public static void addPower(String name, Powers special, int attackPower, int energy_Count) {
		PowerManager.nameList.add(name);
		PowerManager.PowerList.put(name, special);
		PowerManager.power.put(special, attackPower);
		PowerManager.energy.put(special, energy_Count);
	}

}

package com.savas.powers;

import com.savas.Managers.RingManager;
import com.savas.Tools.Rings;

public class Ring {
	
	public static void addRing(String name, Rings ring,int boostPower,int boostHealth,int boostDefense, int boostEnergy) {
		
		RingManager.ring.add(name);
		RingManager.ringRawName.put(ring, name);
		RingManager.rings.put(name, ring);
		RingManager.boostAttack.put(ring, boostPower);
		RingManager.boostHealth.put(ring, boostHealth);
		RingManager.boostDefense.put(ring, boostDefense);
		RingManager.boostEnergy.put(ring, boostEnergy);
		
	}
	
}

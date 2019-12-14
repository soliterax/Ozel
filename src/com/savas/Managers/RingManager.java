package com.savas.Managers;

import java.util.HashMap;
import java.util.LinkedList;
public class RingManager {
	
	public static LinkedList<String> ring = new LinkedList<String>();
	public static HashMap<Rings,String> ringRawName = new HashMap<Rings,String>();
	public static HashMap<String,Rings> rings = new HashMap<String,Rings>();
	public static HashMap<Rings,Integer> boostHealth = new HashMap<Rings,Integer>();
	public static HashMap<Rings,Integer> boostAttack = new HashMap<Rings,Integer>();
	public static HashMap<Rings,Integer> boostDefense = new HashMap<Rings,Integer>();
	public static HashMap<Rings,Integer> boostEnergy = new HashMap<Rings,Integer>();
	
	public RingManager() {
		
		addRing("Blaze Yüzüðü", Rings.Blaze_Ring, 50, -25, 5, 200);
		
	}
	
	public static void addRing(String name, Rings ring,int boostPower,int boostHealth,int boostDefense, int boostEnergy) {
		
		RingManager.ring.add(name);
		RingManager.ringRawName.put(ring, name);
		RingManager.rings.put(name, ring);
		RingManager.boostAttack.put(ring, boostPower);
		RingManager.boostHealth.put(ring, boostHealth);
		RingManager.boostDefense.put(ring, boostDefense);
		RingManager.boostEnergy.put(ring, boostEnergy);
		
	}
	
	public enum Rings {
		
		Blaze_Ring;

	}

}

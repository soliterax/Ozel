package com.savas.Managers;

import java.util.HashMap;
import java.util.LinkedList;

import com.savas.Tools.Rings;
import com.savas.powers.Ring;

public class RingManager {
	
	public static LinkedList<String> ring = new LinkedList<String>();
	public static HashMap<Rings,String> ringRawName = new HashMap<Rings,String>();
	public static HashMap<String,Rings> rings = new HashMap<String,Rings>();
	public static HashMap<Rings,Integer> boostHealth = new HashMap<Rings,Integer>();
	public static HashMap<Rings,Integer> boostAttack = new HashMap<Rings,Integer>();
	public static HashMap<Rings,Integer> boostDefense = new HashMap<Rings,Integer>();
	public static HashMap<Rings,Integer> boostEnergy = new HashMap<Rings,Integer>();
	
	public RingManager() {
		
		Ring.addRing("Blaze Yüzüðü", Rings.Blaze_Ring, 50, -25, 5, 200);
		
	}

}

package com.savas.Managers;

import java.util.HashMap;
import java.util.LinkedList;

public class PowerManager {

	public static LinkedList<String> nameList = new LinkedList<String>();
	public static HashMap<String,Powers> PowerList = new HashMap<String,Powers>();
	public static HashMap<Powers,Integer> power = new HashMap<Powers,Integer>();
	public static HashMap<Powers,Integer> energy = new HashMap<Powers,Integer>();
	
	public PowerManager() {
		/**
		 * Örnektir
		 * 
		 * AllPower.addPower(Saldýrýnýn Adý, Saldýrý, Saldýrýnýn Gücü, Saldýrýnýn harcadýðý enerji);
		 * 
		 * */
		addPower("Kamehameha", Powers.Kamehameha, 500, 250);
		addPower("Fýrtýna", Powers.Fýrtýna, 200, 50);
		addPower("Ouch Kamehameha", Powers.Ouch_Kamehameha, 1000, 900);
		addPower("Lavlý Yumruk", Powers.Lavlý_Yumruk, 100, 30);
		addPower("Iþýnlanan Hançer", Powers.Iþinlanan_Hancer, 100, 25);
		addPower("Deprem", Powers.Earthquick, 50, 100);
		addPower("Aslan Pençesi", Powers.Lion_Slash, 500, 200);
		addPower("Dondurucu Su", Powers.Water_Freezer, 400, 150);
		addPower("Soul Seal", Powers.Soul_Seal, 300, 70);
		addPower("Dragon Rage", Powers.Dragon_Rage, 350, 80);
		addPower("Fantastic Power Beam", Powers.Fantastic_Power_Beam, 700, 1200);
	}
	
	public static void addPower(String name, Powers special, int attackPower, int energy_Count) {
		PowerManager.nameList.add(name);
		PowerManager.PowerList.put(name, special);
		PowerManager.power.put(special, attackPower);
		PowerManager.energy.put(special, energy_Count);
	}
	
	public enum Powers {

		Kamehameha, 
		Fýrtýna, 
		Ouch_Kamehameha, 
		Lavlý_Yumruk, 
		Iþinlanan_Hancer, 
		Earthquick, 
		Lion_Slash, 
		Water_Freezer,
		Soul_Seal, 
		Dragon_Rage, 
		Fantastic_Power_Beam;

	}
}

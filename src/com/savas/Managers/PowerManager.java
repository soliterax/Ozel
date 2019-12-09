package com.savas.Managers;

import java.util.HashMap;
import java.util.LinkedList;

import com.savas.Tools.Powers;
import com.savas.powers.Power;

public class PowerManager {

	public static LinkedList<String> nameList = new LinkedList<String>();
	public static HashMap<String,Powers> PowerList = new HashMap<String,Powers>();
	public static HashMap<Powers,Integer> power = new HashMap<Powers,Integer>();
	public static HashMap<Powers,Integer> energy = new HashMap<Powers,Integer>();
	
	public static void setupPowers() {
		/**
		 * Örnektir
		 * 
		 * AllPower.addPower(Saldýrýnýn Adý, Saldýrý, Saldýrýnýn Gücü, Saldýrýnýn harcadýðý enerji);
		 * 
		 * */
		Power.addPower("Kamehameha", Powers.Kamehameha, 500, 250);
		Power.addPower("Fýrtýna", Powers.Fýrtýna, 200, 50);
		Power.addPower("Ouch Kamehameha", Powers.Ouch_Kamehameha, 1000, 900);
		Power.addPower("Lavlý Yumruk", Powers.Lavlý_Yumruk, 100, 30);
		Power.addPower("Iþýnlanan Hançer", Powers.Iþinlanan_Hancer, 100, 25);
		Power.addPower("Deprem", Powers.Earthquick, 50, 100);
		Power.addPower("Aslan Pençesi", Powers.Lion_Slash, 500, 200);
		Power.addPower("Dondurucu Su", Powers.Water_Freezer, 400, 150);
		Power.addPower("Soul Seal", Powers.Soul_Seal, 300, 70);
		Power.addPower("Dragon Rage", Powers.Dragon_Rage, 350, 80);
		Power.addPower("Fantastic Power Beam", Powers.Fantastic_Power_Beam, 700, 1200);
	}
}

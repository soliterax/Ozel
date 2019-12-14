package com.savas.messages;

import java.util.concurrent.TimeUnit;

import com.savas.Managers.PowerManager.Powers;
import com.savas.Managers.WeaponManager.Weapons;

public class ToolsMessage{
	
	public static boolean sendMessage(Powers power) {
		
		try {
			if(power == Powers.Kamehameha) {
				
				System.out.println("\nKA\n");
				TimeUnit.SECONDS.sleep(1);
				System.out.println("ME\n");
				TimeUnit.SECONDS.sleep(2);
				System.out.println("HA ME\n");
				TimeUnit.SECONDS.sleep(4);
				System.out.println("HAAA!\n");
				System.out.print(">");
				for(int i = 0; i<= 10; i++) {
					System.out.print("==");
					TimeUnit.MILLISECONDS.sleep(250);
				}
				System.out.print("    KaBooom");
				TimeUnit.SECONDS.sleep(1);
				
			}
			
		}
		catch(InterruptedException e) {
			
		}
		for(int a = 0; a<50; a++) System.out.println();
		return true;
	}
	
	public static boolean sendMessage(Weapons weapon) {
		try {
			
			if(weapon == Weapons.Elementum_Sword) {
				String bosluk = "";
				for(int i = 0; i<= 20; i++) {
					for(int a = 0; a<50; a++) System.out.println();
					bosluk += " ";
					System.out.println(bosluk + ">>");
					TimeUnit.MILLISECONDS.sleep(150);
				}
				for(int a = 0; a<50; a++) System.out.println();
				System.out.println(bosluk + "Slash!!");
				TimeUnit.SECONDS.sleep(1);
				for(int a = 0; a<50; a++) System.out.println();
			}
			return true;
		}
		catch(InterruptedException e) {
			
		}
		return true;
	}

}

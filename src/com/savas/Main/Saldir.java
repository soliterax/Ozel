package com.savas.Main;

import com.savas.Managers.BossManager;
import com.savas.Managers.GameManager;
import com.savas.Managers.LoadManager;
import com.savas.Managers.BossManager.Boss;
import com.savas.messages.Messages;

public class Saldir {
	
	private static boolean test = false;
	
	public static void main(String[] args) {
		
		System.out.println("Systems loading please wait...");
		
		if(test == false) {
		new GameManager();
		
		System.out.println("Oyun bitti OYnad���n�z i�in te�ekk�r ederiz.");
		}
		else {
			new LoadManager();
			Messages.inventory();
			Messages.attack();
			Messages.eylem();
			Messages.showArenas();
			Messages.stats(Boss.Haxtar);
			
		}
	}

}

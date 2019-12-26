package com.savas.Main;

import com.savas.Managers.BossManager;
import com.savas.Managers.GameManager;
import com.savas.Managers.LoadManager;
import com.savas.messages.Messages;

public class Saldir {
	
	private static boolean test = true;
	
	public static void main(String[] args) {
		
		System.out.println("Systems loading please wait...");
		
		if(test == false) {
		GameManager.Start();
		
		System.out.println("Oyun bitti OYnadığınız için teşekkür ederiz.");
		}
		else {
			new LoadManager();
			Messages.inventory();
		}
	}

}

package com.savas.Managers;

import java.util.Scanner;

import com.savas.Managers.EntityManager.Entity;
import com.savas.messages.Messages;

public class GameManager {
	
	private static Scanner input = new Scanner(System.in);
	
	private static int secme = 0;
	
	public GameManager() {
		
		new LoadManager();
		
		System.out.println("Adýnýzý Söylermisiniz ?");
		String name =input.nextLine();
		
		EntityManager.setName(Entity.Player, name);
		while(true) {
			Messages.eylem();
			secme = input.nextInt();
			
			if(secme == 1) {
				new BattleManager();
			}
			else if(secme == 2) {
				Messages.inventory();
			}
			else if(secme == 3) {
				System.out.println("Henüz kullanýma açýlmamýþtýr..");
			}
			else {
				return;
			}
			
		}
		
		
	}

}

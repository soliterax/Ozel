package com.savas.Managers;

import java.util.Scanner;

import com.savas.Managers.EntityManager.Entity;
import com.savas.messages.Messages;

public class GameManager {
	
	private static Scanner input = new Scanner(System.in);
	
	private static int secme;
	
	public static void Start() {
		
		new LoadManager();
		
		System.out.println("Adınızı Söylermisiniz ?");
		EntityManager.setName(Entity.Player, input.nextLine());
		while(true) {
			Messages.eylem();
			secme = input.nextInt();
			if(secme == 1) {
				new BattleManager();
			}
			
		}
		
		
	}

}

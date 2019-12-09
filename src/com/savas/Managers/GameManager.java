package com.savas.Managers;

import java.util.Scanner;

import com.savas.Entity;
import com.savas.messages.Messages;

public class GameManager {
	
	private static Scanner input = new Scanner(System.in);
	
	private static int secme;
	private static boolean gamecontinue = true;
	
	public static void Start() {
		LoadManager.setupAll();
		System.out.println("Adýnýzý Söylermisiniz ?");
		EntityManager.setName(Entity.Player, input.nextLine());
		
		Messages.eylem();
		secme = input.nextInt();
		
		while(gamecontinue == true) {
			
			if(secme == 1) {
				BattleManager.Battle();
				input.nextLine();
				Messages.eylem();
				secme = input.nextInt();
				continue;
			}
			else if (secme == 2) {
				Messages.inventory();
				input.nextLine();
				
				Messages.eylem();
				secme = input.nextInt();
				continue;
			}
			else if (secme == 3) {
				
			}
			else if (secme == 4) {
				gamecontinue = false;
				break;
			}
			else break;
		}
		
		input.close();
		
	}

}

package com.savas.Managers;

import java.awt.Color;
import java.util.Random;
import java.util.Scanner;

import com.savas.Extensions.Colors;
import com.savas.Managers.BossManager.Boss;
import com.savas.Managers.EntityManager.Entity;
import com.savas.messages.Messages;

public class BattleManager {
	
	static Random rand = new Random();
	static Scanner input = new Scanner(System.in);
	
	static Boss chooseBoss() {
		
		return BossManager.boss.get(rand.nextInt(BossManager.boss.size()) - 1);
		
	}
	
	
	public BattleManager() {
		
		Messages.showArenas();
		System.out.println("\nLütfen hangi Arenada Savaþýcaðýnýzý seçiniz..");
		ArenaManager.joinedArena = ArenaManager.arenas.get(input.nextInt() - 1);
		while(true) {
			
			Messages.attack();
			System.out.println("Lütfen saldýrý seçiniz!");
			int saldiri = input.nextInt();
			
			switch(saldiri){
				case 1:
					  
					break;
				default:
					
					break;
			}
			if(EntityManager.getHealth(Entity.Enemy) <= 0) {
				
				break;
			}
			if(EntityManager.getHealth(Entity.Player) <= 0) {
				System.err.println("[Oldun]");
				break;
			}
			
		}
		
		
	}
	

}

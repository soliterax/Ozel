package com.savas.Managers;

import java.util.LinkedHashSet;
import java.util.Random;

import com.savas.Managers.BossManager.Boss;
import com.savas.messages.Messages;

public class BattleManager {
	
	static Random rand = new Random();
	
	static Boss chooseBoss() {
		
		return BossManager.boss.get(rand.nextInt(BossManager.boss.size()) - 1);
		
	}
	
	
	public static void Battle() {
		
	
		Messages.attack();
		
		
	}
	

}

package com.savas.powers;

import com.savas.Managers.ArmManager;
import com.savas.Tools.Boots;
import com.savas.Tools.Chestplates;
import com.savas.Tools.Helmets;
import com.savas.Tools.Leggings;

public class Arm {
	
	public static void addHelmet(String name, Helmets helmet, int defense) {
		
		ArmManager.helmetName.add(name);
		ArmManager.helmetRawName.put(helmet,name);
		ArmManager.helmet.put(name, helmet);
		ArmManager.helmetDefense.put(helmet, defense);
		
	}
	
	public static void addChestplate(String name,Chestplates cp,int defense) {
		
		ArmManager.chestplateName.add(name);
		ArmManager.chestplateRawName.put(cp, name);
		ArmManager.chestplate.put(name, cp);
		ArmManager.chestplateDefense.put(cp, defense);
		
	}
	
	public static void addLegging(String name,Leggings legging,int defense) {
		
		ArmManager.leggingName.add(name);
		ArmManager.leggingRawName.put(legging, name);
		ArmManager.legging.put(name, legging);
		ArmManager.leggingDefense.put(legging, defense);
		
	}
	
	public static void addBoot(String name, Boots boot, int defense) {
		
		ArmManager.bootName.add(name);
		ArmManager.bootRawName.put(boot, name);
		ArmManager.boot.put(name, boot);
		ArmManager.bootDefense.put(boot, defense);
		
	}
	
	

}

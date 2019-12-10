package com.savas.Managers;

import java.util.HashMap;
import java.util.LinkedList;

import com.savas.Tools.Boots;
import com.savas.Tools.Chestplates;
import com.savas.Tools.Helmets;
import com.savas.Tools.Leggings;

public class ArmManager {
	
	public static LinkedList<String> helmetName = new LinkedList<String>();
	public static HashMap<Helmets,String> helmetRawName = new HashMap<Helmets,String>();
	public static HashMap<String,Helmets> helmet = new HashMap<String,Helmets>();
	public static HashMap<Helmets,Integer> helmetDefense = new HashMap<Helmets,Integer>();
	
	public static LinkedList<String> chestplateName = new LinkedList<String>();
	public static HashMap<Chestplates,String> chestplateRawName = new HashMap<Chestplates,String>();
	public static HashMap<String,Chestplates> chestplate = new HashMap<String,Chestplates>();
	public static HashMap<Chestplates,Integer> chestplateDefense = new HashMap<Chestplates,Integer>();
	
	public static LinkedList<String> leggingName = new LinkedList<String>();
	public static HashMap<Leggings,String> leggingRawName = new HashMap<Leggings,String>();
	public static HashMap<String,Leggings> legging = new HashMap<String,Leggings>();
	public static HashMap<Leggings,Integer> leggingDefense = new HashMap<Leggings,Integer>();
	
	public static LinkedList<String> bootName = new LinkedList<String>();
	public static HashMap<Boots,String> bootRawName = new HashMap<Boots,String>();
	public static HashMap<String,Boots> boot = new HashMap<String,Boots>();
	public static HashMap<Boots,Integer> bootDefense = new HashMap<Boots,Integer>();
	
	public ArmManager() {
		
		
		
	}

}

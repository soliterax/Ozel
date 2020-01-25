package com.savas.Managers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class DataManager {
	
	File file = new File("");
	
	
	public void SaveData() {
		
	}
	
	public void GetAllData() {
		try {
			FileInputStream fis = new FileInputStream(file);
		}catch(FileNotFoundException e) {
			System.err.println("");
		}
	}
	
}

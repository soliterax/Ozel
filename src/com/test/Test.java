package com.test;

import com.savas.Managers.InventoryManager;
import com.savas.Managers.LoadManager;
import com.savas.messages.Messages;

@SuppressWarnings("unused")
public class Test {

	public static void main(String[] args) {
		LoadManager.setupAll();
		Messages.showArenas();

	}

}

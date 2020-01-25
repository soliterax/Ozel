package com.savas.Exceptions;

public class PlayerNameNullException extends NullPointerException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -9014767631740619784L;

	@Override
	public void printStackTrace() {
		System.out.println("player name is a null pls write a name!");
	}

	public PlayerNameNullException(String message) {
		super(message);
	}

}

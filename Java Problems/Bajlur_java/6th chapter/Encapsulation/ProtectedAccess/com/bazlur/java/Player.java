package com.bazlur.java;

public class Player {
	protected String playerName;
	
	public String getPlayer(){
		return playerName;
	}
	
	public void setPlayer(String playerName){
		this.playerName = playerName;
	}
	
	protected void display(){
		System.out.println("Player Name: "+ playerName);
	}
}


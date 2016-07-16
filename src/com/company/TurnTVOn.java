package com.company;

import com.company.Command;
import com.company.ElectronicDevice;

public class TurnTVOn implements Command {

	ElectronicDevice theDevice;

	public TurnTVOn(ElectronicDevice theDevice){
		this.theDevice = theDevice;
	}

	
	public void execute (){
		theDevice.on(); 
	}
}
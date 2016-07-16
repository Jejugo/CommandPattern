package com.company;

import com.company.Command;
import com.company.ElectronicDevice;

public class TurnTVOff implements Command {

	ElectronicDevice theDevice;

	public TurnTVOff(ElectronicDevice theDevice){
		this.theDevice = theDevice;
	}

	
	public void execute (){
		theDevice.off(); 
	}
}
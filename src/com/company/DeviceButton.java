package com.company;

import com.company.Command;

public class DeviceButton{

	Command theCommand;

	public DeviceButton(Command newCommand){
		this.theCommand = newCommand;
	}

	public void press(){
		theCommand.execute();	
	}
}
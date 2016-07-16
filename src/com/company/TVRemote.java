package com.company;

import com.company.ElectronicDevice;
import com.company.Television;

public class TVRemote{

	public static ElectronicDevice getDevice(){
		return new Television();
	}
}
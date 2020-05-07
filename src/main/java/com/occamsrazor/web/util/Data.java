package com.occamsrazor.web.util;

import java.io.File;

public enum Data {
	ADMINS, USERS, ITEMS;
	
	
	@Override
	public String toString() {
		String path = "C:"+File.separator+"Users"+File.separator+"user"+File.separator
				+"git"+File.separator+"repository4"+File.separator+"occamsrazor-2"+File.separator
				+"src"+File.separator+"main"+File.separator+"resources"+File.separator
				+"static"+File.separator+"resources"+File.separator+"file"+File.separator; 
		switch(this) {
		case ADMINS: path = path.concat("admin_list.csv"); break;
		case USERS: path = path.concat("user_list.csv"); break;
		case ITEMS: path = path.concat("lost.csv"); break;
		default:
			break;
		}
		return path;
	}
}
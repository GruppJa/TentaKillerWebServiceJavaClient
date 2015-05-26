package org.tentakiller.controller;

import java.rmi.RemoteException;

import org.tentakiller.show.WebServiceSoapProxy;

public class Controller {
	
	WebServiceSoapProxy client = new WebServiceSoapProxy();
	
	public String[][] getStudents() {
		
		String[][] students = null;
		
		try {
			students = client.getStudents();
		} 
		catch (RemoteException e) {
			e.printStackTrace();
		}		
		return students;
	}
}

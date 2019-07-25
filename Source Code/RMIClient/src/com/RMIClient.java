package com;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RMIClient {
	
	public void doRMICall() {
		
		RMIInterface obj;
		
		final String ip = "localhost";
		final int port = 1091;
		final String bindLocationBasePath = "rmi://"+ip+":"+port+"/test";
		
		try {
			obj = (RMIInterface) Naming.lookup(bindLocationBasePath);
			obj.doJNICall();
		} catch (MalformedURLException | RemoteException | NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}

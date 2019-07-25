package com;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIServer {
	
	public static void main(String[] args) throws RemoteException, MalformedURLException {
		
		RMIInterface obj = new RMIInterfaceImpl();
		
		final String ip = "localhost";
		final int port = 1091;
		final String bindLocationBasePath = "rmi://"+ip+":"+port+"/test";
		
		 try { // special exception handler for registry creation
	           	LocateRegistry.createRegistry(port); 
	            Naming.rebind(bindLocationBasePath, obj);
	            System.out.println("RMI Server Ready. Service at "+bindLocationBasePath);
		           
	            
	        } catch (RemoteException e) {
	            // do nothing, error means registry already exists
	            System.out.println("java RMI registry already exists.");
	        } 
		
		
	}
	
}

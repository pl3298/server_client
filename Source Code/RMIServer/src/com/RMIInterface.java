package com;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RMIInterface extends Remote{
	

	
	
	public void doJNICall() throws RemoteException;
	
}

package com;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RMIInterfaceImpl extends UnicastRemoteObject implements RMIInterface{

	public RMIInterfaceImpl() throws RemoteException {}

	@Override
	public void doJNICall() throws RemoteException {
		new JNICall().helloC();
	}

	
	
	
}

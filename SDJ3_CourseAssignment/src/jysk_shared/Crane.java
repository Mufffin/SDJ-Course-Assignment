package jysk_shared;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Crane extends Remote {

	public void storePallet(Pallet pallet) throws RemoteException;
	
	public String getCraneID();
	
	void registerPickStation(PickStation pc);

	boolean retrievePallet(String pickstationID, int orderID, String type) throws RemoteException;

}

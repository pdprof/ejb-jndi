package pdprof.ejb.view;

import java.rmi.RemoteException;

import javax.ejb.CreateException;
import javax.ejb.EJBHome;

public interface HelloRemoteHome extends EJBHome {

	public HelloRemoteComponent create() throws CreateException, RemoteException;
	
}

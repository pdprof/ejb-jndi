import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.rmi.PortableRemoteObject;

import pdprof.ejb.view.HelloRemote;

public class Main {
	public static void main(String[] args) {
		try {
			
			/*
			 * https://www.ibm.com/docs/ja/was-liberty/base?topic=liberty-using-enterprise-javabeans-remote-interfaces
			 */
	        InitialContext ic = new InitialContext();
	        Object found = ic.lookup("java:global/ejb-ear/ejb-lib/Hello!pdprof.ejb.view.HelloRemote");
	        HelloRemote bean = (HelloRemote)PortableRemoteObject.narrow(found, HelloRemote.class);
	        System.out.println("Ejb msg: " + bean.hello());
		} catch (NamingException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/* (non-Java-doc)
	 * @see java.lang.Object#Object()
	 */
	public Main() {
		super();
	}

}
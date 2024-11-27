import javax.ejb.EJB;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.rmi.PortableRemoteObject;

import pdprof.ejb.view.HelloRemote;

public class Main {
	
	public static void main(String[] args) {

		InitialContext context = null;
		try {
			context = new InitialContext();
		} catch (NamingException e) {
			e.printStackTrace();
		}
		hello(context);
		
	}
	
	public static void hello(InitialContext context) {
		
		String targetList[] = { 
				"java:global/ejb-ear/ejb-lib/Hello!pdprof.ejb.view.HelloRemote",
				"java:app/ejb-lib/Hello!pdprof.ejb.view.HelloRemote",
				"ejb/ejb-ear/ejb-lib.jar/Hello#pdprof.ejb.view.HelloRemote",
				"java:comp/env/twas/ejb/Hello",
				"ejb/global/ejb-ear/ejb-lib/Hello!pdprof.ejb.view.HelloRemote",
				"java:comp/env/liberty/ejb/Hello"
		};
		
		for (String target: targetList) {
			try {
				Object helloObj = context.lookup(target);
				HelloRemote hello= (HelloRemote) PortableRemoteObject.narrow(helloObj, HelloRemote.class);
				System.out.println(hello.hello() + " from lookup " + target);
			} catch (Exception e) {
				System.out.println("***** Failed in lookup " + target);
				if (isDebug()) {
					e.printStackTrace();
				}
			}
		}
		
	}

	public static boolean isDebug() {
		if (System.getProperty("pdprof.debug") != null ) {
			if (System.getProperty("pdprof.debug").equalsIgnoreCase("true")) {
				return true;
			}
		}
		return false;
	}
	/* (non-Java-doc)
	 * @see java.lang.Object#Object()
	 */
	public Main() {
		super();
	}

}
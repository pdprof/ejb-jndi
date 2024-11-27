import javax.ejb.EJB;

import pdprof.ejb.view.HelloRemote;

public class Main {
	
	@EJB(name = "ejb/Hello")
	static HelloRemote hello;
	
	public static void main(String[] args) {

		try {
			System.out.println(hello.hello() + " from lookup @EJB annotation");
		} catch (Exception e) {
			System.out.println("***** Failed in lookup @EJB annotation");
			if (isDebug()) {
				e.printStackTrace();
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
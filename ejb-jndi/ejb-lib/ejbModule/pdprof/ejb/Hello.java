package pdprof.ejb;

import javax.ejb.Remote;
import javax.ejb.RemoteHome;
import javax.ejb.Stateless;
import pdprof.ejb.view.HelloRemote;
import pdprof.ejb.view.HelloRemoteHome;

/**
 * Session Bean implementation class Hello
 */
@Stateless(mappedName = "ejb/Hello")
@Remote(HelloRemote.class)
@RemoteHome(HelloRemoteHome.class)
public class Hello implements HelloRemote {

    /**
     * Default constructor. 
     */
    public Hello() {
        // TODO Auto-generated constructor stub
    }
    
    public String hello() {
    	return "Hello!!";
    }

}

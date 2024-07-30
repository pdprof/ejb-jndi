package pdprof.ejb;

import javax.ejb.Local;
import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import pdprof.ejb.view.HelloLocal;
import pdprof.ejb.view.HelloRemote;

/**
 * Session Bean implementation class Hello
 */
@Stateless
@Local(HelloLocal.class)
@Remote(HelloRemote.class)
@LocalBean
public class Hello implements HelloRemote, HelloLocal {

    /**
     * Default constructor. 
     */
    public Hello() {
        
    }
    
    public String hello() {
    	return "Hello !!";
    }

}

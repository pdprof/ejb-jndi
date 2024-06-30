package pdprof.jndi;

import java.io.IOException;
import java.net.URL;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PdprofJndiServlet
 */
@WebServlet("/PdprofJndiServlet")
public class PdprofJndiServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PdprofJndiServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			InitialContext ic = new InitialContext();
			String author = (String) ic.lookup("qiita/Author");
			URL qiita = (URL) ic.lookup("urls/Qiita");
			response.getWriter().append("URL: ").append(qiita.getProtocol()+"://" + qiita.getHost() + "/" + author);
		} catch (NamingException e) {
			response.getWriter().append("Served at: ").append(request.getContextPath());
			e.printStackTrace();
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

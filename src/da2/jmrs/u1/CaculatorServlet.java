package da2.jmrs.u1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import da2.jmrs.u1.Operation;

/**
 * Servlet implementation class CaculatorServlet
 */
@WebServlet("/CaculatorServlet")
public class CaculatorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CaculatorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		double valuex = Double.parseDouble(request.getParameter("valuex"));
		double valuey = Double.parseDouble(request.getParameter("valuey"));
		Operation operation = new Operation();
		operation.setValuex(valuex);
		operation.setValuey(valuey);
		operation.getResult();
		request.setAttribute("op", operation);
		RequestDispatcher dispacher = request.getRequestDispatcher("result.jsp");
		dispacher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

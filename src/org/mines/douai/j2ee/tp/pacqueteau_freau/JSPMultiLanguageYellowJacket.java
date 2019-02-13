package org.mines.douai.j2ee.tp.pacqueteau_freau;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JSPMultiLanguageYellowJacket
 */
@WebServlet("/JSPMultiLanguageYellowJacket")
public class JSPMultiLanguageYellowJacket extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JSPMultiLanguageYellowJacket() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String lang = request.getParameter("lang");
		RequestDispatcher req = request.getRequestDispatcher("/Default.jsp");
		if(lang != null)
		{
			if(lang.equals("fr"))
			{
				req = request.getRequestDispatcher("/YellowJacket-fr.jsp");
			}
			else if(lang.equals("en"))
			{
				req = request.getRequestDispatcher("/YellowJacket-en.jsp");
			}
		}
		req.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

package org.mines.douai.j2ee.tp.pacqueteau_freau;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

/**
 * Servlet implementation class TagLibMultiLangYellowJacketServlet
 */
@WebServlet("/TagLibMultiLangYellowJacketServlet")
public class TagLibMultiLangYellowJacketServlet extends TagSupport {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TagLibMultiLangYellowJacketServlet() {
        super();
    }

	@Override
	public int doStartTag() throws JspException {
		super.doStartTag();
		try {
			pageContext.getOut().println ("Hello World !");
		} catch (IOException e) {
			throw new JspException ("I/O Error", e);
		}
		return SKIP_BODY;
	}

}

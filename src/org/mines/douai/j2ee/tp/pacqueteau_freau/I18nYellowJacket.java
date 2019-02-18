package org.mines.douai.j2ee.tp.pacqueteau_freau;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

public class I18nYellowJacket extends TagSupport {
	private static final long serialVersionUID = 1L;
    
	private String key;
	
	
    public I18nYellowJacket() {
        super();
    }

	@Override
	public int doStartTag() throws JspException {
		super.doStartTag();
		try {
			this.pageContext.getOut().print(this.getStr());
		} catch (IOException e) {
			throw new JspException ("I/O Error", e);
		}
		return SKIP_BODY;
	}
	
	private String getStr() {
		if(this.pageContext.getRequest().getParameter("lang") == null)
		{
			return "Lang is null! Should be en or fr";
		}
		
		if(key.equals("lang"))
		{
			return this.pageContext.getRequest().getParameter("lang");
		}
		
		switch(this.pageContext.getRequest().getParameter("lang"))
		{
		case "fr":
			return this.fr();
		default:
			return this.en();
		}
	}
	
	
	private String fr() {
		switch(key)
		{
		case "Fre":
			return "France";
		case "Ale":
			return "Allemagne";
		case "Pol":
			return "Pologne";
		case "Submit":
			return "Valider";
		default:
			return "Unknown key: " + this.key;
		}
	}
	
	private String en() {
		switch(key)
		{
		case "Fre":
			return "French";
		case "Ale":
			return "Deutchland";
		case "Pol":
			return "Polska";
		case "Submit":
			return "Submit";
		default:
			return "Unknown key: " + this.key;
		}
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

}

package org.mines.douai.j2ee.tp.pacqueteau_freau;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

public class I18nYellowJacket extends TagSupport {
	private static final long serialVersionUID = 1L;
    
	
	private String lang;
	private String key;
	
	
    public I18nYellowJacket() {
        super();
    }

	@Override
	public int doStartTag() throws JspException {
		super.doStartTag();
		try {
			pageContext.getOut().println("HelloWorld Taglib");
			pageContext.getOut().println ("Lang: " + this.lang);
			pageContext.getOut().println("Key: " + this.key);
		} catch (IOException e) {
			throw new JspException ("I/O Error", e);
		}
		return SKIP_BODY;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

}

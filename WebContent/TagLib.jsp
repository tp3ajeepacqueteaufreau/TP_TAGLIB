<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="lang" uri="WEB-INF/tlds/tp.tld" %>
<%@ page import="java.util.Random" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form>
		<select name="list" >
			<option<%if("France".equals(request.getParameter("list"))){out.print(" selected");}%>><lang:I18nYellowJacket key="Fre"/></option>
			<option<%if("Pologne".equals(request.getParameter("list"))){out.print(" selected");}%>><lang:I18nYellowJacket key="Pol"/></option>
			<option<%if("Allemagne".equals(request.getParameter("list"))){out.print(" selected");}%>><lang:I18nYellowJacket key="Ale"/></option>
		</select>
		<input type="hidden" name="lang" value="<lang:I18nYellowJacket key='lang'/>"/>
	
		<input type="Submit" value="<lang:I18nYellowJacket key='Submit'/>"/>
	</form>
	<br />
	<br />
	<br />
	<br />
	<%
		if(request.getParameter("list")!= null){
			out.print("Nombre: ");
			int tmp = (new Random()).nextInt();
			out.println(String.valueOf((tmp<0)?tmp*(-1):tmp));
		}
	%>
	
</body>
</html>
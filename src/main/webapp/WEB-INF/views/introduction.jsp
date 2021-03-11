<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<t:defaultbody>
   <jsp:body>
	   <h1>Welcome to the LocaleLoader</h1>
	   <h3>LocaleLoader is Spring Boot project to implement Internationalization</h3>
	   <h4>This project can be implemented in following two ways</h4>
	   <ul>	
	   <li>Using properties file for messages of each Locale under classpath</li>
	   <li>Using database table to fetch the messages based on language</li>
	   </ul>
	   <a class="anchorButton" href="/localeSelection"> Click Here </a>
   </jsp:body>
</t:defaultbody>

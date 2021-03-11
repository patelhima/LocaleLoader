<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<t:defaultbody>
   <jsp:body>
	   	<h1>Select Locale and Proceed to view translated content</h1>
	    <select id="selectLocale">
		 	<option value="en">English</option>	
		 	<option value="de">German</option>
		 	<option value="fr">French</option>
		 	<option value="vi">Vietnamese</option>
		 	<option value="es">Spanish</option>
		 </select>
		
		 <div class="btn-container">
    		 <a href="/introduction"><button class="backButton"> Back </button></a>
    		<button class="nextButton" id="saveLocale"> Next </button>
  		</div>
   </jsp:body>
</t:defaultbody>

<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<link href="/styles/style.css" rel="stylesheet">
<t:genericpage>
    <jsp:attribute name="header">
		<%@ include file="../views/header.jsp" %>
    </jsp:attribute>
    <jsp:body>
	    <section>
	      <div class="uppersection fadeOut">
	      </div>
	
	      <div class="main-section"  id="mainContent">
	      	<jsp:doBody/>
	      </div>
	    </section>
    </jsp:body>
</t:genericpage>
<script type="text/javascript" src="/scripts/common/jquery-3.5.1.min.js"></script>
<script type="text/javascript" src="/scripts/app.js"></script>
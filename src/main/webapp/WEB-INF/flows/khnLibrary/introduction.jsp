<%-- Source project: sip05, branch: 03 (Maven Project) --%>
<!--khn: added subhead  -->
<%@ include file="/WEB-INF/jsp/taglibs.jspf" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" 
    "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html 
  xmlns:c="http://java.sun.com/jsp/jstl/core"
  xmlns:fmt="http://java.sun.com/jsp/jstl/fmt"
  xmlns:jsp="http://java.sun.com/JSP/Page"
  xmlns:spring="http://www.springframework.org/tags"
  xmlns:form="http://www.springframework.org/tags/form">
  
  
  <head><title>Introduction</title></head>
  
  <body>
    <h2>Introduction</h2>          
    <p>
      The library will be closed during the holidays<br/>
      as listed below 
      
    </p>
    <c:forEach items= "${holidays}" var="holiday" >
       <fmt:formatDate value="${holiday}" pattern="dd-MM-yyyy" />
       ${holiday}
       <br/>
    </c:forEach>
  
  
   <br/>
   <br/>
   <br/>
   <br/>
	<a href="${flowExecutionUrl}&_eventId=next">Next</a>
	 	&nbsp;&nbsp;&nbsp;&nbsp;
  </body>
</html>

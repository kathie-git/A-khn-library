<%-- Source project: sip05, branch: 03 (Maven Project) --%>
<%@ include file="/WEB-INF/jsp/taglibs.jspf" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN"
  "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html
  xmlns:c="http://java.sun.com/jsp/jstl/core"
  xmlns:jsp="http://java.sun.com/JSP/Page"
  xmlns:spring="http://www.springframework.org/tags"
  xmlns:form="http://www.springframework.org/tags/form">
  <heading><title>books found</title></heading>
  <body>
    <h2>books found</h2>
	<table border="1">
 	 <tr>
    	<th>ISBN</th>
    	<th>Book Name</th>
    	<th>Author</th>
   	    <th>Publish Date</th>
  	</tr>
 	 <c:forEach items="${booksFound}" var="book"> 
  	   <tr>
    	<td>
     	  <a href="${flowExecutionUrl}&_eventId=select&isbn=${book.isbn}">
      	    ${book.isbn}
     	  </a>
		</td>
        <td>${book.name}</td>
        <td>${book.author}</td>
       <%--  <td><fmt:formatDate value="${book.publishDate}" pattern="yyyy-MM-dd" /></td> --%>
 	   </tr>
 	</c:forEach>
	</table>
  </body>
</html>
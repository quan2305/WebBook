<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%@page import  = "HomeBook.model.Book"%>
<%@page import  = "HomeBook.model.Category_object"%>
<%@page import  = "java.util.List"%>

  
<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="style.css">
</head>
	
<body>


	
<h2>List Book</h2>
      <table border ="1" width="500" align="center">
         <tr bgcolor="00FF7F">
          <th><b>ID</b></th>
          <th><b>Title</b></th>
          <th><b>Author</b></th>
          <th><b>Published year</b></th>
          <th><b>Category ID</b></th>
         </tr>
        
        <%List<Book> std =  (List<Book>)request.getAttribute("listBook");
        for(Book b : std){%>
       
            <tr>
                <td><%=b.getId()%></td>
                <td><%=b.getTitle()%></td>
                <td><%=b.getAuthor()%></td>
                <td><%=b.getPublished_year()%></td>
                <td><%=b.getCategry_id()%></td>
            </tr>
            <%}%>
        </table> 
       
		<a href="/WebBook/home">Back</a>
	
</body>

</html>
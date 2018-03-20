<%@ page language="java" import="java.util.*"  contentType="text/html; charset=ISO-8859-1"  pageEncoding="ISO-8859-1"%>
<!DOCTYPE html> 
 <%pageContext.setAttribute("main-panel-title", "View My Crawler Task"); %>
<html>
 <%@include file="freg/head.jspf" %> 
 <body>  
  <div class="wrapper">
  
	<%@include file="freg/sidebar.jspf" %>

    <div class="main-panel">
    
		<%@include file="freg/navTitle.jspf" %>

		<!-- 内容占位符：主要的变化部分 -->
        <div class="content">
            <div class="container-fluid">
                <div class="row">
					
                </div>
            </div>
        </div>
 
	<%@include file="freg/footer.jspf" %> 
	
    </div>
  </div>
 
 </body>

 <%@include file="freg/scripts.jspf" %>
</html>


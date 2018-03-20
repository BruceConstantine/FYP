<%@ page language="java" import="java.util.*"  contentType="text/html; charset=ISO-8859-1"  pageEncoding="ISO-8859-1"%> 
<!DOCTYPE html> 
 <%pageContext.setAttribute("main-panel-title", "Crawler Flow Maker"); %>
<html>
 <%@include file="freg/head.jspf" %> <!-- base 已经在head.jspf里进行设置 -->
 <body>  
  <div class="wrapper">
  
	<%@include file="freg/sidebar.jspf" %>

    <div class="main-panel">
    
		<%@include file="freg/navTitle.jspf" %>

<style> 
.in-table-ele{ 
  margin-left:	90px;
  margin-top:	30px; 
  margin-bottom:30px; 
} 
</style>

        <div class="content">
            <div class="container-fluid">
            
            
				<!-- The Place will change  --> 
                <div class="row">
	                <table  width="100%" border="0">
	                  	<tr class="">
	                		<td colspan="2"> <span class="in-table-ele">Task Name</span> </td>
	                   		<td><input class="in-table-ele"  /></td> 
	                	</tr>
	                	
	                	<tr class="">
	                		<td colspan="2"> <span class="in-table-ele"> Task Type</span></td>
	                		<td>
	                			<select  class="in-table-ele">
	                				<option  value="type1">1</option>
	                				<option value="type2">2</option>
	                			</select>
	                		</td>
	                	</tr>
	                	
	                	<tr class="">
	                		<td colspan="2"> <span class="in-table-ele">Additional Notes</span></td>
	                		<td><textarea spellcheck="false" class="in-table-ele"></textarea></td>
	                	</tr>
	                	
	                	<tr class="">
	                		<td colspan="2"> <span class="in-table-ele">Start URL</span></td>
	                		<td><input class="in-table-ele"  /></textarea></td>
	                	</tr>
	                	
	                	<tr class="">
	                		<td colspan="2"> <span class="in-table-ele"> &nbsp; </span></td>
	                		<td><button  class="in-table-ele" value="">next step</button></td>
	                	</tr>
	                </table> 
				</div>
				<!-- END OF: The Place will change  --> 
				
				
             </div>
        </div>
    </div>
 
	<%@include file="freg/footer.jspf" %> 
	
    </div>
  </div>
 
 </body>

 <%@include file="freg/scripts.jspf" %>
</html>


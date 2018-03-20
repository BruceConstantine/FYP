<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"> 
<%pageContext.setAttribute("main-panel-title", "Login"); %> 
<%@include file="freg/head.jspf" %> 
<style> 
.input{
	width:300px; 
	border-radius: 8px;
	height:50px; 
	 border:0px;       /* 边框取消 */
}
.input:HOVER{
	background-color:rgba(221,223,199,0.27)
}
.signin{
	width:300px; 
	border-radius: 8px;
	height:50px;   
	border:0px;       /* 边框取消 */
}
.signin:HOVER {
	background-color:gray;
	color: white;
}

</style>
<body>  
  <div class="wrapper">
    <div class="main-panel" style="width:100%"> 
       <div class="row"  style="margin:10px 0 0 20%; padding:50px; width:60%; background-color:rgba(204,200,210,0.47); border-radius: 32px; " > 
       	 <center>    	
            <h1>
               Bruce's Web Collector Platform
			</h1> 
		  </center>
        </div> 
        <div class="content" >
            <div class="container-fluid"> 
                <div class="row" style="margin: 50px 50px 50px 20%; padding:50px; width:60%; background-color:#CDCDCD;  border-radius: 32px; " >
                	<center> 
                		<div class="col-xs-5">
                			<img src="resources/img/logo.png" style="width:300px; height:300px;">
                    	</div>   
		                <form action="login" method="post"> <!-- action="session_login.jsp" -->
			                <ul style="list-style-type:none;"><br>
			                	<li><input type="text" required  class="input" placeholder="  Username" name="username"><br><br> <br>
			                	</li>
			                	<li><input type="password" class="input" placeholder="  Password" name="password"><br> <br><br>
			                	</li>
			                	<li><input type="submit" class="signin" value="Sign  In"> 
			                	</li>
			                </ul>  
						</form> 
					</center>
                </div>
            </div>
        </div>
    </div>
  </div> 
</body>
 
</html>
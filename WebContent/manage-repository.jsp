<%@ page language="java" import="java.util.*"  contentType="text/html; charset=ISO-8859-1"  pageEncoding="ISO-8859-1"%>
<!DOCTYPE html> 
 <%pageContext.setAttribute("main-panel-title", "Manage Repository"); %>
<html>
 <%@include file="freg/head.jspf" %>  
 <body>  
  <div class="wrapper">
  
	<%@include file="freg/sidebar.jspf" %>

    <div class="main-panel">
    
		<%@include file="freg/navTitle.jspf" %>
 
        <div class="content">
            <div class="container-fluid">
			<style>
			.row-ele-content{
			margin-left:20px; 
			}
			</style>	
			<script type="text/javascript">
				window.onload = function(){
					var zoominsArr = [...document.getElementsByClassName('ti-zoom-in')];
					zoominsArr.forEach(function(item){
						item.onclick = function(e){
							if (item.classList.contains("ti-zoom-in")) {     	//+放大，查看表
								item.classList.remove("ti-zoom-in");
								item.classList.add("ti-zoom-out");
								/// TODO: add functionality for look details on the table.
							} else if (item.classList.contains("ti-zoom-out")){	//-缩小，缩小表
								item.classList.remove("ti-zoom-out");
								item.classList.add("ti-zoom-in");
								/// TODO: add functionality for zoom out the details on the table.
							}
						}
					});
				}
			</script>
				<!-- The Place Where is Dynamic -->
				<!-- Iteration start. 每一个task都是一个iteration -->
                <div class="row"> 
					
                    <div class="col-lg-4 col-sm-5">
                        <div class="card">
                            <div class="content">
                                <div class="row">
                               		<!-- 
                                    <div class="col-xs-5">
                                        <div class="icon-big icon-warning text-center">
                                            <i class="ti-server"></i>
                                        </div>
                                    </div> -->
                                    <div class="col-xs-7">
                                        <div class="">
                                            <p>Execution Date Time</p> 
                                            <div class="row-ele-content">
                                           	 	<!-- Injection point -->
                                           	 	<span>2018-01-22</span>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="footer">
                                    <hr /> 
                                </div>
                            </div>
                        </div>
                    </div>
                    
                    <div class="col-lg-4 col-sm-5">
                        <div class="card">
                            <div class="content">
                                <div class="row"><!-- 
                                    <div class="col-xs-5">
                                        <div class="icon-big icon-danger text-center">
                                            <i class="ti-pulse"></i>
                                        </div>
                                    </div> -->
                                    <div class="col-xs-7">
                                        <div class="">
                                            <p>Task</p>
                                            <div class="row-ele-content">
                                            	<!-- Injection point -->
                                            	<span><a href="#">Crawler1</a></span> 
                                            	<a href="#" style="float: right;"><i class="ti-zoom-in"></i></a> <!-- ti-zoom-out --> 
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="footer">
                                    <hr /><!--
                                    <div class="stats">
                                        <i class="ti-timer"></i> In the last hour
                                    </div>-->
                                </div>
                            </div>
                        </div>
                    </div>
                    
                    <div class="col-lg-4 col-sm-5">
                        <div class="card">
                            <div class="content">
                                <div class="row"><!-- 
                                    <div class="col-xs-5">
                                        <div class="icon-big icon-danger text-center">
                                            <i class="ti-pulse"></i>
                                        </div>
                                    </div> -->
                                    <div class="col-xs-36">
                                        <div class="">
                                            <p>Data Table</p>
                                            <div class="row-ele-content">
                                            	
                                            	<!-- Dynamic Data Field Injection Via Spring Beans & JSTL < c : for-loop> -->
												<table width="100%" border="0">
													<thead >
														<th>$_{Field1}</th>
														<th>$_{Field2}</th>
														<th>$_{Field3}</th>
													</thead>
								                  	<tr class="">
								                		<td> Data1 </td>
								                   		<td> Data2 </td> 
								                   		<td> Data3 </td> 
								                	</tr>
								                  	<tr class="">
								                		<td> Data1 </td>
								                   		<td> Data2 </td> 
								                   		<td> Data3 </td> 
								                	</tr>
								                	<!-- ... ... Iteration -->
								                  	<tr class="">
								                		<td> Data1 </td>
								                   		<td> Data2 </td> 
								                   		<td> Data3 </td> 
								                	</tr>
								                </table>  
								                
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="footer">
                                    <hr /> 
                                    <div class="stats">
                                        <i class="ti-control-forward"></i><a href="#"> View More</a>
                                    </div> 
                                </div>
                            </div>
                        </div>
                    </div> 
                </div>
        		<!-- Iteration End... -->
                				
            </div>
        </div>
 
	<%@include file="freg/footer.jspf" %> 
	
    </div>
  </div>
 
 </body>

 <%@include file="freg/scripts.jspf" %>
</html>


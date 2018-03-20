<%@ page language="java" import="java.util.*"  contentType="text/html; charset=ISO-8859-1"  pageEncoding="ISO-8859-1"%> 
<!DOCTYPE html> 
 <%	pageContext.setAttribute("main-panel-title", "Crawler Flow Maker"); 
 	pageContext.setAttribute("isOnBrowserPage",true);
 %>
<html>
 <%@include file="freg/head.jspf" %> <!-- base 已经在head.jspf里进行设置 -->
 <body>  
  <div class="wrapper">
  
	<%@include file="freg/sidebar.jspf" %>

    <div class="main-panel">
    
		<%@include file="freg/navTitle.jspf" %>

<style>  
.finish_btn{
  float:right;
  padding:5px;
  margin-right:50px;
  width:200px;
  height:50px;
  font-size: 20px; 
  letter-spacing: 2px;
}
</style>

        <div class="content">
            <div class="container-fluid"> 
            
				<!-- The Place will change  --> 
            
                <div class="row">  
                    <div class="col-md-12">
                        <div class="card">
                            <div class="header">
                                <h4 class="title">Browser</h4>
                                <p class="category">If you finished the workflow for making crawler, please click the 'finish' button on the bottom of the page.</p>
                            </div>
                            <div class="content">
                                <div id="chartHours" class="ct-chart">
                                </div>
                                <div class="footer">
                                    <div class="chart-legend">
                                        <i class="fa fa-circle text-info"></i> Open
                                        <i class="fa fa-circle text-danger"></i> Click
                                        <i class="fa fa-circle text-warning"></i> Click Second Time
                                    </div>
                                    <hr>
                                    
                                    <div class="stats">
                                        <i class="ti-reload"></i> Updated 3 minutes ago
                                    </div>
                                    
                                </div>
                            </div>
                        </div>
                    </div> 
				</div>
				 
                <div class="row">
                    <div class="col-md-6">
                        <div class="card">
                            <div class="header">
                                <h4 class="title">Operation Options</h4>
                                <p class="category">Select Commands</p>
                            </div>
                            <div class="content">
                                <div id="chartPreferences" class="ct-chart ct-perfect-fourth">
                                
                                </div>

                                <div class="footer">
                                    <div class="chart-legend">
                                        <i class="fa fa-circle text-info"></i> Open
                                        <i class="fa fa-circle text-danger"></i> Bounce
                                        <i class="fa fa-circle text-warning"></i> Unsubscribe
                                    </div>
                                    <hr>
                                    <div class="stats">
                                        <i class="ti-timer"></i> Campaign sent 2 days ago
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <div class="card ">
                            <div class="header">
                                <h4 class="title">Inspector</h4>
                                <p class="category">HTML Element Visualization</p>
                            </div>
                            <div class="content">
                                <div id="chartActivity" class="ct-chart"></div>

                                <div class="footer">
                                    <div class="chart-legend">
                                        <i class="fa fa-circle text-info"></i> Tesla Model S
                                        <i class="fa fa-circle text-warning"></i> BMW 5 Series
                                    </div>
                                    <hr>
                                    <div class="stats">
                                        <i class="ti-check"></i> Data information certified
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div> 
				
                <div class="row">  
                    <div class="col-md-12">
                        <div class="card">
                            <div class="header">
                                <h4 class="title">Workflow Window</h4>
                                <p class="category">HTML element opertaion workflow visualization</p>
                            </div>
                            <div class="content">
                                <div id="chartHours" class="ct-chart">
                                </div>
                                <div class="footer">
                                    <div class="chart-legend">
                                        <i class="fa fa-circle text-info"></i> Open
                                        <i class="fa fa-circle text-danger"></i> Click
                                        <i class="fa fa-circle text-warning"></i> Click Second Time
                                    </div>
                                    <hr>
                                    
                                    <div class="stats">
                                        <i class="ti-reload"></i> Updated 3 minutes ago
                                    </div> 
                                </div>
                            </div>
                        </div>
                    </div> 
				</div>
                <div class="row">  
                	<input class="finish_btn" type="submit" value="Finish!" />
                	<span style="float: right ; font-size: 30px;" >&nbsp;----->>>&nbsp;&nbsp;&nbsp;</span>
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


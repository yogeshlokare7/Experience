<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<title>Experience</title>
<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
<!-- Enter Content Here -->
<!-- Page header -->
                <div class="page-header">
                    <div class="page-header-content">
                        <div class="page-title">
                            <h4><span class="text-semibold">Roles</span> - List</h4>
                        </div>

                        
                    </div>
                
                
                 <div class="breadcrumb-line breadcrumb-line-component">
						<ul class="breadcrumb">
							<li><a href="${contextPath}/dashboard"><i class="icon-home2 position-left"></i> Home</a></li>
							<li><a href="${contextPath}/role/view">Roles</a></li>
							
						</ul>

					</div>
					</div>
                
                <!-- /page header -->
                <!-- Content area -->
                
               
                
                <div class="content">
					<%-- <a href="${pageContext.request.contextPath}/role/add" class="btn btn-primary">ADD ROLE</a> --%>
					<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#modal_small">ADD ROLE</button>
					<br/>
					<br/>
					
					
					
                    <!-- Basic datatable -->
                    <div class="panel panel-flat">
                        <div class="panel-heading">
                            <!-- <h5 class="panel-title">Basic datatable</h5> -->
                            <div class="heading-elements">
                                <ul class="icons-list">
                                    <li><a data-action="collapse"></a></li>
                                    <li><a data-action="reload"></a></li>
                                    <li><a data-action="close"></a></li>
                                </ul>
                            </div>
                        </div>

                        <%-- <div class="panel-body">
                            The <code>DataTables</code> is a highly flexible tool, based upon the foundations of progressive enhancement, and will add advanced interaction controls to any HTML table. DataTables has most features enabled by default, so all you need to do to use it with your own tables is to call the construction function. Searching, ordering, paging etc goodness will be immediately added to the table, as shown in this example. <strong>Datatables support all available table styling.</strong>
                        </div> --%>

                       <%--  <table class="table datatable-basic">
                            <thead>
                                <tr>
                                    <th>#</th>
                                    <th>Role Name</th>
                                    <th class="text-center">Actions</th>
                                </tr>
                            </thead>
                            <tbody>
                           <c:forEach items="${roles}" var="role">
                                <tr>
                                    <td>${role.id}</td>
                                    <td>${role.role}</td>
                                    <td class="text-center">
                                        <ul class="icons-list">
                                            <li class="dropdown">
                                                
                                               <a href="#" class="dropdown-toggle" data-toggle="dropdown">
													<i class="icon-menu9"></i>
												</a>

                                               <ul class="dropdown-menu dropdown-menu-right">
                                               <li><a onclick="return confirmAction('Edit')" href="${contextPath}/user/edit/${user.id}">Edit</a></li>
                                               <li><a onclick="return confirmAction('Delete')" href="${contextPath}/user/delete/${user.id}">Delete</a></li>
                                                </ul> 
                                            </li>
                                        </ul>
                                    </td>
                                </tr>
                               </c:forEach>
                            </tbody>
                        </table>
                         --%>
                        <table class="table datatable-basic">
                            <thead>
                                <tr>
                                    <th>Id</th>
                                    <th>Role Name</th>
                                   <!--  <th>Email </th>
                                    <th>Contact No</th> -->
                                    <th>Description</th>
                                    <th class="text-center">Actions</th>
                                </tr>
                            </thead>
                            <tbody>
                            <c:forEach items="${roles}" var="role">
                                <tr>
                                    <td>${role.id}</td>
                                    <td>${role.role}</td>
                                    <%-- <td><a href="#">${user.useremail}</a></td>
                                    <td>${user.contactno}</td> --%>
                                    <td>${role.description}</td>
                                    <td class="text-center">
                                        <ul class="icons-list">
                                            <li class="dropdown">
                                                
                                               <a href="#" class="dropdown-toggle" data-toggle="dropdown">
													<i class="icon-menu9"></i>
												</a>

                                               <ul class="dropdown-menu dropdown-menu-right">
                                               <li><a onclick="return confirmAction('Edit')" href="${contextPath}/role/edit/${role.id}"><i class="icon-pencil"></i>Edit</a></li>
                                               <li><a onclick="return confirmAction('Delete')" href="${contextPath}/role/delete/${role.id}"><i class="icon-cross"></i>Delete</a></li>
                                                </ul> 
                                            </li>
                                        </ul>
                                    </td>
                                </tr>
                              </c:forEach>
                            </tbody>
                        </table>
                    </div>
                    <!-- /basic datatable -->
                   </div>
                   <!-- Small modal -->
                   <form method="POST" action="${contextPath}/role/save">
					<div id="modal_small" class="modal fade">
						<div class="modal-dialog modal-sm">
							<div class="modal-content">
								<div class="modal-header">
									<button type="button" class="close" data-dismiss="modal">&times;</button>
									<h5 class="modal-title">Add Role</h5>
								</div>

								<div class="modal-body">
									<h6 class="text-semibold">Role Name</h6>
									<input type="text" class="form-control" name="role" value="${role.role}" required="required" placeholder="Enter role name" maxlength="30" minlength="2">

									<!-- <hr> -->

									<h6 class="text-semibold">Description</h6>
									<input type="text" class="form-control" name="description" value="${role.description}" required="required" placeholder="Enter role description" maxlength="30" minlength="2">
								</div>

								<div class="modal-footer">
									<button type="button" class="btn btn-link" data-dismiss="modal">Close</button>
									<button type="submit" class="btn btn-primary">Save</button>
								</div>
							</div>
						</div>
					</div>
					</form>
					<!-- /small modal -->
                  

<!--  END Content Here-->
	</tiles:putAttribute>
</tiles:insertDefinition>
<script type="text/javascript">
function confirmAction(action) {
	if(confirm("Do you want to "+action+" Record !!")){
		return true;
	}
	return false;
}
</script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/assets/js/plugins/loaders/pace.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/assets/js/core/libraries/jquery.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/assets/js/core/libraries/bootstrap.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/assets/js/plugins/loaders/blockui.min.js"></script>

<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/assets/js/plugins/notifications/bootbox.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/assets/js/plugins/notifications/sweet_alert.min.js"></script>


<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/assets/js/core/app.js"></script>
	
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/assets/js/pages/components_modals.js"></script> 

<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/assets/js/plugins/forms/selects/select2.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/assets/js/plugins/tables/datatables/datatables.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/assets/js/pages/datatables_basic.js"></script>
	
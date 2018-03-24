<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/assets/js/plugins/loaders/pace.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/assets/js/core/libraries/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/assets/js/core/libraries/bootstrap.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/assets/js/plugins/loaders/blockui.min.js"></script>
<title>Experience</title>
<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
<!-- Enter Content Here -->
<!-- Page header -->
                <div class="page-header">
                    <div class="page-header-content">
                        <div class="page-title">
                            <h4> <span class="text-semibold">Permission</span> - View</h4>
                        </div>
					</div>
                    <div class="breadcrumb-line breadcrumb-line-component">
						<ul class="breadcrumb">
							<li><a href="${contextPath}/dashboard"><i class="icon-home2 position-left"></i> Home</a></li>
							<li><a href="${contextPath}/permission/view">Permissions</a></li>
						</ul>
					</div>
                </div>
                <!-- /page header -->
                <!-- Content area -->
                <div class="content">
					 <a href="${pageContext.request.contextPath}/permission/add" class="btn btn-primary">ADD PERMISSION</a>
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
                        <table class="table datatable-basic">
                            <thead>
                                <tr>
                                    <th>Id</th>
                                    <th>Permission</th>
                                    <th>Description</th>
                               <!--      <th>DOB</th> -->
                                   <!--  <th>Status</th> -->
                                    <th class="text-center">Actions</th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach items="${permissions}" var="permission">
                                <tr>
                                    <td>${permission.id}</td>
                                    <td><a href="#">${permission.name}</a></td>
                                    <td>${permission.description}</td>
                                   <!--  <td></td> -->
                                   <!--  <td><span class="label label-success">Active</span></td> -->
                                    <td class="text-center">
                                        <ul class="icons-list">
                                            <li class="dropdown">
                                                
                                               <a href="#" class="dropdown-toggle" data-toggle="dropdown">
													<i class="icon-menu9"></i>
												</a>

                                               <ul class="dropdown-menu dropdown-menu-right">
                                               <li><a href="${contextPath}/permission/edit/${permission.id}"><i class="icon-pencil"></i>Edit</a></li>
                                               <li><a onclick="openDialog(${permission.id})"><i class="icon-cross"></i>Delete</a></li>
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
<script type="text/javascript">
function openDialog(input){
	var id=input;
	swal({
        title: "Are you sure?",
        text: "You will not be able to recover this record!",
        type: "warning",
        showCancelButton: true,
        confirmButtonColor: "#EF5350",
        confirmButtonText: "Yes, delete it!",
        cancelButtonText: "No, cancel pls!",
        closeOnConfirm: false,
        closeOnCancel: false
    },
    function(isConfirm){
        if (isConfirm) {
            swal({
                title: "Deleted!",
                text: "Your record has been deleted.",
                confirmButtonColor: "#66BB6A",
                type: "success"
            });
            window.location = '${contextPath}/permission/delete/'+id;
        }
        else {
            swal({
                title: "Cancelled",
                text: "Your imaginary file is safe :)",
                confirmButtonColor: "#2196F3",
                type: "error"
            });
        }
    });
        
}
</script>

<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/assets/js/plugins/notifications/sweet_alert.min.js"></script>


<script type="text/javascript" src="${pageContext.request.contextPath}/resources/assets/js/core/app.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/assets/js/plugins/forms/selects/select2.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/assets/js/plugins/tables/datatables/datatables.min.js"></script>
 <script type="text/javascript" src="${pageContext.request.contextPath}/resources/assets/js/pages/datatables_basic.js"></script>
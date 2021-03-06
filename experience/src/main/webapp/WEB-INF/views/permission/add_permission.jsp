<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<title>Experience</title>
<link rel="shortcut icon" type="image/png" href="${pageContext.request.contextPath}/resources/images/favicon.ico">
<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
	<!--  -->
	<!-- Page header -->
				<div class="page-header">
					<div class="page-header-content">
						<div class="page-title">
							<h4> <span class="text-semibold">Permission</span> - Form</h4>
						</div>
					</div>

					<div class="breadcrumb-line breadcrumb-line-component">
						<ul class="breadcrumb">
							<li><a href="${contextPath}/dashboard"><i class="icon-home2 position-left"></i> Home</a></li>
							<li><a href="${contextPath}/permission/view">Permissions</a></li>
							<li class="active">Save Permission</li>
						</ul>

						
					</div>
				</div>
				<!-- /page header -->


				<!-- Content area -->
				<div class="content">

					<!-- Form horizontal -->
					<div class="panel panel-flat">
						<div class="panel-heading">
							<h5 class="panel-title">Add Permission</h5>
							<!-- <div class="heading-elements">
								<ul class="icons-list">
			                		<li><a data-action="collapse"></a></li>
			                		<li><a data-action="reload"></a></li>
			                		<li><a data-action="close"></a></li>
			                	</ul>
		                	</div> -->
						</div>

						<div class="panel-body">
							<form class="form-horizontal" method="POST" action="${contextPath}/permission/save">
								<input type="hidden" name="id" value="${permission.id}">
									<div class="form-group">
										<label class="control-label col-lg-2">Permission Name</label>
										<div class="col-lg-10">
											<input type="text" required="required" placeholder="Enter permission name" maxlength="30" minlength="2" class="form-control" name="name" value="${permission.name}" >
										</div>
									</div>

									<div class="form-group">
										<label class="control-label col-lg-2">Description</label>
										<div class="col-lg-10">
											<input type="text" class="form-control" placeholder="Enter permission description" maxlength="30" minlength="2"  name="description" value="${permission.description}" >
										</div>
									</div>


								<div class="text-right">
									<button type="submit" class="btn btn-primary">Submit <i class="icon-arrow-right14 position-right"></i></button>
								</div>
							</form>
						</div>
					</div>
					<!-- /form horizontal -->

					
					

				</div>
				<!-- /content area -->
	
	<!--  -->
</tiles:putAttribute>
</tiles:insertDefinition>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/assets/js/plugins/loaders/pace.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/assets/js/core/libraries/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/assets/js/core/libraries/bootstrap.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/assets/js/plugins/loaders/blockui.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/assets/js/plugins/forms/styling/uniform.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/assets/js/plugins/forms/styling/switchery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/assets/js/plugins/forms/styling/switch.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/assets/js/core/app.js"></script>
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
							<h4><i class="icon-arrow-left52 position-left"></i> <span class="text-semibold">User</span> - Update Password</h4>
						</div>
					</div>
					
				</div>
				<!-- /page header -->


				<!-- Content area -->
				<div class="content">

					<!-- Form horizontal -->
					<div class="panel panel-flat">
						<div class="panel-heading">
							<h5 class="panel-title">Update Password</h5>
							<!-- <div class="heading-elements">
								<ul class="icons-list">
			                		<li><a data-action="collapse"></a></li>
			                		<li><a data-action="reload"></a></li>
			                		<li><a data-action="close"></a></li>
			                	</ul>
		                	</div> -->
						</div>

						<div class="panel-body">
							<form class="form-horizontal" method="POST" action="${contextPath}/update/${id}">
								<fieldset class="content-group">
									<div class="form-group">
										<label class="control-label col-lg-2">Password</label>
										<div class="col-lg-10">
											<input id="pass" type="password" class="form-control" name="password" value="" autofocus="autofocus" required>
										</div>
									</div>

									<div class="form-group">
										<label class="control-label col-lg-2">Confirm Password</label>
										<div class="col-lg-10">
											<input id="c_pass" type="password" class="form-control" name="confirmPassword" value="" onblur="confirmPass()" required>
											<span id="error" style="color: #F00;"> </span>
										</div>
									</div>
									

								</fieldset>
								<div class="text-right">
									<button id="submitButton" type="submit" class="btn btn-primary">Update <i class="icon-arrow-right14 position-right"></i></button>
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
<script type="text/javascript">
			function confirmPass() {
				var pass = document.getElementById("pass").value
				var confPass = document.getElementById("c_pass").value
				if (pass != confPass) {
					document.getElementById('error').innerHTML = 'wrong confirm password';
					$("#submitButton").attr("disabled", "disabled");
				} else {
					document.getElementById('error').innerHTML = '';
					$("#submitButton").removeAttr("disabled");
				}
			}
		</script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/assets/js/plugins/loaders/pace.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/assets/js/core/libraries/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/assets/js/core/libraries/bootstrap.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/assets/js/plugins/loaders/blockui.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/assets/js/plugins/forms/styling/uniform.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/assets/js/plugins/forms/styling/switchery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/assets/js/plugins/forms/styling/switch.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/assets/js/core/app.js"></script>
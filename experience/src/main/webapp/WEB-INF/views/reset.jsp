<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Experience America</title>

	<!-- Global stylesheets -->
	<link href="https://fonts.googleapis.com/css?family=Roboto:400,300,100,500,700,900" rel="stylesheet" type="text/css">
	<link href="${contextPath}/resources/assets/css/icons/icomoon/styles.css" rel="stylesheet" type="text/css">
	<link href="${contextPath}/resources/assets/css/bootstrap.css" rel="stylesheet" type="text/css">
	<link href="${contextPath}/resources/assets/css/core.css" rel="stylesheet" type="text/css">
	<link href="${contextPath}/resources/assets/css/components.css" rel="stylesheet" type="text/css">
	<link href="${contextPath}/resources/assets/css/colors.css" rel="stylesheet" type="text/css">
	<!-- /global stylesheets -->

	<!-- Core JS files -->
	<script type="text/javascript" src="${contextPath}/resources/assets/js/plugins/loaders/pace.min.js"></script>
	<script type="text/javascript" src="${contextPath}/resources/assets/js/core/libraries/jquery.min.js"></script>
	<script type="text/javascript" src="${contextPath}/resources/assets/js/core/libraries/bootstrap.min.js"></script>
	<script type="text/javascript" src="${contextPath}/resources/assets/js/plugins/loaders/blockui.min.js"></script>
	<!-- /core JS files -->


	<!-- Theme JS files -->
	<script type="text/javascript" src="${contextPath}/resources/assets/js/core/app.js"></script>
	<!-- /theme JS files -->

</head>

<body class="login-container">

	<!-- Main navbar -->
	<div class="navbar navbar-inverse">
		<div class="navbar-header">
			<a class="navbar-brand" href="${contextPath}/dashboard"><span style="color:white;">EXPERIENCE</span></a>

			<ul class="nav navbar-nav pull-right visible-xs-block">
				<li><a data-toggle="collapse" data-target="#navbar-mobile"><i class="icon-tree5"></i></a></li>
			</ul>
		</div>
	</div>
	<!-- /main navbar -->


	<!-- Page container -->
	<div class="page-container">

		<!-- Page content -->
		<div class="page-content">

			<!-- Main content -->
			<div class="content-wrapper">

				<!-- Content area -->
				<div class="content">
					<%-- ${loginError} --%>
					<!-- Simple login form -->
					<c:if test="${not empty loginError}">
					<!-- <div class="panel panel-flat"> -->
					<div class="panel-body">
					<div class="row">
					<p class="text-semibold">Logging Error</p>
							<div class="alert alert-danger alert-styled-left alert-bordered">
										<button type="button" class="close" data-dismiss="alert"><span>&times;</span><span class="sr-only">Close</span></button>
										<span class="text-semibold">Oh snap!</span> Error logging in. <a href="${contextPath}/login" class="alert-link">Please try again</a>.
							</div>
					</div>
					</div>
					</c:if>
					<form action="${contextPath}/reset/${id}" method="POST">
						<div class="panel panel-body login-form">
							<div class="text-center">
								<img src="${pageContext.request.contextPath}/resources/assets/images/logo.png" alt=""><br/>
								<br/>
								<h5 class="content-group">Set New Password<small class="display-block">Enter your password below</small></h5>
							</div>

							<div class="form-group has-feedback has-feedback-left">
								<input type="password" class="form-control" name="password" placeholder="Password" required>
								<div class="form-control-feedback">
									<i class="icon-lock2 text-muted"></i>
								</div>
							</div>

							<div class="form-group has-feedback has-feedback-left">
								<input type="password" class="form-control" name="confPassword" placeholder="Confirm Password" required>
								<div class="form-control-feedback">
									<i class="icon-lock2 text-muted"></i>
								</div>
							</div>

							<div class="form-group">
								<button type="submit" class="btn btn-primary btn-block" style="background-color:#FB8C00;border:#FB8C00;">Set Password <i class="icon-circle-right2 position-right"></i></button>
							</div>

							
						</div>
					</form>
					
					<!-- /simple login form -->


					<!-- Footer -->
					<div class="footer text-muted text-center">
						&copy; 2018. <a href="${contextPath }/login">Experience</a> by <a href="http://www.mjbtech.com" target="_blank">MJB Technology</a>
					</div>
					<!-- /footer -->
				</div>
				<!-- /content area -->

			</div>
			<!-- /main content -->

		</div>
		<!-- /page content -->

	</div>
	<!-- /page container -->

</body>
</html>

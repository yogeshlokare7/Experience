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
					<c:if test="${not empty notFound}">
					<!-- <div class="panel panel-flat"> -->
					<div class="panel-body">
					<div class="row">
					<p class="text-semibold">Logging Error</p>
							<div class="alert alert-danger alert-styled-left alert-bordered">
										<button type="button" class="close" data-dismiss="alert"><span>&times;</span><span class="sr-only">Close</span></button>
										${notFound} <a href="${contextPath}/forgot" class="alert-link">Please double-check and try again.</a>.
							</div>
					</div>
					</div>
					</c:if>
					
					<c:if test="${not empty user}">
					<!-- <div class="panel panel-flat"> -->
					<div class="panel-body">
					<div class="row">
					<p class="text-semibold">Check your email</p>
									<div class="alert alert-success alert-styled-left alert-arrow-left alert-bordered">
										<button type="button" class="close" data-dismiss="alert"><span>&times;</span><span class="sr-only">Close</span></button>
										${found}
								    </div>
					</div>
					</div>
					</c:if>
					
					
					
					<form method="POST" action="${pageContext.request.contextPath}/forgot">
						<div class="panel panel-body login-form">
							<div class="text-center">
								<div class="icon-object border-warning text-warning"><i class="icon-spinner11"></i></div>
								<h5 class="content-group">Password recovery <small class="display-block">We'll send you instructions in email</small></h5>
							</div>

							<div class="form-group has-feedback">
								<input type="email" class="form-control" name="userEmail" placeholder="Your email" required>
								<div class="form-control-feedback">
									<i class="icon-mail5 text-muted"></i>
								</div>
							</div>

							<button type="submit" class="btn bg-blue btn-block">Reset password<i class="icon-arrow-right14 position-right"></i></button>
						</div>
					</form>
					<!-- /simple login form -->


					<!-- Footer -->
					<div class="footer text-muted text-center">
						&copy; 2018. <a href="${pageContext.request.contextPath}/login">Experience</a> by <a href="http://www.mjbtech.com" target="_blank">MJB Technology</a>
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

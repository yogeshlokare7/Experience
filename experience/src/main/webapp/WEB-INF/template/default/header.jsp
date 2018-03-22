<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ page session="true" %>
<!-- Main navbar -->
	<div class="navbar navbar-default header-highlight">
		<div class="navbar-header">
			<a class="navbar-brand" href="${pageContext.request.contextPath}/dashboard"><span style="color:white;">EXPERIENCE</span></a>
				<%-- <img src="${pageContext.request.contextPath}/resources/assets/images/exp.png" alt=""> --%>
			<ul class="nav navbar-nav visible-xs-block">
				<li><a data-toggle="collapse" data-target="#navbar-mobile"><i class="icon-tree5"></i></a></li>
				<li><a class="sidebar-mobile-main-toggle"><i class="icon-paragraph-justify3"></i></a></li>
			</ul>
		</div>

		<div class="navbar-collapse collapse" id="navbar-mobile">
			<ul class="nav navbar-nav">
				<li><a class="sidebar-control sidebar-main-toggle hidden-xs"><i class="icon-paragraph-justify3"></i></a></li>
				<li class="dropdown">
					<div class="dropdown-menu dropdown-content">
						<div class="dropdown-content-footer">
							<a href="#" data-popup="tooltip" title="All activity"><i class="icon-menu display-block"></i></a>
						</div>
					</div>
				</li>
			</ul>

			<div class="navbar-right">
				<ul class="nav navbar-nav">
					<li class="dropdown dropdown-user">
					<c:choose>
					<c:when test="${empty loggedInUser.useremail}">
						<a class="dropdown-toggle" data-toggle="dropdown">
							<img src="${pageContext.request.contextPath}/resources/assets/images/avataar.png" alt="">
							<span>MJB</span>
							<i class="caret"></i>
						</a>
					</c:when>
					<c:otherwise>
						<a class="dropdown-toggle" data-toggle="dropdown">
							<%-- <img src="${pageContext.request.contextPath}/resources/assets/images/avataar.png" alt=""> --%>
							<c:if test="${not empty loggedInUser.picture}">
							<img src="data:image/png;base64,${loggedInUser.picture}" alt="">
							</c:if>
							<span>Welcome ${loggedInUser.firstname}</span>
							<i class="caret"></i>
						</a>
					</c:otherwise>
					</c:choose>
						<ul class="dropdown-menu dropdown-menu-right">
							<li><a href="${pageContext.request.contextPath}/profile/${loggedInUser.id}"><i class="icon-user-plus"></i> My profile</a></li>
							<!-- <li><a href="#"><i class="icon-coins"></i> My balance</a></li> -->
							<li><a href="${pageContext.request.contextPath}/update/${loggedInUser.id}"><i class="icon-lock2"></i> Update Password</a></li>
							<li class="divider"></li>
							<li><a href="#"><i class="icon-cog5"></i> Account settings</a></li>
							<li><a href="${pageContext.request.contextPath}/logout"><i class="icon-switch2"></i> Logout</a></li>
						</ul>
					</li>
				</ul>
			</div>
		</div>
	</div>
	<!-- /main navbar -->
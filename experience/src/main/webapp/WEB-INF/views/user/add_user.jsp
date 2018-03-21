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
							<h4><i class="icon-arrow-left52 position-left"></i> <span class="text-semibold">User</span> - Form</h4>
						</div>
					</div>

					<div class="breadcrumb-line breadcrumb-line-component">
						<ul class="breadcrumb">
							<li><a href="index.html"><i class="icon-home2 position-left"></i> Home</a></li>
							<li><a href="form_inputs_basic.html">Users</a></li>
							<li class="active">Input form</li>
						</ul>

						
					</div>
				</div>
				<!-- /page header -->


				<!-- Content area -->
				<div class="content">

					<!-- Form horizontal -->
					<div class="panel panel-flat">
						<div class="panel-heading">
							<h5 class="panel-title">Save User</h5>
							<div class="heading-elements">
								<ul class="icons-list">
			                		<li><a data-action="collapse"></a></li>
			                		<li><a data-action="reload"></a></li>
			                		<li><a data-action="close"></a></li>
			                	</ul>
		                	</div>
						</div>

						<div class="panel-body">
							<form action="${pageContext.request.contextPath}/user/save" method="POST" enctype="multipart/form-data">
												<input type="hidden" name="id" value="${user.id}">
													<div class="form-group">
														<div class="row">
															<div class="col-md-6">
																<label>First Name</label>
																<input type="text" name="firstname" value="${user.firstname}" class="form-control" required>
															</div>
															<div class="col-md-6">
																<label>Last name</label>
																<input type="text" name="lastname" value="${user.lastname}" class="form-control" required>
															</div>
														</div>
													</div>

													<!-- <div class="form-group">
														<div class="row">
															<div class="col-md-6">
																<label>Address line 1</label>
																<input type="text" value="Ring street 12" class="form-control">
															</div>
															<div class="col-md-6">
																<label>Address line 2</label>
																<input type="text" value="building D, flat #67" class="form-control">
															</div>
														</div>
													</div> -->

													<!-- <div class="form-group">
														<div class="row">
															<div class="col-md-4">
																<label>City</label>
																<input type="text" value="Munich" class="form-control">
															</div>
															<div class="col-md-4">
																<label>State/Province</label>
																<input type="text" value="Bayern" class="form-control">
															</div>
															<div class="col-md-4">
																<label>ZIP code</label>
																<input type="text" value="1031" class="form-control">
															</div>
														</div>
													</div> -->

													<div class="form-group">
														<div class="row">
															<div class="col-md-6">
																<label>Email</label>
																<input type="email" name="useremail" value="${user.useremail}" class="form-control" required>
															</div>
															<c:if test="${empty user.userpwd}">
															<div class="col-md-6">
																<label>Password</label>
																<input type="password" name="userpwd" value="${user.userpwd}" class="form-control" required>
															</div>
															</c:if>
															<!-- <div class="col-md-6">
									                            <label>Your country</label>
									                            <select class="select">
									                                <option value="germany" selected="selected">Germany</option> 
									                                <option value="france">France</option> 
									                                <option value="spain">Spain</option> 
									                                <option value="netherlands">Netherlands</option> 
									                                <option value="other">...</option> 
									                                <option value="uk">United Kingdom</option> 
									                            </select>
															</div> -->
														</div>
													</div>

							                        <div class="form-group">
							                        	<div class="row">
							                        		<div class="col-md-6">
																<label>Phone #</label>
																<input type="text" name="contactno" value="${user.contactno}" class="form-control" required>
																<span class="help-block">999-999-9999</span>
							                        		</div>

															<div class="col-md-6">
																<label class="display-block">Upload profile image</label>
							                                    <input type="file" name="images" class="file-styled" onchange="readURL(this);">
							                                    <span class="help-block">Accepted formats: gif, png, jpg. Max file size 2Mb</span>
							                                    <img id="blah" src="#" />
															</div>
							                        	</div>
							                        </div>

							                        <div class="text-right">
							                        	<button type="submit" class="btn btn-primary">Save <i class="icon-arrow-right14 position-right"></i></button>
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
function readURL(input) {
    if (input.files && input.files[0]) {
        var reader = new FileReader();

        reader.onload = function (e) {
            $('#blah')
                .attr('src', e.target.result)
                .width(100)
                .height(100);
        };

        reader.readAsDataURL(input.files[0]);
    }
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
	src="${pageContext.request.contextPath}/resources/assets/js/plugins/forms/styling/uniform.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/assets/js/plugins/forms/selects/select2.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/assets/js/plugins/ui/moment/moment.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/assets/js/plugins/visualization/echarts/echarts.js"></script>
	
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/assets/js/core/app.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/assets/js/pages/user_pages_profile.js"></script>
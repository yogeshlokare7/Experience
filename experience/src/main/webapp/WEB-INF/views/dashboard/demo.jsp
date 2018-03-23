<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/assets/js/countries.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/assets/js/core/libraries/jquery.min.js"></script>
<title>Experience</title>
<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
		<!-- Enter Content Here -->
		<div class="page-header">

			<!-- Header content -->
			<div class="page-header-content">
				<div class="page-title">
					<h4>
						 <span class="text-semibold">User Pages</span> - Profile
					</h4>

					<ul class="breadcrumb position-right">
						<li><a href="home.html">Home</a></li>
						<li class="active">Profile</li>
					</ul>
				</div>

				
			</div>
			<!-- /header content -->


			<!-- Toolbar -->
			<div class="navbar navbar-default navbar-component navbar-xs">
				<ul class="nav navbar-nav visible-xs-block">
					<li class="full-width text-center"><a data-toggle="collapse"
						data-target="#navbar-filter"><i class="icon-menu7"></i></a></li>
				</ul>

				<div class="navbar-collapse collapse" id="navbar-filter">
					<ul class="nav navbar-nav">
						<li class="active"><a href="#activity" data-toggle="tab"><i
								class="icon-menu7 position-left"></i> Profile</a></li>
					</ul>

					
				</div>
			</div>
			<!-- /toolbar -->

		</div>
		<!-- /page header -->

		<!-- Content area -->
				<div class="content">

					<!-- User profile -->
					<div class="row">
						<div class="col-lg-9">
							<div class="tabbable">
								<div class="tab-content">
									<div class="tab-pane fade in active" id="activity">
										<!-- Timeline -->
										<div class="timeline timeline-left content-group">
											<div class="timeline-container">
													<!-- Profile info -->
										<div class="panel panel-flat">
											<div class="panel-heading">
												<h6 class="panel-title">Profile information</h6>
												<div class="heading-elements">
													<ul class="icons-list">
								                		<li><a data-action="collapse"></a></li>
								                		<li><a data-action="reload"></a></li>
								                		<li><a data-action="close"></a></li>
								                	</ul>
							                	</div>
											</div>

											<div class="panel-body">
												<form action="${pageContext.request.contextPath}/profile" method="POST" enctype="multipart/form-data">
												<input type="hidden" name="id" value="${user.id}">
													<div class="form-group">
														<div class="row">
															<div class="col-md-6">
																<label>First Name</label>
																<input type="text" name="firstname" value="${user.firstname}" class="form-control" required="required" placeholder="Enter first name" maxlength="30" minlength="2">
															</div>
															<div class="col-md-6">
																<label>Last name</label>
																<input type="text" name="lastname" value="${user.lastname}" class="form-control" required="required" placeholder="Enter last name" maxlength="30" minlength="2">
															</div>
														</div>
													</div>

													<div class="form-group">
														<div class="row">
															<div class="col-md-6">
																<label>Email</label>
																<input type="text" readonly="readonly" name="useremail" value="${user.useremail}" class="form-control" required="required" placeholder="Enter user email" maxlength="30" minlength="2">
															</div>
															<div class="col-md-6">
																	<label>Username</label>
																	<input type="text" readonly="readonly" id="username" name="username" value="${user.username}" class="form-control" required="required" placeholder="Enter user name" maxlength="30" minlength="2">
																</div>
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
															<div class="col-md-4">
																<label>Street No</label>
																<input type="text" name="streetno" value="${user.streetno}" class="form-control"  placeholder="Enter street no" maxlength="30" minlength="2">
															</div>
															<div class="col-md-4">
																<label>Street Name</label>
																<input type="text" name="streetname" value="${user.streetname}" class="form-control" placeholder="Enter street name" maxlength="30" minlength="2">
															</div>
															<div class="col-md-4">
																<label>City</label>
																<input type="text" name="city" value="${user.city}" class="form-control"  placeholder="Enter city" maxlength="30" minlength="2">
															</div>
														</div>
													</div>

													<div class="form-group">
														<div class="row">
															<div class="col-md-4">
																<label>Country</label> <select id="country" name="country"
																	class="form-control">
																</select>
															</div>
															<c:choose>
																<c:when test="${empty user.id }">
																	<div class="col-md-4">
																		<label>Province</label> <select id="province" name="province"
																			class="form-control">
																		</select>
																	</div>
																</c:when>
																<c:otherwise>
																	<div class="col-md-4">
																		<label>Province</label> <select id="province" name="province"
																			class="form-control">
																			<option value="${user.province}">
																				<c:out value="${user.province}" />
																		</select>
																	</div>
																</c:otherwise>
															</c:choose>
															<div class="col-md-4">
																<label>Postal code</label> <input type="text" name="postalcode" placeholder="Enter postal code"
																	value="${user.postalcode}" class="form-control">
															</div>
														</div>
													</div>

							                        <div class="form-group">
							                        	<div class="row">
							                        		<div class="col-md-4">
																<label>Phone #</label>
																<input type="text" name="contactno" value="${user.contactno}" class="form-control" required="required" placeholder="Enter contact no" maxlength="30" minlength="2">
																<span class="help-block">+99-99-9999-9999</span>
							                        		</div>
															<div class="col-md-4">
																		<label>Gender</label>
																		<select id="gender" class="select" name="gender" required="required">
																			<option value="">Select Gender</option>
																			<option value="M"><c:out value="Male" /></option>
																			<option value="F"><c:out value="Female" /></option>
																			<option value="O"><c:out value="Other" /></option>
																		</select>
																	</div>
															<div class="col-md-4">
																<label class="display-block">Upload profile image</label>
							                                    <input type="file" name="images" class="file-styled">
							                                    <span class="help-block">Accepted formats: gif, png, jpg. Max file size 2Mb</span>
															</div>
							                        	</div>
							                        </div>

							                        <div class="text-right">
							                        	<button type="submit" class="btn btn-primary">Save <i class="icon-arrow-right14 position-right"></i></button>
							                        </div>
												</form>
											</div>
										</div>
										<!-- /profile info -->
											</div>
									    </div>
									    <!-- /timeline -->
									</div>
								</div>
							</div>
						</div>

						<div class="col-lg-3">
							<!-- User thumbnail -->
							<div class="thumbnail">
								<div class="thumb thumb-rounded thumb-slide">
								<c:if test="${not empty loggedInUser.picture}">
									<img src="data:image/png;base64,${user.picture}" alt="">
								</c:if>
									<div class="caption">
										<span>
											<a href="#" class="btn bg-success-400 btn-icon btn-xs" data-popup="lightbox"><i class="icon-plus2"></i></a>
											<a href="user_pages_profile.html" class="btn bg-success-400 btn-icon btn-xs"><i class="icon-link"></i></a>
										</span>
									</div>
								</div>
							
						    	<div class="caption text-center">
						    		<h6 class="text-semibold no-margin">${user.firstname} ${user.lastname}<small class="display-block">${user.useremail}</small></h6>
					    			<!-- <ul class="icons-list mt-15">
				                    	<li><a href="#" data-popup="tooltip" title="Google Drive"><i class="icon-google-drive"></i></a></li>
				                    	<li><a href="#" data-popup="tooltip" title="Twitter"><i class="icon-twitter"></i></a></li>
				                    	<li><a href="#" data-popup="tooltip" title="Github"><i class="icon-github"></i></a></li>
			                    	</ul> -->
						    	</div>
					    	</div>
					    	<!-- /user thumbnail -->
						</div>
					</div>
					<!-- /user profile -->


					

				</div>
				<!-- /content area -->

		<!--  END Content Here-->
	</tiles:putAttribute>
</tiles:insertDefinition>
<script type="text/javascript">
populateCountries("country", "province");

gender = '<c:out value="${user.gender}"/>';
$('#gender option[value="' + gender + '"]').prop('selected', true);
</script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/assets/js/plugins/loaders/pace.min.js"></script>
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
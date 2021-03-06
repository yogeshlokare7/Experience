<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<title>Experience - User Registration</title>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/assets/js/core/libraries/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/assets/js/countries.js"></script>
<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
	<!--  -->
	<!-- Page header -->
				<div class="page-header">
					<div class="page-header-content">
						<div class="page-title">
							<h4><span class="text-semibold">User</span> - Form</h4>
						</div>
					</div>

					<div class="breadcrumb-line breadcrumb-line-component">
						<ul class="breadcrumb">
							<li><a href="${contextPath}/dashboard"><i class="icon-home2 position-left"></i> Home</a></li>
							<li><a href="${contextPath}/user/view">Users</a></li>
							<li class="active">Users Registration</li>
						</ul>

						
					</div>
				</div>
				<!-- /page header -->


				<!-- Content area -->
				<div class="content">

					<!-- Form horizontal -->
					<div class="panel panel-flat">
						<div class="panel-heading">
							<h5 class="panel-title">User Registration</h5>
							<div class="heading-elements">
								<ul class="icons-list">
			                		<!-- <li><a data-action="collapse"></a></li>
			                		<li><a data-action="reload"></a></li>
			                		<li><a data-action="close"></a></li> -->
			                	</ul>
		                	</div>
						</div>

						<div class="panel-body">
							<form action="${pageContext.request.contextPath}/user/save" method="POST" enctype="multipart/form-data">
												<input type="hidden" name="id" value="${user.id}">
													<div class="form-group">
														<div class="row">
														<div class="col-md-6">
																<label>Email</label>
																<input type="email" id="useremail" name="useremail" value="${user.useremail}" class="form-control" required="required" placeholder="Enter email" maxlength="30" minlength="2">
																<span id="errfn2" style="color:red;"></span>
																<div id="checky" class="checkbox">
																	<label style="color:green;">
																	<span class="checked"><input type="checkbox" class="styled" id="copyTo" onclick="copyEmail()"></span>
																	Email as Username
																	</label>
																</div>
															</div>
															
														<div class="col-md-6">
																<label>Username</label>
																<input type="text" id="username" name="username" value="${user.username}" class="form-control" required="required" placeholder="Enter username" maxlength="30" minlength="2">
																<span id="errfn" style="color:red;"></span>
															</div>
														</div>
													</div>
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
															<div class="col-md-4">
																<label>Street No</label>
																<input type="text" name="streetno" value="${user.streetno}" class="form-control"  placeholder="Enter street no" maxlength="30" minlength="2">
															</div>
															<div class="col-md-4">
																<label>Street Name</label>
																<input type="text" name="streetname" value="${user.streetname}" class="form-control"  placeholder="Enter street name" maxlength="30" minlength="2">
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
																	<div class="col-md-6">
																		<label>Contact No</label> <input type="text" name="contactno"
																			value="${user.contactno}" class="form-control" required="required" placeholder="Enter contact no" maxlength="30" minlength="2">
																	</div>
																	<div class="col-md-6">
																		<label>User Role</label>
																		<c:choose>
																			<c:when test="${empty user.id }">
																			<select id="roleId" class="select" name="userrole" required="required">
																			<option value="">Select Role</option>
																			<option value="new">Add New Role</option>
																			<c:forEach items="${roles}" var="obj" varStatus="status">
																				<option value="${obj.id}">
																					<c:out value="${obj.role}" />
																				</option>
																			</c:forEach>
																		</select>
																			</c:when>
																			<c:otherwise>
																			<select id="roleId" class="select" name="userrole" required="required">
																			<option value="${user.userrole.id}">
																					<c:out value="${user.userrole.role}" />
																				</option>
																			<c:forEach items="${roles}" var="obj" varStatus="status">
																				<option value="${obj.id}">
																					<c:out value="${obj.role}" />
																				</option>
																			</c:forEach>
																		</select>
																			</c:otherwise>
																		</c:choose>
																	</div>
																</div>
															</div>

															<div class="form-group">
																<div class="row">
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
																		<label class="display-block">Upload profile image</label> <input
																			type="file" name="images" class="file-styled"
																			onchange="readURL(this);"> <span class="help-block">Accepted
																			formats: gif, png, jpg. Max file size 2Mb</span>
																	</div>
																	<div class="col-md-4">
																		<c:if test="${empty user.picture}">
																			<img id="blah" src="#" alt="" />
																		</c:if>
																	</div>
																</div>
															</div>

													<div class="text-right">
							                        	<button type="submit" id="submitButton" class="btn btn-primary">Save <i class="icon-arrow-right14 position-right"></i></button>
							                        </div>
												</form>
						</div>
					</div>
					<!-- /form horizontal -->

				</div>
	
</tiles:putAttribute>
</tiles:insertDefinition>
<script type="text/javascript">
populateCountries("country", "province");

gender = '<c:out value="${user.gender}"/>';
$('#gender option[value="' + gender + '"]').prop('selected', true);

$("#username").focusout(validateUserName);
$("#useremail").focusout(validateUserEmail);

function validateUserName() {
    var username = document.getElementById("username").value;	
    if(username!=""){
    	console.log("Ajax Calling..."+username);
    	$.ajax({
			type : "POST",
			contentType : "application/json",
			url : "${pageContext.request.contextPath}/findUsername?username=" + username,
			headers : {
				Accept : "text/plain; charset=utf-8",
				"Content-Type" : "text/plain; charset=utf-8"
			},
			data : {
				"username" : username
			},
			dataType : 'json',
			timeout : 100000,
			success : function(data) {
				console.log("SUCCESS: ", data);
				if(data!=null){
					document.getElementById("errfn").innerHTML="Opps...That username is taken. Try another.";
					document.getElementById("username").focus();
				}else{
					document.getElementById("errfn").innerHTML="";
				}
			},
			error : function(req, status, err) {
				document.getElementById("errfn").innerHTML="";
				console.log('something went wrong', status, err);
			}
		});
    }
}

function validateUserEmail() {
    var useremail = document.getElementById("useremail").value;	
    if(useremail!=""){
    	console.log("Ajax Calling..."+useremail);
    	$.ajax({
			type : "POST",
			contentType : "application/json",
			url : "${pageContext.request.contextPath}/findUseremail?useremail=" + useremail,
			headers : {
				Accept : "text/plain; charset=utf-8",
				"Content-Type" : "text/plain; charset=utf-8"
			},
			data : {
				"useremail" : useremail
			},
			dataType : 'json',
			timeout : 100000,
			success : function(data) {
				console.log("SUCCESS: ", data);
				if(data!=null){
					document.getElementById("errfn2").innerHTML="An Experience account already exists with this email address.";
					document.getElementById("useremail").focus();
				}else{
					document.getElementById("errfn2").innerHTML="";
				}
			},
			error : function(req, status, err) {
				document.getElementById("errfn2").innerHTML="";
				console.log('something went wrong', status, err);
			}
		});
    }
}

function copyEmail() {
	var copyTo = document.getElementById("copyTo").checked;
	console.log(copyTo);
	if(copyTo){
		document.getElementById("username").value = document.getElementById("useremail").value;
	}else{
		document.getElementById("username").value = "";
	}
}

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
<script type="text/javascript">
$(function(){
	  $('#roleId').on('change', function(){
	  var val = $(this).val();
	  if(val === 'new') {
		  openDialog();
	  }
	  })
})

function openDialog(){
    swal({
        title: "Add Role",
        type: "input",
        showCancelButton: true,
        confirmButtonColor: "#2196F3",
        closeOnConfirm: false,
        animation: "slide-from-right",
        inputPlaceholder: "Enter role name here"
    },
    function(inputValue){
        if (inputValue === false) return false;
        if (inputValue === "") {
            swal.showInputError("You need to write something!");
            return false
        }
        var x = document.getElementById("roleId");
        var option = document.createElement("option");
        option.text = inputValue;
        x.add(option);
        swal({
            title: "Nice!",
            text: "You added role: " + inputValue,
            type: "success",
            confirmButtonColor: "#2196F3"
        }); 
    });
}
</script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/assets/js/plugins/loaders/pace.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/assets/js/core/libraries/bootstrap.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/assets/js/plugins/loaders/blockui.min.js"></script>
	
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/assets/js/plugins/forms/styling/uniform.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/assets/js/plugins/forms/selects/select2.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/assets/js/plugins/ui/moment/moment.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/assets/js/plugins/visualization/echarts/echarts.js"></script>
	
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/assets/js/plugins/notifications/sweet_alert.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/assets/js/core/app.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/assets/js/pages/user_pages_profile.js"></script>
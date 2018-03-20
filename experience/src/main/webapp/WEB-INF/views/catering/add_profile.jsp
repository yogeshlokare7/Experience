<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<title>Experience</title>
<!-- Datatables -->
<link href="${pageContext.request.contextPath}/resources/css/datatables.net-bs/css/dataTables.bootstrap.min.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/resources/css/datatables.net-buttons-bs/css/buttons.bootstrap.min.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/resources/css/datatables.net-fixedheader-bs/css/fixedHeader.bootstrap.min.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/resources/css/datatables.net-responsive-bs/css/responsive.bootstrap.min.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/resources/css/datatables.net-scroller-bs/css/scroller.bootstrap.min.css" rel="stylesheet">
<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
		<div class="clearfix"></div>
		<div class="row">
			<div class="col-md-12 col-sm-12 col-xs-12">
				<div class="x_panel">
					<div class="x_title">
						<h2>Form Design</h2>
						<ul class="nav navbar-right panel_toolbox">
							<li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a></li>

							<li><a class="close-link"><i class="fa fa-close"></i></a></li>
						</ul>
						<div class="clearfix"></div>
					</div>
					<div class="x_content">
						<br />
						<form id="demo-form2" data-parsley-validate class="form-horizontal form-label-left">

							<div class="form-group">
								<label class="control-label col-md-3 col-sm-3 col-xs-12" for="first-name">Catering Id <span class="required">*</span>
								</label>
								<div class="col-md-6 col-sm-6 col-xs-12">
									<input type="text" id="cateringid" maxlength="11" required="required" class="form-control col-md-7 col-xs-12">
								</div>
							</div>
							<div class="form-group">
								<label class="control-label col-md-3 col-sm-3 col-xs-12" for="last-name">Food Type Id <span class="required">*</span>
								</label>
								<div class="col-md-6 col-sm-6 col-xs-12">
									<input type="text" id="foodtypeid" maxlength="11" name="lastname" required="required" class="form-control col-md-7 col-xs-12">
								</div>
							</div>
							<div class="form-group">
								<label for="middle-name" class="control-label col-md-3 col-sm-3 col-xs-12">Catering Manager Name<span class="required">*</span></label>
								<div class="col-md-6 col-sm-6 col-xs-12">
									<input id="cateringmanagername" maxlength="100" class="form-control col-md-7 col-xs-12" type="text" name="middle-name">
								</div>
							</div>
							
							<div class="form-group">
								<label for="middle-name" class="control-label col-md-3 col-sm-3 col-xs-12">Day Based Menu<span class="required">*</span></label>
								<div class="col-md-6 col-sm-6 col-xs-12">
									<input id="daybasedmenu" maxlength="30" class="form-control col-md-7 col-xs-12" type="text" name="middle-name">
								</div>
							</div>
							
							<div class="form-group">
								<label for="middle-name" class="control-label col-md-3 col-sm-3 col-xs-12">Time Based Menu<span class="required">*</span></label>
								<div class="col-md-6 col-sm-6 col-xs-12">
									<input id="timebasedmenu" maxlength="30" class="form-control col-md-7 col-xs-12" type="text" name="middle-name">
								</div>
							</div>
							
							<div class="form-group">
								<label for="middle-name" class="control-label col-md-3 col-sm-3 col-xs-12">Allergy Based Menu<span class="required">*</span></label>
								<div class="col-md-6 col-sm-6 col-xs-12">
									<input id="allergybasedmenu" maxlength="10" class="form-control col-md-7 col-xs-12" type="text" name="middle-name">
								</div>
							</div>
							
							<div class="form-group">
								<label for="middle-name" class="control-label col-md-3 col-sm-3 col-xs-12">Drink Type<span class="required">*</span></label>
								<div class="col-md-6 col-sm-6 col-xs-12">
									<input id="drinktype" maxlength="20" class="form-control col-md-7 col-xs-12" type="text" name="middle-name">
								</div>
							</div>
							
							
							
							<div class="ln_solid"></div>
							<div class="form-group">
								<div class="col-md-6 col-sm-6 col-xs-12 col-md-offset-3">
									<button class="btn btn-primary" type="button">Cancel</button>
									<button class="btn btn-primary" type="reset">Reset</button>
									<button type="submit" class="btn btn-success">Submit</button>
								</div>
							</div>

						</form>
					</div>
				</div>
			</div>
		</div>
	</tiles:putAttribute>
</tiles:insertDefinition>
<script src="${pageContext.request.contextPath}/resources/css/jquery/dist/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/css/bootstrap/dist/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/css/fastclick/lib/fastclick.js"></script>
<script src="${pageContext.request.contextPath}/resources/css/nprogress/nprogress.js"></script>
<script src="${pageContext.request.contextPath}/resources/css/build/js/custom.min.js"></script>

<script src="${pageContext.request.contextPath}/resources/css/iCheck/icheck.min.js"></script>
<!-- Datatables -->
<script src="${pageContext.request.contextPath}/resources/css/datatables.net/js/jquery.dataTables.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/css/datatables.net-bs/js/dataTables.bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/css/datatables.net-buttons/js/dataTables.buttons.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/css/datatables.net-buttons-bs/js/buttons.bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/css/datatables.net-buttons/js/buttons.flash.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/css/datatables.net-buttons/js/buttons.html5.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/css/datatables.net-buttons/js/buttons.print.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/css/datatables.net-fixedheader/js/dataTables.fixedHeader.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/css/datatables.net-keytable/js/dataTables.keyTable.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/css/datatables.net-responsive/js/dataTables.responsive.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/css/datatables.net-responsive-bs/js/responsive.bootstrap.js"></script>
<script src="${pageContext.request.contextPath}/resources/css/datatables.net-scroller/js/dataTables.scroller.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/css/jszip/dist/jszip.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/css/pdfmake/build/pdfmake.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/css/pdfmake/build/vfs_fonts.js"></script>
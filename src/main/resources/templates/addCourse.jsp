<%@page import="student.com.repository.CourseRepository"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@page import="student.com.service.CourseService" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
			
			CourseService courseService = new CourseService();
          
          	int courseCount = courseService.getCount();
            int nextSequence = courseCount + 1;
            
            String formattedCourseId = String.format("COU%03d", nextSequence);
            System.out.println(formattedCourseId);
          %>
<div class="container-scroller">
<jsp:include page="navbar.jsp"></jsp:include>
<div class="container-fluid page-body-wrapper">
<jsp:include page="sidebar.jsp"></jsp:include>

<!-- partial -->
        <div class="main-panel">
          <div class="content-wrapper">
            
            <div class="row">
              <div class="col-md-6 m-auto grid-margin stretch-card">
                <div class="card">
                  <div class="card-body">
                    <h4 class="card-title">Course Registration</h4>
                    
                    <form:form class="forms-sample addCourseForm" method="post" modelAttribute="courseDto">
                        
                      <div class="form-group row">
                        <label for="exampleInputUsername2" class="col-sm-3 col-form-label">Code</label>
                        <div class="col-sm-9">
                          <form:input class="form-control" id="exampleInputCode2" path="courseId" value="<%=formattedCourseId  %>" readonly="true"/>
                        </div>
                      </div>
                      
                      <div class="form-group row">
                        <label for="exampleInputCoursename2" class="col-sm-3 col-form-label">Name</label>
                        <div class="col-sm-9">
                          <form:input type="text" class="form-control" id="courseNameInput" path="name" />
                          <span id="courseNameError" style="color: red;"></span>
                        </div>
                      </div>
                      
                      <div class="form-group row">
                        <label for="exampleInputCoursename2" class="col-sm-3 col-form-label">Price</label>
                        <div class="col-sm-9">
                          <form:input type="number" class="form-control" id="coursePriceInput" path="price" />
                          <span id="coursePriceError" style="color: red;"></span>
                        </div>
                      </div>
                      
                      <div class="form-group row">
                        <label for="exampleInputCoursename2" class="col-sm-3 col-form-label">Month</label>
                        <div class="col-sm-9">
                          <form:input type="number" class="form-control" id="courseMonthInput" path="month" />
                          <span id="courseMonthError" style="color: red;"></span>
                        </div>
                      </div>
                      
                      <div class="form-group row">
                        <label for="exampleInputCoursename2" class="col-sm-3 col-form-label">Period</label>
                        <div class="col-sm-9">
                          <form:input type="text" class="form-control" id="coursePeriodInput" path="period" />
                          <span id="coursePeriodError" style="color: red;"></span>
                        </div>
                      </div>
                     
                      <button type="submit" class="btn btn-primary me-2" id="courseSubmitButton">Submit</button>
                    </form:form>
                  </div>
                </div>
              </div>
              
             </div>
          </div>
          <!-- content-wrapper ends -->
         <jsp:include page="footer.jsp"></jsp:include>
        </div>
        <!-- main-panel ends -->
         </div>
      <!-- page-body-wrapper ends -->
     </div>
    <!-- container-scroller -->
  <!-- plugins:js -->
    <script src="assets/vendors/js/vendor.bundle.base.js"></script>
    <!-- endinject -->
    <!-- Plugin js for this page -->
    <!-- End plugin js for this page -->
    <!-- inject:js -->
    <script src="assets/js/off-canvas.js"></script>
    <script src="assets/js/hoverable-collapse.js"></script>
    <script src="assets/js/misc.js"></script>
    <!-- endinject -->
    <!-- Custom js for this page -->
    <script src="assets/js/file-upload.js"></script>
    <!-- End custom js for this page -->
    <script src="assets/js/validation.js"></script>  
    <script src="https://cdnjs.cloudflare.com/ajax/libs/sweetalert2/11.11.0/sweetalert2.all.min.js"></script>
</body>
</html>
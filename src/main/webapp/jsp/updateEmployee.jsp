<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<!-- Bootstrap核心CSS文件 -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css"
	integrity="sha384-HSMxcRTRxnN+Bdg0JdbxYKrThecOKuH5zCYotlSAcp1+c8xmyTe9GYg1l9a69psu"
	crossorigin="anonymous">
<meta charset="UTF-8">
<title>修改信息</title>
</head>
<body>
<div class="container">
		<div class="row">
			<div clss="col-md-12">
				<h2>修改信息</h2>
			</div>
		</div>
		<div class="row">
			<form class="form-horizontal" action="${pageContext.request.contextPath}/employee/updateEmployee">
				<input type="hidden" name="employeeId" value="${employee.getEmployeeId()}"/>
				<div class="form-group">
					<label for="employeeName" class="col-sm-2 control-label">员工名称：</label>
					<div class="col-sm-4">
						<input type="text" class="form-control" id="employeeName"
							   name="employeeName" value="${employee.getEmployeeId()}">
					</div>
				</div>
				<div class="form-group">
					<label for="employeeSex" class="col-sm-2 control-label">员工性别：</label>
					<div class="col-sm-4">
						<input type="text" class="form-control" id="employeeSex"
							   name="employeeSex" value="${employee.getEmployeeSex()}">
					</div>
				</div>
				<div class="form-group">
					<label for="employeeDepartment" class="col-sm-2 control-label">员工部门：</label>
					<div class="col-sm-4">
						<input type="text" class="form-control" id="employeeDepartment"
							   name="employeeDepartment" value="${employee.getEmployeeDepartment()}">
					</div>
				</div>
				<div class="form-group">
					<label for="employeeDutyType" class="col-sm-2 control-label">员工职务：</label>
					<div class="col-sm-4">
						<input type="text" class="form-control" id="employeeDutyType"
							   name="employeeDutyType" value="${employee.getEmployeeDutyType()}">
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-10">
						<button type="submit" class="btn btn-default">提交 </button>
					</div>
				</div>
			</form>
		</div>
		
	</div>
	</div>
</body>
</html>
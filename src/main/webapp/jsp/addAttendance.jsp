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
  <title>添加考勤信息</title>
</head>
<body>
<div class="container">
  <div class="row">
    <div clss="col-md-12">
      <h2>新增考勤信息</h2>
    </div>
  </div>
  <div class="row">
    <form class="form-horizontal" action="${pageContext.request.contextPath}/attendance/addAttendance">

      <div class="form-group">
        <label for="EmployeeId" class="col-sm-2 control-label">员工编号：</label>
        <div class="col-sm-4">
          <input type="text" class="form-control" id="EmployeeId" name="EmployeeId">
        </div>
      </div>
      <div class="form-group">
        <label for="EmployeeName" class="col-sm-2 control-label">员工姓名：</label>
        <div class="col-sm-4">
          <input type="text" class="form-control" id="EmployeeName" name="EmployeeName">
        </div>
      </div>
      <div class="form-group">
        <label for="Appear" class="col-sm-2 control-label">出勤天数：</label>
        <div class="col-sm-4">
          <input type="text" class="form-control" id="Appear" name="Appear">
        </div>
      </div>
      <div class="form-group">
        <label for="Leave" class="col-sm-2 control-label">请假天数：</label>
        <div class="col-sm-4">
          <input type="text" class="form-control" id="Leave" name="Leave">
        </div>
      </div> <div class="form-group">
      <label for="LateEarlyLeave" class="col-sm-2 control-label">迟到或早退：</label>
      <div class="col-sm-4">
        <input type="text" class="form-control" id="LateEarlyLeave" name="LateEarlyLeave">
      </div>
    </div> <div class="form-group">
      <label for="AbsentWork" class="col-sm-2 control-label">旷工天数：</label>
      <div class="col-sm-4">
        <input type="text" class="form-control" id="AbsentWork" name="AbsentWork">
      </div>
    </div> <div class="form-group">
      <label for="Overtime" class="col-sm-2 control-label">加班天数：</label>
      <div class="col-sm-4">
        <input type="text" class="form-control" id="Overtime" name="Overtime">
      </div>
    </div>



      <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
          <button type="submit" class="btn btn-default">添加</button>··	··
        </div>
      </div>
    </form>
  </div>

</div>
</div>
</body>
</html>
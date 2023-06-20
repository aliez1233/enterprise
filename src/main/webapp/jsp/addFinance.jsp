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
  <title>添加账单信息</title>
</head>
<body>
<div class="container">
  <div class="row">
    <div class="col-md-12">
      <h2>新增账单</h2>
    </div>
  </div>
  <div class="row">
    <form class="form-horizontal" action="${pageContext.request.contextPath}/finance/addFinance">

      <div class="form-group">
        <label for="FinanceName" class="col-sm-2 control-label">账单名称：</label>
        <div class="col-sm-4">
          <input type="text" class="form-control" id="FinanceName" name="FinanceName">
        </div>
      </div>

      <div class="form-group">
        <label for="FinanceType" class="col-sm-2 control-label">账单类型：</label>
        <div class="col-sm-4">
          <input type="text" class="form-control" id="FinanceType" name="FinanceType">
        </div>
      </div>

      <div class="form-group">
        <label for="EmployeeName" class="col-sm-2 control-label">负责人：</label>
        <div class="col-sm-4">
          <input type="text" class="form-control" id="EmployeeName" name="EmployeeName">
        </div>
      </div>

      <div class="form-group">
        <label for="Money" class="col-sm-2 control-label">账单金额：</label>
        <div class="col-sm-4">
          <input type="text" class="form-control" id="Money" name="Money">
        </div>
      </div>

      <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
          <button type="submit" class="btn btn-default">添加</button>
        </div>
      </div>
    </form>
  </div>
</div>
</body>
</html>

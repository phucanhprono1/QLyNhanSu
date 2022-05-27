<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Quản Lý Phòng Ban</title>
<link href="/resources/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<link href="/resources/css/stylesTK.css" rel="stylesheet">
<style>
	#thongbao{
		color: red;
	}
</style>
</head>
<body>
	<c:import url="header.jsp"/>
    <div id="content">
     	<div class="container">
      	<h3 class="text-center">Thêm Phòng Ban</h3>
      	<h4 class="text-center" id="thongbao">${thongbao }</h4>
      	<div class="row">
      		<div class="col-md-4 col-md-offset-4">
      			<form  method="post" class="form-horizontal">
					<div class="form-group">
					  	<label class="col-md-4 control-label" >Mã Phòng Ban</label>
					  	<div class="col-md-8">
		        			<input name="mapb" class="form-control" type="text" placeholder="Nhập mã phòng ban">
		        		</div>
					  	
					</div>			
		        	<div class="form-group">
		        		<label class="col-md-4 control-label">Tên Phòng Ban</label>
		        		<div class="col-md-8">
		        			<input name="tenpb" class="form-control" type="text" placeholder="Nhập tên phòng ban">
		        		</div>
		        	</div>
		        	<div class="form-group">
			        	<label class="col-md-4 control-label">SĐT Phòng Ban</label>
			        	<div class="col-md-8">
			        		<input name="sdtpb" class="form-control" type="number" placeholder="Nhập SĐT">
			        	</div>
			        	
		        	</div>
		        	<div class="form-group">
		        		<div class="col-md-offset-4 col-md-8">
		        			<button class="btn btn-primary" type="submit">Thêm</button>
		        		</div>
		        	</div>
		        </form>
      		</div>
      	</div>
        
      </div>
      
    </div><!--#content-->


    <div id="footer">
      
    </div><!--#footer-->
    
    <script src="/resources/bootstrap/js/jquery.min.js"></script>
    
    <script src="/resources/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>
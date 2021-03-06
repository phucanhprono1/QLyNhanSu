<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Quản lý nhân sự</title>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" type="text/css" href="resources/css/styles.css">
	<script src='<c:url value="resources/JS/jquery-3.3.1.min.js"/>'></script>
	<script src='<c:url value="resources/JS/custom.js"/>'></script>
</head>
<body>
	<!-- header -->
	<header>
		<div class="container">
			<div class="row">
				<!-- end logo -->
				<div class="right">
					<!-- top-bar -->
					<div class="top-bar">
						<ul class="wrap">
							<c:choose>
								<c:when test="${chucaidau !=null }">
							<li class="item">
								<span class="text">
									<a href="/doimatkhau">${chucaidau} </a>
								</span>
							</li>
							<li class="item">
								<span class="text">
									<a href="thoat">Thoát</a>
								</span>
							</li>		
								</c:when>
								<c:otherwise>
							<li class="item">
								<span class="text">	
									<a href="dangnhap">Đăng nhập</a>
								</span>
							</li>
 							<li class="item">
 								<span class="text">
 									<a href="dangky">Đăng ký</a>
 								</span>
							</li>
								</c:otherwise>
								</c:choose>
						</ul>
					</div>
					<!-- main-bar -->
					<div class="main-bar">
						<div class="menu">
							<ul class="wrap-menu">
								<li class="item active">
									<a href="#">Trang Chủ</a>
								</li>
								
								<li class="item">
									<a href="#">Giới Thiệu</a>
								</li>
								<li class="item">
								<c:choose>
									<c:when test="${chucaidau !=null }">
										<a href="nhanvien">Quản Lý</a>
									</c:when>
								</c:choose>
									
								</li>
							</ul>
						</div>
						<div class="search">
							
						</div>
					</div>
					<!-- end main-bar -->

				</div>
				<!-- end top-bar -->
			

				</div>
			</div>
		</div>
	</header>
	<!-- end header -->
</body>
</html>
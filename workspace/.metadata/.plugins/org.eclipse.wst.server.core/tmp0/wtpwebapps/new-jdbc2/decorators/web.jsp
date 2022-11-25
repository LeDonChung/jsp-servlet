<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><dec:title default="Trang Chủ" /></title>
<!-- Bootstrap core CSS -->
<link
	href="<c:url value='/template/web/bootstrap/css/bootstrap.min.css' />"
	rel="stylesheet" type="text/css" media="all" />
<!-- Custom styles for this template -->
<link
	href="<c:url value='/template/web/css/shop-item.css' />"
	rel="stylesheet" type="text/css" media="all" />
</head>
<body>
	<!-- header -->
	<%@ include file="/common/web/header.jsp"%>
	<!-- header -->

	<!-- container -->
	<div class="container">
    	<dec:body/>
    </div>
	<!-- container -->

	<!-- footer -->
	<%@ include file="/common/web/footer.jsp"%>
	<!-- footer -->

	<!-- Bootstrap core JavaScript -->
	<script src="<c:url value='/template/web/jquery/jquery.min.js'/>"></script>
	
</body>
</html>
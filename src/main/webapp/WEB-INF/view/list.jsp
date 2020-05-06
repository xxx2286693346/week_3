<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- 视窗 -->
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<title></title>
<!-- 引入样式 -->
<link href="/resource/css/bootstrap.min.css" rel="stylesheet">
<script type="text/javascript" src="/resource/js/jquery-3.2.1.js"></script>
<script type="text/javascript" src="/resource/js/bootstrap.min.js"></script>
</head>
<script type="text/javascript">
	function goPage(pageNum){
		$("[name='pageNum']").val(pageNum);
		$("form").submit();
	}
</script>
<body>
<form action="/list" method="post">
<input type="hidden" name="pageNum">
	姓名:<input type="text" name="name" value="${name}">
	手机:<input type="text" name="phone" value="${phone}">
	房型:<input type="text" name="typename" value="${typename}"><br><br>
	房价:<input type="text" name="staprice" value="${staprice}">--<input type="text" name="endprice" value="${endprice}"><br><br>
	预订日期:<input type="date" name="staDate" value="<fmt:formatDate value="${staDate}" pattern="yyyy-MM-dd"/>">--<input type="date" name="endDate" value="<fmt:formatDate value="${endDate}" pattern="yyyy-MM-dd"/>">
	<input type="submit" value="查询">
</form>
	<table class="table">
		<thead class="thead-dark">
			<tr>
				<th scope="col">预订日期</th>
				<th scope="col">姓名</th>
				<th scope="col">手机</th>
				<th scope="col">房型</th>
				<th scope="col">房价</th>
				<th scope="col">备注</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${info.list}" var="room">
				<tr>
					<td>
					<fmt:formatDate value="${room.created}" pattern="yyyy-MM-dd"/>
					</td>
					<td>${room.name}</td>
					<td>${room.phone}</td>
					<td>${room.roomType.typename}</td>
					<td>${room.roomType.price}</td>
					<td>${room.remark}</td>
				</tr>
			</c:forEach>
			<tr>
				<td colspan="10"><jsp:include
						page="/WEB-INF/view/comment/pages.jsp"></jsp:include></td>
			</tr>
		</tbody>
	</table>
</body>
</html>
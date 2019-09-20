<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>게시판</h1>
	
	<table border="1">
		<tr>
			<th>글번호</th>
			<th>제목</th>
			<th>조회수</th>
			<th>작성자</th>
			<th>작성일</th>
			<th><input type="image" ></th>
		</tr>
		
		<c:choose>
			<c:when test="${empty list }">
				<td>작성된 글이 없습니다.</td>
			</c:when>
			<c:otherwise>
				<c:forEach items="${list}" var="dto">
					<tr>
						<td>${dto.productboard_no }</td>
						<td>${dto.productboard_title }</td>
						<td>${dto.productboard_readcount }</td>
						<td>${dto.id }</td>
						<td>${dto.productboard_regdate }</td>
						<td>${dto.productboard_starscore }</td>
					</tr>
				</c:forEach>
			</c:otherwise>
		</c:choose>
		
	</table>
	

</body>
</html>
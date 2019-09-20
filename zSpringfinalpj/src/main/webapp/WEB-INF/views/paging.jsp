<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	request.setCharacterEncoding("UTF-8");
%>
<%
	response.setContentType("text/html; charset=UTF-8");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function goPage(pages, lines) {
		var url = "&pages=" + pages + "&lines=" + lines;
		var searchFiled = "${paging.searchFiled}";
		var searchValue = "${paging.searchValue}";
		url += "&searchFiled=" + searchFiled + "&searchValue=" + searchValue;
		location.href = 'recipeboard.do?command=search' + url;
	}
</script>
<style type="text/css">
.prev, .choice, .next, .other {
	text-decoration: none;
	color: black;
}
</style>
</head>
<body>

	<div class="paginate">

		<c:if test="${param.currentPageNo ne param.firstPageNo}">
			<a
				href="javascript:goPage(${param.prevPageNo}, ${param.recordsPerPage})"
				class="prev">이전</a>
		</c:if>
		<span> <c:forEach var="i" begin="${param.startPageNo}"
				end="${param.endPageNo}" step="1">
				<c:choose>
					<c:when test="${i eq param.currentPageNo}">
						<b><font size=+1> <a
								href="javascript:goPage(${i}, ${param.recordsPerPage})"
								class="choice">${i}</a>
						</font> </b>
					</c:when>
					<c:otherwise>
						<a href="javascript:goPage(${i}, ${param.recordsPerPage})"
							class="other">${i}</a>
					</c:otherwise>
				</c:choose>
			</c:forEach>
		</span>
		<c:if test="${param.currentPageNo ne param.finalPageNo}">
			<a
				href="javascript:goPage(${param.nextPageNo}, ${param.recordsPerPage})"
				class="next">다음</a>
		</c:if>
		</div>
</body>
</html>
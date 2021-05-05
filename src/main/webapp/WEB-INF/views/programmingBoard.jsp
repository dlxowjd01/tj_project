<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html>

<html>

<head>

<meta charset="UTF-8">

<title>programming</title>

</head>

<body>

<h2>programming list</h2>

	<table>

		<colgroup>

			<col style="width:5%;" />

			<col style="width:auto;" />

			<col style="width:15%;" />

			<col style="width:10%;" />

			<col style="width:10%;" />

		</colgroup>

		<thead>

			<tr> 

				<th>NO</th>

				<th>글제목</th>

				<th>작성자</th>

				<th>글내용</th>

				<th>작성일</th>

			</tr>

		</thead>

		<tbody>

			<c:choose>

				<c:when test="${empty programmingList }" >

					<tr><td colspan="5" align="center">데이터가 없습니다.</td></tr>

				</c:when> 

				<c:when test="${!empty programmingList}">

					<c:forEach var="list" items="${programmingList}">

						<tr>

							<td><c:out value="${list.pno}"/></td>

							<td><c:out value="${list.subject}"/></td>

							<td><c:out value="${list.writer}"/></td>

							<td><c:out value="${list.contents}"/></td>

							<td><c:out value="${list.nowdate}"/></td>

						</tr>

					</c:forEach>

				</c:when>

			</c:choose>

		</tbody>

	</table>

</body>

</html>
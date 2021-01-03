<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>

<head>
	<title>Save Review</title>

	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/style.css">

	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/add-customer-style.css">
</head>
<body>

<header>
	<h2>CRM - College Relationship Manager</h2>
</header>

<div id="container">
	<h3>Save Review</h3>

	<form:form action="/save/saveReview" modelAttribute="review" method="POST">

		<!-- need to associate this data with customer id -->
		<form:hidden path="id" />

		<table>
			<tbody>
			<tr>
				<td><label>Comment:</label></td>
				<td><form:input path="comment" /></td>
			</tr>

			<tr>
			<td><label>Course:</label></td>
				<td>
					<select name="course.id">
						<option value="NONE">---Select---</option>
						<c:forEach items="${courseList}" var="i">
							<option value="${i.id}">
									${i.title}
							</option>
						</c:forEach>
					</select>
				</td>
			</tr>


			<tr>
				<td><a href="${pageContext.request.contextPath}/show/showReviewsList"><input class="back-btn" value="Back"></a></td>
				<td><input type="submit" value="Save" class="save" /></td>
			</tr>


			</tbody>
		</table>

	</form:form>

	<div style="clear; both;"></div>

</div>

</body>

</html>
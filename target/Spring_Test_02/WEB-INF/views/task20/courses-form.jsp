<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>

<head>
	<title>Save Instructor</title>

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
	<h3>Save Course</h3>

	<form:form action="/save/saveCourse" modelAttribute="course" method="POST">

		<form:hidden path="id" />

		<table>
			<tbody>
			<tr>
				<td><label>Instructor:</label></td>

				<td>
					<select name="instructor.id">
						<option value="NONE">---Select---</option>
						<c:forEach items="${instructorList}" var="i">
							<option value="${i.id}">
								${i.first_name} ${i.last_name}
							</option>
						</c:forEach>
					</select>
				</td>
			</tr>

			<tr>
				<td><label>Title:</label></td>
				<td><form:input path="title" /></td>
			</tr>

			<tr>
				<td><a href="${pageContext.request.contextPath}/show/showCourseList"><input class="back-btn" value="Back"></a></td>
				<td><input type="submit" value="Save" class="save" /></td>
			</tr>


			</tbody>
		</table>

	</form:form>

	<div style="clear; both;"></div>

</div>

</body>

</html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

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

		<!-- need to associate this data with customer id -->
		<form:hidden path="id" />

		<table>
			<tbody>
			<tr>
				<td><label>Title:</label></td>
				<td><form:input path="title" /></td>
			</tr>

			<tr>
				<td><label>Instructor:</label></td>
				<td><form:input path="instructor" /></td>
			</tr>

			<tr>
				<td><a href="${pageContext.request.contextPath}/show/showCourseList"><input class="back-btn" type="submit" value="Back"></a></td>
				<td><input type="submit" value="Save" class="save" /></td>
			</tr>


			</tbody>
		</table>

	</form:form>

	<div style="clear; both;"></div>

</div>

</body>

</html>
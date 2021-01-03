<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="springform" uri="http://www.springframework.org/tags/form" %>

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
	<h3>Save Instructor Detail</h3>

	<form:form action="/save/saveInstructorDetail" modelAttribute="instructorDetail" method="POST">
		<table>
			<tbody>

			<!-- need to associate this data with customer id -->
			<form:hidden path="id" />


			<tr>
				<td><label>Youtube channel:</label></td>
				<td><form:input path="youtubeChannel" /></td>
			</tr>

			<tr>
				<td><label>Hobby:</label></td>
				<td><form:input path="hobby" /></td>
			</tr>


			<tr>
				<td><a href="${pageContext.request.contextPath}/show/showInstructorDetailsList"><input class="back-btn" value="Back"></a></td>
				<td><input type="submit" value="Save" class="save" /></td>
			</tr>

			</tbody>
		</table>

	</form:form>

	<div style="clear; both;"></div>

</div>

</body>

</html>


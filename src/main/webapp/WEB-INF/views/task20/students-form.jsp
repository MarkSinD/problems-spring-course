<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>

<head>
	<title>Save Strudent</title>

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
	<h3>Save Student</h3>

	<form:form action="/save/saveStudent" modelAttribute="student" method="POST">

		<!-- need to associate this data with customer id -->
		<form:hidden path="id" />

		<table>
			<tbody>
			<tr>
				<td><label>First name:</label></td>
				<td><form:input path="first_name" /></td>
			</tr>

			<tr>
				<td><label>Last name:</label></td>
				<td><form:input path="last_name" /></td>
			</tr>

			<tr>
				<td><label>Email:</label></td>
				<td><form:input path="email" /></td>
			</tr>

			<tr>
				<td><label>Courses :</label></td>
				<%--<td>
					<select name="courseList.id" multiple="multiple">
						<option value="NONE">---Select---</option>
						<c:forEach items="${courseList}" var="i">
							<option value="${i.id}">
								Channel: ${i.title}
							</option>
						</c:forEach>
					</select>
				</td>--%>
				<td>
					<form:select multiple="true" path="courseList">
						<form:options items="${courseList}" itemValue="id" itemLabel="title"/>
					</form:select>
				</td>
			</tr>


			<tr>
				<td><a href="${pageContext.request.contextPath}/show/showStudentsList"><input class="back-btn" value="Back"></a></td>
				<td><input type="submit" value="Save" class="save" /></td>
			</tr>


			</tbody>
		</table>

	</form:form>

	<div style="clear; both;"></div>

</div>

</body>

</html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <title>College</title>

    <!-- reference our style sheet -->
    <link type="text/css"
          rel="stylesheet"
          href="${pageContext.request.contextPath}/resources/css/style.css" />
</head>
<body>
<header>
    <h2>CRM - College Relationship Manager</h2>
</header>

<div class="tabs">
    <input type="button" value="Instructors"
           onclick="window.location.href='showInstructorsList'; return false;"
           class="tab"
    />

    <input type="button" value="Instructor Details"
           onclick="window.location.href='showInstructorDetailsList'; return false;"
           class="tab"
    />

    <input type="button" value="Course"
           onclick="window.location.href='showCourseList'; return false;"
           class="tab"
    />

    <input type="button" value="Reviews"
           onclick="window.location.href='showReviewsList'; return false;"
           class="tab active"
    />

    <input type="button" value="Students"
           onclick="window.location.href='showStudentsList'; return false;"
           class="tab"
    />
</div>

<c:url var="id" value="/show/showInstructorsListSorted">
    <c:param name="type" value="id" />
</c:url>

<c:url var="first_name" value="/show/showInstructorsListSorted">
    <c:param name="type" value="first_name" />
</c:url>

<c:url var="last_name" value="/show/showInstructorsListSorted">
    <c:param name="type" value="last_name" />
</c:url>

<c:url var="email" value="/show/showInstructorsListSorted">
    <c:param name="type" value="email" />
</c:url>

<div id="container">

    <div id="content">

        <!--  add our html table here -->
        <table>
            <tr>
                <th>
                    <a class="table_link">id</a>
                </th>

                <th>
                    <a class="table_link">first name</a>

                </th>

                <th>
                    <a class="table_link">last name</a>

                </th>

                <th>
                    <a class="table_link">email</a>
                </th>
                <th>Action</th>
            </tr>

            <!-- loop over and print our customers -->
            <c:forEach var="tempInstructor" items="${instructors}">

                <!-- construct an "update" link with customer id -->
                <c:url var="updateLink" value="/customer/showFormForUpdate">
                    <c:param name="instructorId" value="${tempInstructor.id}" />
                </c:url>

                <c:url var="deleteLink" value="/delete/deleteInstructor">
                    <c:param name="instructorId" value="${tempInstructor.id}" />
                </c:url>

                <tr>
                    <td> ${tempInstructor.id}</td>
                    <td> ${tempInstructor.first_name} </td>
                    <td> ${tempInstructor.last_name} </td>
                    <td> ${tempInstructor.email} </td>

                    <td>
                    <!-- display the update link -->
                    <a class="table_link" href="${updateLink}"><img class="table_icon" src="${pageContext.request.contextPath}/resources/images/refresh.png">Update</a>
                    <a class="table_link" href="${deleteLink}"
                       onclick="if (!(confirm('Are you sure you want to delete this customer?')))
                                        return false"><img class="table_icon" src="${pageContext.request.contextPath}/resources/images/remove.png">Delete</a>
                </td>
                </tr>

            </c:forEach>
        </table>
    </div>
    <!-- put new button: Add Customer -->

    <input type="button" value="Add Instructor"
           onclick="window.location.href='/edit/showInstructorFormAdd'; return false;"
           class="add-button"
    />

</div>


</body>

</html>










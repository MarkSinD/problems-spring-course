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
           class="tab active"
    />

    <input type="button" value="Reviews"
           onclick="window.location.href='showReviewsList'; return false;"
           class="tab"
    />

    <input type="button" value="Students"
           onclick="window.location.href='showStudentsList'; return false;"
           class="tab"
    />
</div>

<c:url var="id" value="/show/showCourseListSorted">
    <c:param name="type" value="id" />
</c:url>

<c:url var="title" value="/show/showCourseListSorted">
    <c:param name="type" value="title" />
</c:url>

<c:url var="instructor_name" value="/show/showCourseListSorted">
    <c:param name="type" value="instructor_name" />
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
                    <a class="table_link">Title</a>

                </th>

                <th>
                    <a class="table_link">Instructor Name</a>
                </th>
                <th>Action</th>
            </tr>

            <!-- loop over and print our customers -->
            <c:forEach var="tempCourse" items="${courses}">
                <tr>
                    <td> ${tempCourse.id}</td>
                    <td> ${tempCourse.title} </td>
                    <td> ${tempCourse.instructor.first_name} ${tempCourse.instructor.last_name} </td>

                    <c:url var="updateLink" value="/customer/showFormForUpdate">
                        <c:param name="courseId" value="${tempCourse.id}" />
                    </c:url>

                    <c:url var="deleteLink" value="/delete/deleteCourse">
                        <c:param name="courseId" value="${tempCourse.id}" />
                    </c:url>

                    <td>
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

    <input type="button" value="Add Course"
           onclick="window.location.href='/edit/showCourseFormAdd'; return false;"
           class="add-button"
    />
</div>
</body>
</html>










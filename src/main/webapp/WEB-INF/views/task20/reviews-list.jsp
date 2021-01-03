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

<c:url var="course" value="/show/showInstructorsListDetailsSorted">
    <c:param name="type" value="course" />
</c:url>

<c:url var="comments" value="/show/showInstructorsListDetailsSorted">
    <c:param name="type" value="comments" />
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
                    <a class="table_link">Course</a>
                </th>

                <th>
                    <a class="table_link">Comments</a>
                </th>
                <th>Action</th>
            </tr>

            <!-- loop over and print our customers -->
            <c:forEach var="tempReview" items="${reviews}">

                <!-- construct an "update" link with customer id -->
                <c:url var="updateLink" value="/customer/showFormForUpdate">
                    <c:param name="reviewId" value="${tempReview.id}" />
                </c:url>

                <c:url var="deleteLink" value="/delete/deleteReview">
                    <c:param name="reviewId" value="${tempReview.id}" />
                </c:url>

                <tr>
                    <td> ${tempReview.id}</td>
                    <td> ${tempReview.course.title} </td>
                    <td> ${tempReview.comment} </td>


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

    <input type="button" value="Add Review"
           onclick="window.location.href='/edit/showReviewsFormAdd'; return false;"
           class="add-button"
    />

</div>
</body>
</html>










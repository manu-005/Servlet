<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>TV Details</title>

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
        body {
            background-color: #f8f9fa;
        }
        .nav-btn {
            width: 200px;
        }
    </style>
</head>
<body>

<!-- ======== NAVBAR ======== -->
<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
    <div class="container">
        <a class="navbar-brand" href="#">TV System</a>

        <div class="ms-auto">
            <a href="index.jsp" class="btn btn-warning nav-btn">Home TV</a>
            <a href="AddTv.jsp" class="btn btn-light nav-btn me-2">Add TV</a>
            <a href="SearchTv.jsp" class="btn btn-warning nav-btn">Search TV</a>
            <a href="SearchTVByBrand.jsp" class="btn btn-warning nav-btn">Search TV by Brand</a>
        </div>
    </div>
</nav>


<!-- ======== MAIN CONTENT ======== -->
<div class="container mt-5">
    <h2 class="text-center text-primary mb-4">TV Details by Brand</h2>

    <table class="table table-bordered table-hover table-striped text-center">
        <thead class="table-dark">
            <tr>
                <th>TV Id</th>
                <th>TV Name</th>
                <th>Brand</th>
                <th>Size</th>
                <th>Availability</th>
                <th>Action</th>
            </tr>
        </thead>

        <tbody>
            <c:forEach var="b" items="${dtoBrand}">
                <tr>
                    <td>${b.id}</td>
                    <td>${b.name}</td>
                    <td>${b.brand}</td>
                    <td>${b.size}</td>

                    <td>
                        <span class="badge bg-${b.avail ? 'success' : 'danger'}">
                            ${b.avail}
                        </span>
                    </td>

                    <td>
                        <a href="edit?id=${b.name}" class="btn btn-sm btn-primary">
                            Edit
                        </a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</div>


<!-- ======== FOOTER ======== -->
<footer class="text-center bg-dark text-white p-3 mt-5">
    <p class="mb-0">2025 TV System. All Rights Reserved.</p>
</footer>


<!-- Bootstrap JS -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>

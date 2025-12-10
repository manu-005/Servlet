<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Search TV</title>

    <!-- Bootstrap -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
        body {
            background: #f8f9fa;
        }
        .card {
            border-radius: 15px;
        }
        header, footer {
            background: #0d6efd;
            color: white;
            padding: 15px;
            text-align: center;
        }
        footer {
            margin-top: 40px;
            background: black;
        }
        table {
            width: 100%;
            background: white;
            border-radius: 10px;
            overflow: hidden;
        }
    </style>
</head>

<body>


<!-- ======== NAVBAR ======== -->
<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
    <div class="container">
        <a class="navbar-brand" href="#">TV System</a>

        <div class="ms-auto">
            <a href="AddTv.jsp" class="btn btn-light nav-btn me-2">Add TV</a>
            <a href="SearchTv.jsp" class="btn btn-warning nav-btn">Search TV</a>
        </div>
    </div>
</nav>
<div class="container mt-5">

    <div class="card shadow p-4">

        <h3 class="text-center text-primary mb-3">Search TV</h3>

        <!-- Search Form -->
        <form action="search" method="get">
            TV Name :
            <input type="text" name="name" id="name" required>
            <input type="submit" name="Submit">
        </form>

        <br>

        <!-- Horizontal Table -->


        <!-- Error -->
        <c:if test="${not empty error}">
            <h5 class="text-danger">${error}</h5>
        </c:if>

    </div>
</div>

<!-- FOOTER -->
<footer>
    © 2025 TV Management System | All Rights Reserved
</footer>

</body>
</html>

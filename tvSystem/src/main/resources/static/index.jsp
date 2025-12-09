<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>TV System</title>

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
            <a href="AddTv.jsp" class="btn btn-light nav-btn me-2">Add TV</a>
            <a href="SearchTv.jsp" class="btn btn-warning nav-btn">Search TV</a>
        </div>
    </div>
</nav>


<!-- ======== MAIN CONTENT ======== -->
<div class="container text-center mt-5">
    <h1 class="text-primary">Welcome to TV Management System</h1>
    <p class="lead mt-3">Use the buttons above to Add a TV or Search a TV.</p>
</div>


<!-- ======== FOOTER ======== -->
<footer class="text-center bg-dark text-white p-3 mt-5">
    <p class="mb-0">© 2025 TV System. All Rights Reserved.</p>
</footer>


<!-- Bootstrap + Basic JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>

<script>
    console.log("Index Page Loaded Successfully!");
</script>

</body>
</html>

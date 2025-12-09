<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Library Management System</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">

</head>
<body>
<!-- nav bar -->

<div class=" p-3  mb-2 bg-primary-subtle text-primary-emphasis">
<ul class="nav">
  <li class="nav-item">
    <a class="nav-link active" aria-current="page" href="index.jsp">Home</a>
  </li>
  <li class="nav-item">
    <a class="nav-link active" href="AddBook.jsp">Add Book</a>
  </li>
  <li class="nav-item">
    <a class="nav-link active" href="#">Browse Books</a>
  </li>
  <li class="nav-item">
    <a class="nav-link " href="SearchByBookName.jsp" >Search Book By Book Name</a>
  </li>
</ul>
</div>



<!-- end navbar -->

<div class="container mt-5 ">
    <div class="card shadow-lg p-4">
        <h2 class="text-center mb-4 text-primary ">Update Book Details</h2>

        <form action="update" method="post" id="bookForm">

            <div class="mb-3">
                <label class="form-label">Book Name</label>
                <input type="text" class="form-control" name="bName" id="bName" required disabled>
            </div>

            <div class="mb-3">
                <label class="form-label">Author Name</label>
                <input type="text" class="form-control" name="aName" id="aName" required>
            </div>

            <div class="mb-3">
                <label class="form-label">Price</label>
                <input type="number" class="form-control" name="price" id="price" required>
            </div>

            <div class="mb-3">
                <label class="form-label">No. of Copies</label>
                <input type="number" class="form-control" name="noOfCopies" id="noOfCopies" required>
            </div>

            <div class="mb-3">
                <label class="form-label">Is Available</label>
                <div class="form-check">
                    <input class="form-check-input" type="radio" name="isAvailable" value="yes" id="availableYes" required>
                    <label class="form-check-label" for="availableYes">Yes</label>
                </div>

                <div class="form-check">
                    <input class="form-check-input" type="radio" name="isAvailable" value="no" id="availableNo">
                    <label class="form-check-label" for="availableNo">No</label>
                </div>
            </div>

            <input type="submit" class="btn btn-primary w-100" value="Update">
        </form>
    </div>
</div>

<!-- Footer -->
<footer class="bg-primary-subtle text-primary-emphasis pt-4 pb-3 mt-5">

    <div class="container text-center">
        <h5 class="fw-bold">Library Management System</h5>
        <p class="mb-1">&copy; 2025 Library Management System. All Rights Reserved.</p>
        <p class="mb-0">Designed & Developed by <strong>Manoj Betadur</strong></p>
    </div>

</footer>
<!-- End Footer -->

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
<script src="script.js"></script>
</body>
</html>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Library Management System</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>

<body class="bg-light">
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
    <a class="nav-link " href="#" > Borrow Book</a>
  </li>
</ul>
</div>


<!-- end navbar -->

<div class="container mt-5 ">
    <div class="card shadow-lg p-4">
        <h2 class="text-center mb-4 text-primary ">Search By Book Name</h2>

        <form action="book" method="get" >

            <div class="mb-3">
                <label class="form-label">Enter Book Name</label>
                <input type="text" class="form-control" name="bName" id="bName" required>
            </div>
<span style="color:red">${error}</span>
            <input type="submit" value="Submit" name="submit" class="btn btn-primary w-100">

            <input type="submit" value="Clear" name="submit" class="btn btn-primary w-100">




<div class="container mt-5">

    <div class="card shadow-lg p-4">

        <h2 class="text-center mb-4 text-primary">Book Details</h2>


        <table class="table table-bordered table-striped text-center">
            <thead class="table-primary">
                <tr>
                    <th>Book Name</th>
                    <th>Author Name</th>
                    <th>Price</th>
                    <th>No. of Copies</th>
                    <th>Is Available</th>
                </tr>
            </thead>

            <tbody>
                <tr>
                    <td><strong>${dto.bNm}</strong></td>
                    <td>${dto.aNm}</td>
                    <td>${dto.price}</td>
                    <td>${dto.copy}</td>
                    <td>${dto.avail}</td>
                    <td><a href="AddBook.jsp">edit</a></td>

                </tr>
            </tbody>
        </table>

    </div>
</div>






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

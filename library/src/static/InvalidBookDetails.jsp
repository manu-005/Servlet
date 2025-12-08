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


<!-- nav bar -->

<!--  body -->


<div class="container mt-5">

    <div class="card shadow-lg p-4 ">

        <h2 class="text-center mb-4 text-primary">Book Details</h2>

  <h4 class="text-center mb-4 text-success">${success}</h4>
  <h4 class="text-center mb-4 text-danger">${error}</h4>

    </div>
</div>
<!-- end  body -->

<!-- footer -->

<footer class="bg-primary-subtle text-primary-emphasis pt-4 pb-3 mt-5">

    <div class="container text-center">
        <h5 class="fw-bold">Library Management System</h5>
        <p class="mb-1">&copy; 2025 Library Management System. All Rights Reserved.</p>
        <p class="mb-0">Designed & Developed by <strong>Manoj Betadur</strong></p>
    </div>

<!-- footer -->

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js" integrity="sha384-FKyoEForCGlyvwx9Hj09JcYn3nv7wiPVlz7YYwJrWVcXK/BmnVDxM+D2scQbITxI" crossorigin="anonymous"></script>
</body>
</html>
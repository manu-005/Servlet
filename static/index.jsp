<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap Navbar Example</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
  </head>
  <body>

    <nav class="navbar bg-warning navbar-expand-lg">
      <div class="container-fluid">
        <a class="navbar-brand" href="#">
          <img src="img.png" alt="Logo" width="30" height="24">
        </a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
          <ul class="navbar-nav me-auto mb-2 mb-lg-0">
            <li class="nav-item">
              <a class="nav-link active" aria-current="page" href="#">Home</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="index">Submit</a>
            </li>
          </ul>
        </div>
      </div>
    </nav>


    <div class="card" style="width: 18rem;">
          <img src="img.png" class="card-img-top" alt="...">
          <div class="card-body">
            <h5 class="card-title">Survey</h5>
            <p class="card-text">Fill all yours details for Survey.</p>
            <a href="index" class="btn btn-primary">Fill here</a>
          </div>
        </div>

    <footer class="bg-dark text-white text-center py-3 mt-5">
      <div class="container">
        <p class="mb-0">
          &copy; 2025 DAO Activity. All rights reserved.
          <a href="#" class="text-white mx-2">Privacy Policy</a> |
          <a href="#" class="text-white">Contact Us</a>
        </p>
      </div>
    </footer>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js" integrity="sha384-FKyoEForCGlyvwx9Hj09JcYn3nv7wiPVlz7YYwJrWVcXK/BmnVDxM+D2scQbITxI" crossorigin="anonymous"></script>
  </body>
</html>
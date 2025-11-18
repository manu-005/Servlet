<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Cafeteria Form</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
  </head>
  <body class="bg-light">

    <div class="container col-md-6 mt-5">

      <h3 class="text-center mb-4 text-primary">Cafeteria Details Form</h3>

      <form action="cafeteria" method="post" class="border p-4 rounded shadow-sm bg-white">

        <div class="mb-3">
          <label class="form-label">Cafeteria Name</label>
          <input type="text" class="form-control" name="name" placeholder="Enter cafeteria name">
        </div>

        <div class="mb-3">
          <label class="form-label">Location</label>
          <input type="text" class="form-control" name="loc" placeholder="Enter location">
        </div>

        <div class="mb-3">
          <label class="form-label">Type</label>
          <input type="text" class="form-control" name="type" placeholder="e.g. Veg, Non-Veg, Cafe">
        </div>

        <div class="mb-3">
          <label class="form-label">Price</label>
          <input type="text" class="form-control" name="price" placeholder="Enter price range">
        </div>

        <div class="mb-3">
          <label class="form-label">Franchise Name</label>
          <input type="text" class="form-control" name="fNm" placeholder="Enter franchise name">
        </div>

        <div class="mb-3">
          <label class="form-label">Owner Name</label>
          <input type="text" class="form-control" name="owNm" placeholder="Enter owner's name">
        </div>

        <div class="mb-3">
          <label class="form-label">GST Number</label>
          <input type="text" class="form-control" name="gstNo" placeholder="Enter GST number">
        </div>

        <div class="d-grid">
          <button type="submit" class="btn btn-primary">Send</button>
        </div>

      </form>

    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
  </body>
</html>

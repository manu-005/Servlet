<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Coffee Details Form</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
  </head>
  <body class="bg-light">

    <div class="container col-md-6 mt-5">

      <h3 class="text-center mb-4 text-primary">Coffee Details Form</h3>

      <form action="coffee" method="post" class="border p-4 rounded shadow-sm bg-white">

        <div class="mb-3">
          <label class="form-label">Coffee Type</label>
          <input type="text" class="form-control" name="type" placeholder="Enter coffee type">
        </div>

        <div class="mb-3">
          <label class="form-label">Coffee Price</label>
          <input type="text" class="form-control" name="price" placeholder="Enter price">
        </div>

        <div class="mb-3">
          <label class="form-label">Quantity</label>
          <input type="text" class="form-control" name="quantity" placeholder="Enter quantity">
        </div>

        <div class="mb-3">
          <label class="form-label">Former</label>
          <input type="text" class="form-control" name="former" placeholder="Former name">
        </div>

        <div class="mb-3">
          <label class="form-label">Location</label>
          <input type="text" class="form-control" name="loc" placeholder="Enter location">
        </div>

        <div class="d-grid">
          <button type="submit" class="btn btn-primary">Send</button>
        </div>

      </form>

    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
  </body>
</html>

<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Feedback Form</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
  </head>
  <body class="bg-light">

    <div class="container col-md-6 mt-5">

      <h3 class="text-center mb-4 text-primary">Feedback Form</h3>

      <form action="feedBack" method="post" class="border p-4 rounded shadow-sm bg-white">

        <div class="mb-3">
          <label class="form-label">Name</label>
          <input type="text" class="form-control" name="name" placeholder="Enter your name">
        </div>

        <div class="mb-3">
          <label class="form-label">Email</label>
          <input type="email" class="form-control" name="email" placeholder="Enter your email">
        </div>

        <div class="mb-3">
          <label class="form-label">Comments</label>
          <input type="text" class="form-control" name="comments" placeholder="Write your feedback">
        </div>

        <div class="mb-3">
          <label class="form-label">Rating</label>
          <input type="text" class="form-control" name="rating" placeholder="Give rating 1 to 5">
        </div>

        <div class="d-grid">
          <button type="submit" class="btn btn-primary">Send</button>
        </div>

      </form>

    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>

  </body>
</html>

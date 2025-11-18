<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Feedback Result</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
  </head>
  <body class="bg-light">

    <div class="container col-md-6 mt-5">

      <h3 class="text-center mb-4 text-success">Feedback Submitted Successfully</h3>

      <form class="border p-4 rounded shadow-sm bg-white">

        <div class="mb-3">
          <label class="form-label">Name</label>
          <input type="text" class="form-control" value="${name}" readonly>
        </div>

        <div class="mb-3">
          <label class="form-label">Email</label>
          <input type="text" class="form-control" value="${email}" readonly>
        </div>

        <div class="mb-3">
          <label class="form-label">Comments</label>
          <input type="text" class="form-control" value="${comments}" readonly>
        </div>

        <div class="mb-3">
          <label class="form-label">Rating</label>
          <input type="text" class="form-control" value="${rating}" readonly>
        </div>

        <div class="d-grid">
          <a href="FeedBack.jsp" class="btn btn-secondary">Go Back</a>
        </div>

      </form>

    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>

  </body>
</html>

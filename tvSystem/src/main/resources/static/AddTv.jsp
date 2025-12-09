<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Add TV</title>

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
        body {
            background-color: #eef2f7;
        }
        .form-card {
            max-width: 650px;
            margin: 50px auto;
            padding: 30px;
            border-radius: 12px;
            background: white;
            box-shadow: 0px 0px 15px rgba(0,0,0,0.1);
        }
        input[type="text"], input[type="number"] {
            width: 100%;
            margin-bottom: 15px;
            padding: 8px;
            border-radius: 6px;
            border: 1px solid #ccc;
        }
        .radio-group {
            margin-bottom: 15px;
            font-size: 1rem;
        }
        input[type="submit"] {
            margin-top: 15px;
            padding: 10px 25px;
        }
    </style>
</head>
<body>

<!-- Navbar -->
<nav class="navbar navbar-dark bg-primary">
    <div class="container">
        <a class="navbar-brand fw-bold" href="index.jsp">TV System</a>
    </div>
</nav>

<div class="container">
    <div class="form-card">

        <form action="addTv" method="post" id="addTv">

            <h1 class="text-center text-primary mb-4">Fill TV Details</h1>

            <!-- DO NOT CHANGE INPUTS — As requested -->

            <label><strong>TV id :</strong></label>
            <input type="number" name="tvId" id="tvId" required>

            <label><strong>Name :</strong></label>
            <input type="text" name="name" id="name" required>

            <label><strong>brand :</strong></label>
            <input type="text" name="brand" id="brand" required>

            <label><strong>size (in inch) :</strong></label>
            <input type="number" name="size" id="size" required>

            <label><strong>TV available :</strong></label>
            <div class="radio-group">
                <input type="radio" name="avail" id="availYes" value="yes" required> Yes
                <input type="radio" name="avail" value="no" id="availNo" class="ms-3"> No
            </div>

            <input type="submit" name="submit" value="Submit" class="btn btn-primary">

        </form>

    </div>
</div>

<!-- Footer -->
<footer class="text-center bg-dark text-white p-3 mt-5">
    <p class="mb-0">© 2025 TV System. All Rights Reserved.</p>
</footer>

</body>
</html>

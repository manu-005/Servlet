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
        pre {
            white-space: pre-wrap;
            font-family: inherit;
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

        <pre>
<form action="addTv" method="post" id="addTv">
<h1> Fill TV details</h2>

TV id : <input type="number" name="tvId" id="tvId" required>

Name :<input type="text" name="name" id="name" required>

brand :<input type="text" name="brand" id="brand" required>

size (in inch) :<input type="number" name="size" id="size" required>

TV available : <input type="radio" name="avail" id="availYes" value="yes" required>Yes
               <input type="radio" name="avail" value="no" id="availNo">No

<input type="submit" name="submit" value="Submit">
</form>
        </pre>

    </div>
</div>

<!-- Footer -->
<footer class="text-center bg-dark text-white p-3 mt-5">
    <p class="mb-0">© 2025 TV System. All Rights Reserved.</p>
</footer>

</body>
</html>

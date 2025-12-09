<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Edit TV</title>

    <!-- Bootstrap -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
        body {
            background: #f8f9fa;
        }
        .card {
            border-radius: 15px;
        }
        header, footer {
            background: #0d6efd;
            color: white;
            padding: 15px;
            text-align: center;
        }
        footer {
            margin-top: 40px;
            background:black;
        }
        form input {
            margin-bottom: 12px;
            display: block;
            width: 100%;
            max-width: 400px;
            padding: 8px;
        }
        #availYes, #availNo {
            width: auto;
            display: inline;
            margin-right: 5px;
        }
        form label {
            font-weight: 600;
        }
    </style>
</head>

<body>

<!-- HEADER -->
<header>
    <h2>TV Management System</h2>
</header>

<div class="container mt-5">

    <div class="card shadow p-4">

        <h3 class="text-center text-primary mb-3">Edit TV Details</h3>

        <!-- 🔹 YOUR FORM EXACTLY SAME – NO CHANGES -->
        <form action="update" method="post" id="addTv">
            <h1> Fill TV details</h1>

            TV id :
            <input type="number" name="tvId" id="tvId" value="${edit.id}" required>

            Name :
            <input type="text" name="name" id="name" value="${edit.name}" required>

            brand :
            <input type="text" name="brand" id="brand" value="${edit.brand}" required>

            size (in inch) :
            <input type="" name="size" value="${edit.size}" id="size" required>

            TV available :
            <input type="radio" name="avail" id="availYes" value="yes" required>Yes
            <input type="radio" name="avail" value="no" id="availNo">No

            <br><br>

            <input type="submit" name="submit" value="Update">
        </form>

    </div>
</div>

<!-- FOOTER -->
<footer>
    © 2025 TV Management System | All Rights Reserved
</footer>

<!-- Basic JavaScript -->
<script>
    console.log("Edit TV page loaded.");
</script>

</body>
</html>

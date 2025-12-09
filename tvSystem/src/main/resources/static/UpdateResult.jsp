<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>TV Details</title>

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
        pre {
            font-size: 1.1rem;
            background: #ffffff;
            padding: 20px;
            border-radius: 15px;
            box-shadow: 0 0 15px rgba(0,0,0,0.1);
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

        <h3 class="text-center text-primary mb-4">TV Details</h3>

        <!-- 🔹 YOUR EXACT OUTPUT — NOT MODIFIED -->
        <pre>
${success}
${error}
TV Id : ${ id}
Tv Name : ${name }
Brand :${ brand}
Size (in inch) : ${size }
Is Available : ${avail}
        </pre>

    </div>
</div>

<!-- FOOTER -->
<footer>
    © 2025 TV Management System | All Rights Reserved
</footer>

</body>
</html>

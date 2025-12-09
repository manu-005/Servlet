
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>TV Search Result</title>

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
        body {
            background-color: #eef2f7;
        }

        .content-box {
            max-width: 700px;
            margin: 50px auto;
            background: white;
            padding: 30px;
            border-radius: 12px;
            box-shadow: 0px 0px 12px rgba(0,0,0,0.15);
        }

        pre {
            white-space: pre-wrap;
            font-size: 18px;
            line-height: 1.7;
            color: #333;
            font-weight: 500;
        }

        a {
            text-decoration: none;
        }
    </style>
</head>

<body>

<!-- ===== Header ===== -->
<nav class="navbar navbar-dark bg-primary">
    <div class="container">
        <a class="navbar-brand fw-bold" href="index.jsp">TV System</a>
    </div>
</nav>

<!-- ===== Content ===== -->
<div class="container">
    <div class="content-box">

<pre>
id : ${ dto.id}
TV Name : ${dto.name}
TV Brand :${dto.brand}
Size :${dto.size}
Availability : ${dto.avail}

${error}

<h3><a href="edit?id=${dto.name}">edit</a></h3>
</pre>

    </div>
</div>

<!-- ===== Footer ===== -->
<footer class="text-center bg-dark text-white p-3 mt-5">
    <p class="mb-0">© 2025 TV System. All Rights Reserved.</p>
</footer>

</body>
</html>

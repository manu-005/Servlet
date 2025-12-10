
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


<!-- ======== NAVBAR ======== -->
<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
    <div class="container">
        <a class="navbar-brand" href="#">TV System</a>

        <div class="ms-auto">
                     <a href="index.jsp" class="btn btn-warning nav-btn">Home TV</a>
                       <a href="AddTv.jsp" class="btn btn-light nav-btn me-2">Add TV</a>
                       <a href="SearchTv.jsp" class="btn btn-warning nav-btn">Search TV</a>
                       <a href="SearchTVByBrand.jsp" class="btn btn-warning nav-btn">Search TV by Brand</a>
  </div>
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
    <p class="mb-0"> 2025 TV System. All Rights Reserved.</p>
</footer>

</body>
</html>

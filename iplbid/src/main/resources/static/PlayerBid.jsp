<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Bid Player</title>

    <!-- Bootstrap -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>

<body class="bg-light">

<!-- ================= HEADER / NAVBAR ================= -->
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <div class="container-fluid">
        <a class="navbar-brand fw-bold" href="index.jsp">IPL Bidding</a>

        <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                data-bs-target="#navbarNav">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav ms-auto">
                <li class="nav-item">
                    <a class="nav-link" href="index.jsp">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="addPlayer.jsp">Add Player</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" href="bidding.jsp">Bidding</a>
                </li>
                 <li class="nav-item">
                 <a class="nav-link active" href="SearchPlayer.jsp">${cmp.companyName}</a>
                 </li>
            </ul>
        </div>
    </div>
</nav>

<!-- ================= CONTENT ================= -->
<div class="container mt-5 mb-5">

    <div class="row justify-content-center">
        <div class="col-md-6">

            <div class="card shadow-lg">
                <div class="card-header bg-primary text-white text-center">
                    <h4>Bid Player</h4>
                </div>

                <div class="card-body">
                    <form action="placeBid" method="post">

                        <!-- Player Name (pre-populated & disabled) -->
                        <div class="mb-3">
                            <label class="form-label fw-bold">Player Name</label>

                            <!-- Visible but NOT editable -->
                            <input type="text"
                                   class="form-control"

                                   value="${param.name}"
                                   disabled>

                            <!-- Hidden field (required to submit value)    -->

                               <input type="hidden"
                                name="playerName"
                                 value="${param.name}">
 <input type="hidden"
                                name="companyName"
                                 value="${cmp.companyName}">

                        </div>

                        <!-- Bid Amount -->
                        <div class="mb-3">
                            <label class="form-label fw-bold">
                                Bid Amount (in Millions)
                            </label>
                            <input type="number"
                                   name="bidAmount"
                                   class="form-control"
                                   placeholder="Enter bid amount"
                                   min="1"
                                   step="0.1"
                                   required>
                        </div>

                        <!-- Submit Buttons -->
                        <div class="text-center">
                            <button type="submit" class="btn btn-success px-4">
                                Place Bid
                            </button>
                            <a href="SearchPlayer.jsp" class="btn btn-secondary ms-2">
                                Cancel
                            </a>
                        </div>

                    </form>
                </div>
            </div>

        </div>
    </div>

</div>

<!-- ================= FOOTER ================= -->
<footer class="bg-dark text-white text-center py-3 fixed-bottom">
    <small>© 2025 IPL Bidding Application | Developed by Manoj</small>
</footer>

<!-- Bootstrap JS -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>

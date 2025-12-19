<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Search Players | IPL Bidding Application</title>

    <!-- Bootstrap CSS -->
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
                    <a class="nav-link" href="bidding.jsp">Bidding</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" href="SearchPlayer.jsp">${cmp.companyName}</a>
                </li>
            </ul>
        </div>
    </div>
</nav>

<!-- ================= MAIN CONTENT ================= -->
<div class="container mt-5">
    <div class="row justify-content-center">
        <div class="col-md-6">

            <div class="card shadow">
                <div class="card-header bg-info text-white text-center">
                    <h4>Search Players</h4>
                </div>

                <div class="card-body">
                    <form action="searchPlayer" method="get">

                        <div class="mb-3">
                            <label class="form-label">Player Type</label>
                            <select name="playerType" class="form-select" required>
                                <option value="">-- Select Player Type --</option>
                                <option value="Batter">Batter</option>
                                <option value="Bowler">Bowler</option>
                                <option value="AllRounder">All Rounder</option>
                                <option value="Keeper">Keeper</option>
                            </select>
                        </div>

                        <div class="mb-3">
                            <label class="form-label">Average Value</label>
                            <input type="number"
                                   step="0.01"
                                   name="avgValue"
                                   class="form-control"
                                   placeholder="Enter average"
                                   required>
                        </div>

                        <div class="text-center">
                            <button type="submit" class="btn btn-info px-4">
                                Search Players
                            </button>
                        </div>

                                   <span class="text-danger fw-semibold">
                                       ${error}
                                   </span>
                               </div>

                    </form>
                </div>
            </div>

        </div>
    </div>
</div>

<!-- ================= FOOTER ================= -->
<footer class="bg-dark text-white text-center py-3 fixed-bottom">
    <div class="container">
        <small>© 2025 IPL Bidding Application | Developed by Manoj</small>
    </div>
</footer>

<!-- Bootstrap JS -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>

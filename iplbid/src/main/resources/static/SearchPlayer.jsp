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
                    <a class="nav-link active" href="SearchPlayer.jsp">
                        ${cmp.companyName}
                    </a>
                </li>
            </ul>
        </div>
    </div>
</nav>

<!-- ================= MAIN CONTENT ================= -->
<div class="container mt-5">

    <div class="row justify-content-center g-4">

        <!-- ===== CARD 1 : SEARCH BY TYPE ===== -->
        <div class="col-lg-6 col-md-6">
            <div class="card shadow h-100">
                <div class="card-header bg-info text-white text-center">
                    <h4>Search Players (By Type)</h4>
                </div>

                <div class="card-body">
                    <form action="searchPlayer" method="get">

                        <!-- Player Type -->
                        <div class="mb-3">
                            <label class="form-label">Player Type</label>
                            <select name="playerType"
                                    id="playerType"
                                    class="form-select"
                                    required
                                    onchange="showFields()">
                                <option value="">-- Select Player Type --</option>
                                <option value="Batter">Batter</option>
                                <option value="Bowler">Bowler</option>
                                <option value="Keeper">Keeper</option>
                                <option value="AllRounder">All Rounder</option>
                            </select>
                        </div>

                        <!-- Batting Avg -->
                        <div class="mb-3 d-none" id="battingAvgDiv">
                            <label class="form-label">Batting Average</label>
                            <input type="number"
                                   step="0.01"
                                   name="battingAvg"
                                   value="0"
                                   class="form-control">
                        </div>

                        <!-- Bowling Avg -->
                        <div class="mb-3 d-none" id="bowlingAvgDiv">
                            <label class="form-label">Bowling Average</label>
                            <input type="number"
                                   step="0.01"
                                   name="bowlingAvg"
                                   value="0"
                                   class="form-control">
                        </div>

                        <!-- Stumps -->
                        <div class="mb-3 d-none" id="stumpsDiv">
                            <label class="form-label">No of Stumps</label>
                            <input type="number"
                                   name="stumps"
                                   value="0"
                                   class="form-control">
                        </div>

                        <!-- Submit -->
                        <div class="text-center">
                            <button type="submit" class="btn btn-info px-4">
                                Search Players
                            </button>
                        </div>

                        <div class="text-danger fw-semibold mt-2 text-center">
                            ${error}
                        </div>

                    </form>
                </div>
            </div>
        </div>

        <!-- ===== CARD 2 : QUICK SEARCH ===== -->
        <div class="col-lg-6 col-md-6">
            <div class="card shadow h-100">
                <div class="card-header bg-info text-white text-center">
                    <h4>View Bid Players</h4>
                </div>

                <div class="card-body d-flex align-items-center justify-content-center">
                    <form action="viewBidPlayers" method="get">

                    <input type="hidden" name="companyName" value="${cmp.companyName}">
                        <button type="submit" class="btn btn-info px-5">
                            View Bid Players
                        </button>
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

<!-- ================= JS LOGIC ================= -->
<script>
    function showFields() {
        let type = document.getElementById("playerType").value;

        document.getElementById("battingAvgDiv").classList.add("d-none");
        document.getElementById("bowlingAvgDiv").classList.add("d-none");
        document.getElementById("stumpsDiv").classList.add("d-none");

        if (type === "Batter") {
            document.getElementById("battingAvgDiv").classList.remove("d-none");
        } else if (type === "Bowler") {
            document.getElementById("bowlingAvgDiv").classList.remove("d-none");
        } else if (type === "Keeper") {
            document.getElementById("battingAvgDiv").classList.remove("d-none");
            document.getElementById("stumpsDiv").classList.remove("d-none");
        } else if (type === "AllRounder") {
            document.getElementById("battingAvgDiv").classList.remove("d-none");
            document.getElementById("bowlingAvgDiv").classList.remove("d-none");
        }
    }
</script>

</body>
</html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add Player | IPL Bidding</title>

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

    <script>
       function toggleFields() {
            let type = document.getElementById("playerType").value;

            battingDiv.style.display = "none";
            bowlingDiv.style.display = "none";
            stumpsDiv.style.display = "none";

            if (type === "Batter") {
                battingDiv.style.display = "block";
            } else if (type === "Bowler") {
                bowlingDiv.style.display = "block";
            } else if (type === "AllRounder") {
                battingDiv.style.display = "block";
                bowlingDiv.style.display = "block";
            } else if (type === "Keeper") {
                battingDiv.style.display = "block";
                stumpsDiv.style.display = "block";
            }
        }

        function validateForm() {
            let name = document.forms["playerForm"]["name"].value.trim();
            let age = document.forms["playerForm"]["age"].value;
            let type = document.forms["playerForm"]["playerType"].value;
            let state = document.forms["playerForm"]["state"].value.trim();

            if (name === "" || !isNaN(name)) {
                alert("Please enter valid player name");
                return false;
            }

            if (age < 15 || age > 50) {
                alert("Age must be between 15 and 50");
                return false;
            }

            if (type === "") {
                alert("Please select player type");
                return false;
            }

            if (state === "" || !isNaN(state)) {
                alert("Please enter valid state");
                return false;
            }

            if (type === "Batter" || type === "AllRounder" || type === "Keeper") {
                let battingAvg = document.forms["playerForm"]["battingAvg"].value;
                if (battingAvg === "" || battingAvg <= 0) {
                    alert("Enter valid batting average");
                    return false;
                }
            }

            if (type === "Bowler" || type === "AllRounder") {
                let bowlingAvg = document.forms["playerForm"]["bowlingAvg"].value;
                if (bowlingAvg === "" || bowlingAvg <= 0) {
                    alert("Enter valid bowling average");
                    return false;
                }
            }

            if (type === "Keeper") {
                let stumps = document.forms["playerForm"]["stumps"].value;
                if (stumps === "" || stumps < 0) {
                    alert("Enter valid number of stumps");
                    return false;
                }
            }

            return true;
        }
    </script>

    <style>
        body {
            background-image: url("images/ipl-bg.jpg");
            background-size: cover;
            background-repeat: no-repeat;
            background-position: center;
            background-attachment: fixed;
        }
    </style>

</head>

<body class="bg-light">

<!-- HEADER -->
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <div class="container-fluid">
        <a class="navbar-brand fw-bold" href="index.jsp">IPL Bidding</a>
        <ul class="navbar-nav ms-auto">
            <li class="nav-item"><a class="nav-link" href="index.jsp">Home</a></li>
            <li class="nav-item"><a class="nav-link active" href="addPlayer.jsp">Add Player</a></li>
            <li class="nav-item"><a class="nav-link" href="bidding.jsp">Bidding</a></li>
        </ul>
    </div>
</nav>

<!-- FORM -->
<div class="container mt-5 mb-5">
    <div class="card shadow">
        <div class="card-header bg-primary text-white">
            <h4>Add Player Details</h4>
        </div>

        <div class="card-body">
            <form name="playerForm" action="addPlayer" method="post" onsubmit="return validateForm();">

                <div class="mb-3">
                    <label>Player Name</label>
                    <input type="text" name="name" class="form-control" required>
                </div>

                <div class="mb-3">
                    <label>Age</label>
                    <input type="number" name="age" class="form-control" required>
                </div>

                <div class="mb-3">
                    <label>Player Type</label>
                    <select name="playerType" id="playerType"
                            class="form-select" onchange="toggleFields()" required>
                        <option value="">-- Select Type --</option>
                        <option value="Batter">Batter</option>
                        <option value="Bowler">Bowler</option>
                        <option value="AllRounder">All Rounder</option>
                        <option value="Keeper">Keeper</option>
                    </select>
                </div>

                <div class="mb-3">
                    <label>State</label>
                    <input type="text" name="state" class="form-control" required>
                </div>

                <div class="mb-3" id="battingDiv" style="display:none;">

                    <label>Batting Average</label>
                    <input type="number" step="0.01" name="battingAvg" value="0" class="form-control">
                </div>


         <div class="mb-3" id="bowlingDiv" style="display:none;">

                    <label>Bowling Average</label>
                    <input type="number" step="0.01" name="bowlingAvg" value="0" class="form-control">
                </div>


                <div class="mb-3" id="stumpsDiv" style="display:none;">

                    <label>No of Stumps</label>
                    <input type="number" name="stumps" value="0" class="form-control">
                </div>

                <div class="text-center">
                    <button class="btn btn-success px-4">Add Player</button>
                </div>

            </form>
        </div>
    </div>
</div>

<!-- FOOTER -->
<footer class="bg-dark text-white text-center py-3 fixed-bottom">
    <small>© 2025 IPL Bidding Application | Developed by Xworkz</small>
</footer>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>

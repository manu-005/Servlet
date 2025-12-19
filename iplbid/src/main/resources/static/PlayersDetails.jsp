<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Players Details</title>

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

<!-- ================= CONTENT ================= -->
<div class="container mt-5 mb-5">

    <h3 class="text-center mb-4">Players Details</h3>

    <!-- Players Table -->
    <c:if test="${not empty player}">
        <div class="table-responsive">
            <table class="table table-bordered table-striped table-hover text-center align-middle">
                <thead class="table-dark">
                <tr>
                    <th>Name</th>
                    <th>Age</th>
                    <th>Player Type</th>
                    <th>State</th>
                    <th>Batting Avg</th>
                    <th>Bowling Avg</th>
                    <th>Stumps</th>
                    <th>BID</th>
                </tr>
                </thead>

                <tbody>
                <c:forEach var="p" items="${player}">
                    <tr>
                        <td>${p.name}</td>
                        <td>${p.age}</td>
                        <td>${p.playerType}</td>
                        <td>${p.state}</td>
                        <td>${p.battingAvg}</td>
                        <td>${p.bowlingAvg}</td>
                        <td>${p.stumps}</td>
                        <td>
                            <form action="bidding.jsp" method="get">
                                <!-- pass player info -->
                                <input type="hidden" name="playerName" value="${p.name}">
                                <button type="submit" class="btn btn-sm btn-success">
                                    Bid
                                </button>
                            </form>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </c:if>

    <!-- Safety fallback -->
    <c:if test="${empty player}">
        <p class="text-danger text-center fw-bold">
            No players available<br>
            <br>
            <a href="SearchPlayer.jsp">
            <button  class="btn btn-sm btn-danger">
            Back to Search Players
            </button>
            </a>
        </p>
    </c:if>

</div>

<!-- ================= FOOTER ================= -->
<footer class="bg-dark text-white text-center py-3 fixed-bottom">
    <small>© 2025 IPL Bidding Application | Developed by Manoj</small>
</footer>

<!-- Bootstrap JS -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>

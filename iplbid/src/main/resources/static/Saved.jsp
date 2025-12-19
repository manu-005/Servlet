<%@ page language="java" contentType="text/html; charset=UTF-8"
                   pageEncoding="UTF-8"%>
          <!DOCTYPE html>
          <html>
          <head>
              <meta charset="UTF-8">
              <title>Player Saved | IPL Bidding</title>

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
                      </ul>
                  </div>
              </div>
          </nav>

          <!-- ================= MAIN CONTENT ================= -->
          <div class="container mt-5">
              <div class="row justify-content-center">
                  <div class="col-md-6">

                      <div class="alert alert-success text-center shadow">
                          <h4 class="alert-heading">Saved Successfully ✅</h4>
                          <p class="fs-5 mb-1"><strong>${name}</strong></p>
                          <p>${success}</p>
                          <hr>
                          <a href="addPlayer.jsp" class="btn btn-success me-2">Add Another Player</a>
                          <a href="index.jsp" class="btn btn-secondary">Home</a>
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

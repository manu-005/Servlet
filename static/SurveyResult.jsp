<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Survey Submission Details</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <style>
        /* Custom styling for status messages */
        .status-message {
            padding: 1rem;
            margin-bottom: 1.5rem;
            border-radius: .25rem;
            font-weight: bold;
            text-align: center;
        }
    </style>
</head>
<body>


    <nav class="navbar fixed-top bg-warning navbar-expand-lg">
      <div class="container-fluid">
        <a class="navbar-brand" href="#">
          <img src="img.png" alt="Logo" width="30" height="24">
        </a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
          <ul class="navbar-nav me-auto mb-2 mb-lg-0">
            <li class="nav-item">
              <a class="nav-link active" aria-current="page" href="#">Home</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="index">Submit</a>
            </li>
          </ul>
        </div>
      </div>
    </nav>



<div class="container my-5">
    <h1 class="text-center mb-5 text-primary">Survey Submitted Details </h1>

    <div class="row justify-content-center">
        <div class="col-md-8">
            <h2 class="status-message  ">
                <p class="text-success">  ${success} </p>
            <p class="text-danger">${fail}</p>


            </h2>
        </div>
    </div>

    <div class="card shadow-sm mt-4">
        <div class="card-header bg-dark text-white">
            <h4 class="mb-0">Submitted Details</h4>
        </div>
        <div class="card-body">
            <dl class="row">

                <dt class="col-sm-4 text-dark">Name:</dt>
                <dd class="col-sm-8">${name}</dd>

                <dt class="col-sm-4 text-dark">Occupation:</dt>
                <dd class="col-sm-8">${occupation}</dd>

                <dt class="col-sm-4 text-dark">Education:</dt>
                <dd class="col-sm-8">${education}</dd>

                <dt class="col-sm-4 text-dark">Native Place:</dt>
                <dd class="col-sm-8">${nativePlace}</dd>

                <dt class="col-sm-4 text-dark">Mobile No:</dt>
                <dd class="col-sm-8">${mno}</dd>

                <div class="col-12"><hr class="my-3"></div>

                <dt class="col-sm-4 text-dark">AAdhar No:</dt>
                <dd class="col-sm-8">${adhar}</dd>

                <dt class="col-sm-4 text-dark">PanCard:</dt>
                <dd class="col-sm-8">${pan}</dd>

                <dt class="col-sm-4 text-dark">Voter Id:</dt>
                <dd class="col-sm-8">${vote}</dd>

                <dt class="col-sm-4 text-dark">Passport No:</dt>
                <dd class="col-sm-8">${passport}</dd>

                <dt class="col-sm-4 text-dark">Ration Card No:</dt>
                <dd class="col-sm-8">${ration}</dd>

                <div class="col-12"><hr class="my-3"></div>

                <dt class="col-sm-4 text-dark">Income:</dt>
                <dd class="col-sm-8">${income}</dd>

                <dt class="col-sm-4 text-dark">Bank Account:</dt>
                <dd class="col-sm-8">${bankAmt}</dd>

                <dt class="col-sm-4 text-dark">Land In Acres:</dt>
                <dd class="col-sm-8">${land}</dd>

                <dt class="col-sm-4 text-dark">Total Sites:</dt>
                <dd class="col-sm-8">${site}</dd>

                <dt class="col-sm-4 text-dark">Taxes Paid:</dt>
                <dd class="col-sm-8">${tax}</dd>

                <dt class="col-sm-4 text-dark">Share Holding:</dt>
                <dd class="col-sm-8">${share}</dd>


                <div class="col-12"><hr class="my-3"></div>

                <dt class="col-sm-4 text-dark">Bike Number:</dt>
                <dd class="col-sm-8">${bike}</dd>

                <dt class="col-sm-4 text-dark">Car Number:</dt>
                <dd class="col-sm-8">${car}</dd>

                <dt class="col-sm-4 text-dark">Laptop Model:</dt>
                <dd class="col-sm-8">${lmodel}</dd>

                <dt class="col-sm-4 text-dark">Tv Model:</dt>
                <dd class="col-sm-8">${tmodel}</dd>

                <dt class="col-sm-4 text-dark">No Of Cycle:</dt>
                <dd class="col-sm-8">${cycle}</dd>

                <div class="col-12"><hr class="my-3"></div>

                <dt class="col-sm-4 text-dark">Father Name:</dt>
                <dd class="col-sm-8">${fnm}</dd>

                <dt class="col-sm-4 text-dark">Mother Name:</dt>
                <dd class="col-sm-8">${mnm}</dd>

                <dt class="col-sm-4 text-dark">Married Status:</dt>
                <dd class="col-sm-8">${marrie}</dd>

                <dt class="col-sm-4 text-dark">Wife/Husband Name:</dt>
                <dd class="col-sm-8">${wnm}</dd>

                <dt class="col-sm-4 text-dark">No Of Children:</dt>
                <dd class="col-sm-8">${child}</dd>

                <dt class="col-sm-4 text-dark">No Of Family Members:</dt>
                <dd class="col-sm-8">${members}</dd>

                <div class="col-12"><hr class="my-3"></div>

                <dt class="col-sm-4 text-dark">Insurance Company:</dt>
                <dd class="col-sm-8">${insuranceC}</dd>

                <dt class="col-sm-4 text-dark">Insurance No:</dt>
                <dd class="col-sm-8">${insuranceNo}</dd>

                <dt class="col-sm-4 text-dark">Loan No:</dt>
                <dd class="col-sm-8">${loanNo}</dd>

                <dt class="col-sm-4 text-dark">Loan Balance:</dt>
                <dd class="col-sm-8">${loanBalance}</dd>

                <dt class="col-sm-4 text-dark">Loan Type:</dt>
                <dd class="col-sm-8">${loanType}</dd>

                <div class="col-12"><hr class="my-3"></div>

                <dt class="col-sm-4 text-dark">Govt Employee:</dt>
                <dd class="col-sm-8">${emp}</dd>

                <dt class="col-sm-4 text-dark">Disabled:</dt>
                <dd class="col-sm-8">${pwd}</dd>

                <dt class="col-sm-4 text-dark">Caste / Religion:</dt>
                <dd class="col-sm-8">${caste} / ${religion}</dd>

                <dt class="col-sm-4 text-dark">Mother Tongue:</dt>
                <dd class="col-sm-8">${mt}</dd>

                <dt class="col-sm-4 text-dark">Known Diseases:</dt>
                <dd class="col-sm-8">${disease}</dd>

                <dt class="col-sm-4 text-dark">Building Owner Name:</dt>
                <dd class="col-sm-8">${ownNm}</dd>

                <dt class="col-sm-4 text-dark">Pet Name / No Of Cows:</dt>
                <dd class="col-sm-8">${pet} / ${cowNo}</dd>

            </dl>
        </div>
    </div>

    </div>


    <footer class="bg-dark fixed-bottom text-white text-center py-3 mt-5">
      <div class="container">
        <p class="mb-0">
          &copy; 2025 DAO Activity. All rights reserved.
          <a href="#" class="text-white mx-2">Privacy Policy</a> |
          <a href="#" class="text-white">Contact Us</a>
        </p>
      </div>
    </footer>


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
</body>
</html>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Comprehensive Survey Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
  </head>
  <body>


    <nav class="navbar bg-warning navbar-expand-lg">
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
        <h1 class="text-center mb-4 text-primary">Survey Form</h1>
      <!--  <p class="text-center mb-5 text-muted">Please fill in the required information in the sections below.</p>
-->
        <div class="card shadow-lg p-3">
            <div class="card-body">
                <form action="survey" method="post">

                    <div class="card mb-4 bg-light">
                        <div class="card-header bg-primary text-white">
                            <h5 class="mb-0">1. Personal & Contact Details</h5>
                        </div>
                        <div class="card-body">
                            <div class="row g-3">
                                <div class="col-md-6">
                                    <label for="name" class="form-label">Name</label>
                                    <input type="text" class="form-control" id="name" name="name">
                                </div>
                                <div class="col-md-6">
                                    <label for="occupation" class="form-label">Occupation</label>
                                    <input type="text" class="form-control" id="occupation" name="occupation">
                                </div>
                                <div class="col-md-6">
                                    <label for="education" class="form-label">Education</label>
                                    <input type="text" class="form-control" id="education" name="education">
                                </div>
                                <div class="col-md-6">
                                    <label for="nativePlace" class="form-label">Native Place</label>
                                    <input type="text" class="form-control" id="nativePlace" name="nativePlace">
                                </div>
                                <div class="col-md-4">
                                    <label for="mno" class="form-label">Mobile No</label>
                                    <input type="text" class="form-control" id="mno" name="mno">
                                </div>
                                <div class="col-md-4">
                                    <label for="age" class="form-label">Age</label>
                                    <input type="text" class="form-control" id="age" name="age">
                                </div>
                                <div class="col-md-4">
                                    <label for="dob" class="form-label">Date Of Birth</label>
                                    <input type="date" class="form-control" id="dob" name="dob">
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="card mb-4 bg-light">
                        <div class="card-header bg-info text-white">
                            <h5 class="mb-0">2. Family & Relationship Details</h5>
                        </div>
                        <div class="card-body">
                            <div class="row g-3">
                                <div class="col-md-4">
                                    <label for="fnm" class="form-label">Father Name</label>
                                    <input type="text" class="form-control" id="fnm" name="fnm">
                                </div>
                                <div class="col-md-4">
                                    <label for="mnm" class="form-label">Mother Name</label>
                                    <input type="text" class="form-control" id="mnm" name="mnm">
                                </div>
                                <div class="col-md-4">
                                    <label for="members" class="form-label">No Of Family Members</label>
                                    <input type="number" class="form-control" id="members" name="members">
                                </div>
                                <div class="col-md-4">
                                    <label for="marrie" class="form-label">Marital Status</label>
                                    <select class="form-select" id="marrie" name="marrie">
                                        <option selected>Choose...</option>
                                        <option value="Married">Married</option>
                                        <option value="Single">Single</option>
                                        <option value="Divorced">Divorced</option>
                                    </select>
                                </div>
                                <div class="col-md-4">
                                    <label for="wnm" class="form-label">Wife/Husband Name</label>
                                    <input type="text" class="form-control" id="wnm" name="wnm">
                                </div>
                                <div class="col-md-4">
                                    <label for="child" class="form-label">No Of Children</label>
                                    <input type="number" class="form-control" id="child" name="child">
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="card mb-4 bg-light">
                        <div class="card-header bg-danger text-white">
                            <h5 class="mb-0">3. Identification & Legal Documents</h5>
                        </div>
                        <div class="card-body">
                            <div class="row g-3">
                                <div class="col-md-4">
                                    <label for="adhar" class="form-label">AAdhar No</label>
                                    <input type="text" class="form-control" id="adhar" name="adhar">
                                </div>
                                <div class="col-md-4">
                                    <label for="pan" class="form-label">PanCard</label>
                                    <input type="text" class="form-control" id="pan" name="pan">
                                </div>
                                <div class="col-md-4">
                                    <label for="vote" class="form-label">Voter Id</label>
                                    <input type="text" class="form-control" id="vote" name="vote">
                                </div>
                                <div class="col-md-6">
                                    <label for="passport" class="form-label">Passport No</label>
                                    <input type="text" class="form-control" id="passport" name="passport">
                                </div>
                                <div class="col-md-6">
                                    <label for="ration" class="form-label">Ration Card No</label>
                                    <input type="text" class="form-control" id="ration" name="ration">
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="card mb-4 bg-light">
                        <div class="card-header bg-success text-white">
                            <h5 class="mb-0">4. Financial & Property Details</h5>
                        </div>
                        <div class="card-body">
                            <div class="row g-3">
                                <div class="col-md-4">
                                    <label for="income" class="form-label">Annual Income</label>
                                    <input type="number" class="form-control" id="income" name="income">
                                </div>
                                <div class="col-md-4">
                                    <label for="bankAmt" class="form-label">Bank Account No</label>
                                    <input type="text" class="form-control" id="bankAmt" name="bankAmt">
                                </div>
                                <div class="col-md-4">
                                    <label for="share" class="form-label">Share Holding Value</label>
                                    <input type="number" class="form-control" id="share" name="share">
                                </div>
                                <div class="col-md-4">
                                    <label for="land" class="form-label">Land In Acres</label>
                                    <input type="number" class="form-control" id="land" name="land">
                                </div>
                                <div class="col-md-4">
                                    <label for="site" class="form-label">Total Sites/Plots</label>
                                    <input type="number" class="form-control" id="site" name="site">
                                </div>
                                <div class="col-md-4">
                                    <label for="rtc" class="form-label">RTC No</label>
                                    <input type="text" class="form-control" id="rtc" name="rtc">
                                </div>
                                <div class="col-md-4">
                                    <label for="gold" class="form-label">Gold In gms</label>
                                    <input type="number" class="form-control" id="gold" name="gold">
                                </div>
                                <div class="col-md-4">
                                    <label for="silver" class="form-label">Silver In gms</label>
                                    <input type="number" class="form-control" id="silver" name="silver">
                                </div>
                                <div class="col-md-4">
                                    <label for="tax" class="form-label">Taxes Paid (Annual)</label>
                                    <input type="number" class="form-control" id="tax" name="tax">
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="card mb-4 bg-light">
                        <div class="card-header bg-warning">
                            <h5 class="mb-0">5. Vehicles & Assets</h5>
                        </div>
                        <div class="card-body">
                            <div class="row g-3">
                                <div class="col-md-4">
                                    <label for="bike" class="form-label">Bike Number</label>
                                    <input type="text" class="form-control" id="bike" name="bike">
                                </div>
                                <div class="col-md-4">
                                    <label for="car" class="form-label">Car Number</label>
                                    <input type="text" class="form-control" id="car" name="car">
                                </div>
                                <div class="col-md-4">
                                    <label for="cycle" class="form-label">No Of Cycles</label>
                                    <input type="number" class="form-control" id="cycle" name="cycle">
                                </div>
                                <div class="col-md-6">
                                    <label for="lmodel" class="form-label">Laptop Model</label>
                                    <input type="text" class="form-control" id="lmodel" name="lmodel">
                                </div>
                                <div class="col-md-6">
                                    <label for="tmodel" class="form-label">TV Model</label>
                                    <input type="text" class="form-control" id="tmodel" name="tmodel">
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="card mb-4 bg-light">
                        <div class="card-header bg-secondary text-white">
                            <h5 class="mb-0">6. Bills, Loans & Insurance</h5>
                        </div>
                        <div class="card-body">
                            <div class="row g-3">
                                <div class="col-md-6">
                                    <label for="insuranceC" class="form-label">Insurance Company</label>
                                    <input type="text" class="form-control" id="insuranceC" name="insuranceC">
                                </div>
                                <div class="col-md-6">
                                    <label for="insuranceNo" class="form-label">Insurance Policy No</label>
                                    <input type="text" class="form-control" id="insuranceNo" name="insuranceNo">
                                </div>
                                <div class="col-md-4">
                                    <label for="eBillNo" class="form-label">Electricity Bill No</label>
                                    <input type="text" class="form-control" id="eBillNo" name="eBillNo">
                                </div>
                                <div class="col-md-4">
                                    <label for="wBillNo" class="form-label">Water Bill No</label>
                                    <input type="text" class="form-control" id="wBillNo" name="wBillNo">
                                </div>
                                <div class="col-md-4">
                                    <label for="ownNm" class="form-label">Building Owner Name</label>
                                    <input type="text" class="form-control" id="ownNm" name="ownNm">
                                </div>
                                <div class="col-md-4">
                                    <label for="loanNo" class="form-label">Loan No</label>
                                    <input type="text" class="form-control" id="loanNo" name="loanNo">
                                </div>
                                <div class="col-md-4">
                                    <label for="loanBalance" class="form-label">Loan Balance</label>
                                    <input type="number" class="form-control" id="loanBalance" name="loanBalance">
                                </div>
                                <div class="col-md-4">
                                    <label for="loanType" class="form-label">Loan Type</label>
                                    <input type="text" class="form-control" id="loanType" name="loanType">
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="card mb-4 bg-light">
                        <div class="card-header bg-dark text-white">
                            <h5 class="mb-0">7. Miscellaneous & Health</h5>
                        </div>
                        <div class="card-body">
                            <div class="row g-3">
                                <div class="col-md-4">
                                    <label for="caste" class="form-label">Caste</label>
                                    <input type="text" class="form-control" id="caste" name="caste">
                                </div>
                                <div class="col-md-4">
                                    <label for="religion" class="form-label">Religion</label>
                                    <input type="text" class="form-control" id="religion" name="religion">
                                </div>
                                <div class="col-md-4">
                                    <label for="mt" class="form-label">Mother Tongue</label>
                                    <input type="text" class="form-control" id="mt" name="mt">
                                </div>
                                <div class="col-md-6">
                                    <label for="disease" class="form-label">Known Diseases</label>
                                    <input type="text" class="form-control" id="disease" name="disease">
                                </div>
                                <div class="col-md-3">
                                    <label for="height" class="form-label">Height (e.g., cm/ft)</label>
                                    <input type="text" class="form-control" id="height" name="height">
                                </div>
                                <div class="col-md-3">
                                    <label for="weight" class="form-label">Weight (e.g., kg/lbs)</label>
                                    <input type="text" class="form-control" id="weight" name="weight">
                                </div>
                                <div class="col-md-4">
                                    <label for="complexion" class="form-label">Complexion</label>
                                    <input type="text" class="form-control" id="complexion" name="complexion">
                                </div>
                                <div class="col-md-4">
                                    <label for="bg" class="form-label">Blood Group</label>
                                    <input type="text" class="form-control" id="bg" name="bg">
                                </div>
                                <div class="col-md-4">
                                    <label for="fName" class="form-label">Known Friends Name</label>
                                    <input type="text" class="form-control" id="fName" name="fName">
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="card mb-4 bg-light">
                        <div class="card-header bg-secondary text-white">
                            <h5 class="mb-0">8. Clothing, Farming & Animals</h5>
                        </div>
                        <div class="card-body">
                            <div class="row g-3">
                                <div class="col-md-4">
                                    <label for="crop" class="form-label">Main Crop</label>
                                    <input type="text" class="form-control" id="crop" name="crop">
                                </div>
                                <div class="col-md-4">
                                    <label for="cowNo" class="form-label">No Of Cows</label>
                                    <input type="number" class="form-control" id="cowNo" name="cowNo">
                                </div>
                                <div class="col-md-4">
                                    <label for="pet" class="form-label">Pet Name</label>
                                    <input type="text" class="form-control" id="pet" name="pet">
                                </div>
                                <div class="col-md-6">
                                    <label for="ss" class="form-label">Shoe size</label>
                                    <input type="text" class="form-control" id="ss" name="ss">
                                </div>
                                <div class="col-md-6">
                                    <label for="ns" class="form-label">No Of Shoes Owned</label>
                                    <input type="number" class="form-control" id="ns" name="ns">
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="card mb-4 bg-light">
                        <div class="card-header bg-danger text-white">
                            <h5 class="mb-0">9. Government/Status</h5>
                        </div>
                        <div class="card-body">
                            <div class="row g-3">
                                <div class="col-md-6">
                                    <label for="emp" class="form-label">Govt Employee Status</label>
                                    <input type="text" class="form-control" id="emp" name="emp">
                                </div>
                                <div class="col-md-6">
                                    <label for="pwd" class="form-label">Disabled Status (PWD)</label>
                                    <input type="text" class="form-control" id="pwd" name="pwd">
                                </div>
                            </div>
                        </div>
                    </div>


                    <div class="d-grid mt-5">
                        <input type="submit" value="Submit Survey" class="btn btn-primary btn-lg">
                    </div>

                </form>
            </div>
        </div>
    </div>



    <footer class="bg-dark text-white text-center py-3 mt-5">
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
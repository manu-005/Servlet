<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Matrimony</title>
</head>
<body>

<form action="matrimony" method="post">

<pre>

Email : <input type="email" id="email" name="email" required>

For whom :
<select id="lookingFor" name="lookingFor" required>
    <option value=""> Select</option>
    <option value="mySelf"> Myself</option>
    <option value="brother"> Brother </option>
    <option value="sister"> Sister </option>
    <option value="son"> Son </option>
    <option value="daughter"> Daughter </option>
</select>

Gender :
Male : <input type="radio" name="gender" value="male" id="male">
Female : <input type="radio" name="gender" value="female" id="female">

<label id="labelName">Name:</label>
<input type="text" id="personName" name="pName" required>

Date Of Birth : <input type="date" name="dob" required>

Mother tongue:
<select id="motherTongue" name="motherTongue" required>
    <option value=""> Select </option>
    <option value="kannada"> Kannada</option>
    <option value="hindi"> Hindi </option>
    <option value="english"> English </option>
    <option value="tamil"> Tamil </option>
    <option value="telugu"> Telugu </option>
</select>

Religion :
<select id="religion" name="religion" required>
    <option value=""> Select </option>
    <option value="hindu"> Hindu</option>
    <option value="christianity"> Christianity </option>
    <option value="sikh"> Sikh </option>
i    <option value="jain"> Jain </option>
</select>

Martial Status :
<select id="martialStatus" name="martialStatus" required>
    <option value=""> Select </option>
    <option value="single"> Single </option>
    <option value="divorced"> Divorced </option>
    <option value="separated"> Separated </option>
    <option value="widowed"> Widowed </option>
</select>

Height : <input type="number" id="height" name="height" placeholder="1 to 7" required>
<span id="error"></span>

<input type="submit" id="submitBtn" value="Submit" disabled>

</pre>
</form>

<script>

const heightIp = document.getElementById("height");
const errorMsg = document.getElementById("error");

heightIp.addEventListener("input", function(){
    const heightValue = Number(heightIp.value);

    if(heightValue < 1 || heightValue > 7) {
        errorMsg.innerHTML = "Invalid height, must be between 1 and 7.";
        alert("please enter valid");
    } else {
        errorMsg.innerHTML = "";
    }

    validateForm();
});

const male = document.getElementById("male");
const female = document.getElementById("female");
const labelName = document.getElementById("labelName");

male.addEventListener("change", function () {
    labelName.innerHTML = "Groom's Name:";
    validateForm();
});

female.addEventListener("change", function () {
    labelName.innerHTML = "Bride's Name:";
    validateForm();
});

function validateForm() {

    const email = document.getElementById("email").value;
    const emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    const isEmailValid = emailPattern.test(email);

    const isGenderValid = male.checked || female.checked;

    const lookingFor = document.getElementById("lookingFor").value !== "";

    const height = Number(document.getElementById("height").value);
    const isHeightValid = height >= 1 && height <= 7;

    const personName = document.getElementById("personName").value.trim().length > 0;

    const submitBtn = document.getElementById("submitBtn");

    if (isEmailValid && isGenderValid && lookingFor && isHeightValid && personName) {
        submitBtn.disabled = false;
    } else {
        submitBtn.disabled = true;
    }
}

document.getElementById("email").addEventListener("input", validateForm);
document.getElementById("lookingFor").addEventListener("change", validateForm);
document.getElementById("height").addEventListener("input", validateForm);
document.getElementById("personName").addEventListener("input", validateForm);
</script>

</body>
</html>

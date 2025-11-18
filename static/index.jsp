<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Survey Page</title>
</head>
<body>

    <h1>
        <a href="Survey.jsp">Fill Survey Details</a>
    </h1>

    <p>hello</p>
    <a href="home.jsp">Home made</a>

    <form action="success" method="post">

        <p>
            Alias Name: 
            <input type="text" name="name" id="name">
        </p>

        <p>
            Email:
            <input type="text" name="mail" id="mail">
        </p>

        <p>
            Contact Number:
            <input type="number" name="no" id="no">
        </p>

        <p>
            Comments:
            <input type="text" name="comment" id="comment">
        </p>

        <input type="submit" name="send" value="Send">

    </form>

    <h1>
        <a href="FeedBack.jsp">Fill Feedback Details</a>
    </h1>

</body>
</html>

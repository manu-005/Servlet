
<pre>

<form action="update" method="post" id="addTv">
<h1> Fill TV details</h2>

TV id : <input type="number" name="tvId" id="tvId" value="${edit.id}" required>
Name :<input type="text" name="name" id="name" value="${edit.name}" required>
brand :<input type="text" name="brand" id="brand" value="${edit.brand}" required>
size (in inch) :<input type="" name="size" value="${edit.size}" id="size" required>
TV available : <input type="radio" name="avail" id="availYes" value="yes" required>Yes
               <input type="radio" name="avail" value="no" id="availNo">No

               <input type="submit" name="submit" value="Update" >

</form>

</pre>
<html>
<body>

<h1> my first Javascript</h1>
<p id="demo">Javascript can change the style of an html element.</p>

<script>
function myFuction(){
    document.getElementById("demo").style.fontsize = "25px";
    document.getElementById("demo").style.color = "red";
    document.getElementById("demo").style.backgroundColor = "yellow"; 
}
</script>

<!-- creating a button -->

<button type="button" onclick="myFunction()">Click me!</button>

</body>
</html> 


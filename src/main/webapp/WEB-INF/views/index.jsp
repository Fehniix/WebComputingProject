<html lang="en">
	<head>
		<meta charset="UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<link rel="stylesheet" href="./css/index.css">
		<link rel="stylesheet" media="only screen and (max-device-width: 880px)" href="./css/index.mobile.css">
		<script src="./js/index.js" type="module"></script>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
		<title>ACNH: Turnips</title>
	</head>
	<body>
		<div class="rulesAndFaq">
			<a href="#">Rules</a>
			<p>|</p>
			<a href="#">FAQ</a>
		</div>

		<div class="pages">
			<%@include file="includes/mainPage.jsp" %>

			<%@include file="includes/host.jsp" %>

			<%@include file="includes/hostedIsland.jsp" %>

			<%@include file="includes/hostedIslandAdmin.jsp" %>

			<%@include file="includes/islands.jsp" %>
		</div>
		
		<div class="footer">
			<p>
				Developed with &#x1F496; by <a href="https://www.linkedin.com/in/johnnybueti/"><strong>Johnny Bueti</strong></a> for <strong>Giovanni Grasso & Kristian Reale</strong>, Universita' della Calabria. This website is <strong>not</strong> primarily intended for or directed towards commercial advantage or monetary compensation: it is otherwise intended for academic purposes exclusively.
			</p>
		</div>
	</body>
</html>
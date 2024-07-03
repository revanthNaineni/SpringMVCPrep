<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<title>Love Calculator</title>
<!-- Include Bootstrap CSS from the Bootstrap CDN -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
<!-- Include your custom CSS file -->
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
	crossorigin="anonymous">
	
</script>
<style>
.error-message {
	color: red;
}
</style>
<script>
	function validate() {
		alert("clicked");
		var button = document.forms[0].yourName;
		alert(button);
		button.addEventListener("click", function() {
		    alert("Button clicked!");
		});
		
		var button = document.forms[0].crushName;
		alert(button);
		button.addEventListener("resize", function() {
		    alert("resize!");
		});

		
	}
</script>
</head>
<body onload="validate()">
	<div class="container mt-5">
		<div class="row justify-content-center">
			<div class="col-md-6">
				<div class="card">
					<div class="card-header text-center">
						<h1>Love Calculator</h1>
					</div>
					<div class="card-body">
						<form:form name="homepage" action="process-homepage" method="post"
							modelAttribute="lcUser">
							<div class="form-group">
								<label for="yourName">Your Name:</label>
								<form:input type="text" class="form-control" id="yourName"
									path="yourName" onclick="validate()"/>
								<form:errors class="error-message" path="yourName" />
							</div>

							<div class="form-group">
								<label for="crushName">Crush Name:</label>
								<form:input type="text" class="form-control" id="crushName"
									path="crushName" />
								<form:errors class="error-message" path="crushName" />
							</div>

							<div class="form-check">
								<br>
								<form:checkbox class="form-check-input" id="agreement"
									path="agreement" />
								<label class="form-check-label" for="agreement">I'm
									agreeing that this is for fun</label>
								<form:errors class="error-message" path="agreement" />
							</div>

							<button type="submit" id="submit" class="btn btn-primary mt-3"
								onclick="validate()">Calculate</button>
						</form:form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>

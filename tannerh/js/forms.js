$(document).ready(function() {
	$("#F14").hide();
	$("#NameEmailForm").hide();
	$("#results").hide();
	$("#tableResults").hide();
	$("#sql_picture").hide();

	$("h1").click(function() {
		$("#F14").hide();
		$("#NameEmailForm").hide();
		$("#results").hide();
		$("#tableResults").hide();
		$("h2").slideToggle(2000);

	});

	$("#showpicture").click(function() {
		$("#F14").hide();
		$("#NameEmailForm").hide();
		$("#results").hide();
		$("#tableResults").hide();
		$("#F14").slideToggle(3000);
	});
	$("#sqlbutton").click(function() {
		$("#F14").hide();
		$("#NameEmailForm").hide();
		$("#results").hide();
		$("#tableResults").hide();
		$("#sql_picture").hide();
		$("#sql_picture").slideToggle(3000);
	});
	$("#formClick").click(function() {
		$("#F14").hide();
		$("#NameEmailForm").hide();
		$("#results").hide();
		$("#tableResults").hide();
		$("#NameEmailForm").show();
	});
	$("#results1").click(function() {
		$("#F14").hide();
		$("#NameEmailForm").hide();
		$("#results").hide();
		$("#tableResults").hide();
		$("#results").slideToggle(3000);
	});
	$("#showtable").click(function() {
		$("#F14").hide();
		$("#NameEmailForm").hide();
		$("#results").hide();
		$("#tableResults").hide();
		$("#tableResults").slideToggle(3000);
	});

});
function animationFunction() {
	var x = document.getElementById("circleball");
	if (x.style.display === "none") {
		x.style.display = "block";
	} else {
		x.style.display = "none";
	}
	var x = document.getElementById("circleball1");
	if (x.style.display === "none") {
		x.style.display = "block";
	} else {
		x.style.display = "none";
	}
}

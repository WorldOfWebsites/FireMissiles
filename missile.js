function FireMissiles() {
	var name = prompt("Who should the missiles be sent to?");
	if (name == null) {
		alert("Please enter a name.");
	}
	else {
		var confirmMissiles = "You want missiles sent to";
		confirm(confirmMissiles + " " + name + "?");
		var sentanceSuffix = "Missiles sucessfully sent to";
		document.getElementById("result").innerHTML = sentanceSuffix + " " + name + ".";
	}
}
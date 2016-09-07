var userDefinedLocation;
var confirmBox;
function FireMissiles() {
	userDefinedlocation = prompt("Where should the missiles be sent to?\nDISCLAIMER: This will not actually fire missiles");

	if (userDefinedLocation == !null) {
		alert("Please enter a location");
	}
	else {
		ifLocationIsFilledOut();
	}
}

function ifLocationIsFilledOut() {
	confirmBox = confirm("Send missiles to " + userDefinedLocation + "?");

	if (confirmBox == true) {

                        var code1 = "Contacting computer... SUCCESS";
                        document.getElementById("code1").innerHTML = code1;

                        var code2 = "Getting location... SUCCESS";
                        document.getElementById("code2").innerHTML = code2;

                        var code3 = "Missiles launching in 3..2..1";
                        document.getElementById("code3").innerHTML = code3;

                        var code4 = "Missiles launched";
                        document.getElementById("code4").innerHTML = code4

                        var sentanceSuffix = "Missiles sucessfully sent to";
                        document.getElementById("result").innerHTML = sentanceSuffix + " " + userDefinedLocation + ".";
	}
	else {
		alert("Operation aborted");
	}
}

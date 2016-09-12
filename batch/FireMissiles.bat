cls
@echo off
echo "Where Should the missiles be sent to?"
echo/
echo "DISCLAIMER: This does not actually fire missiles"
set /p location
set /p confirm="You want missiles sent to %location%? Y/N"

if "%confirm%" == "Y" (
	echo "Contacting computer... SUCCESS"
	echo "Getting location... SUCCESS"
	echo "Missiles launching in 3..2..1"
	echo "Missiles launched"
	echo "Missiles sucessfully sent to %location%"
)
else if "%confirm%" == "N" (
	echo "Operation aborted"
)
else (
	echo "Invalid response"
)

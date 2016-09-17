#!/bin/bash
read -p "Where should the missiles be sent to?\nDISCLAIMER: This will not actually fire missiles " location
read -p "Send missiles to $location? Y/N " confirm

if [ $confirm = "Y" ]; then
	echo "Contacting computer... SUCCESS"
	echo "Getting location... SUCCESS"
	echo "Missiles launching in 3..2..1"
	echo "Missiles launched"
	echo "Missiles successfully sent to $location"
elif [ $confirm = "N" ]; then
	echo "Operation aborted"
else
	echo "Invalid response"
fi
exit



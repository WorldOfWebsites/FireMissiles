person = raw_input("Who should the missiles be sent to? ")
confirm = raw_input("You want missiles sent to " + person + "? Y/N: ")

if confirm == "Y" or confirm == "y":
	print "Contacting computer... SUCCESS"
	print "Getting location... SUCCESS"
	print "Missiles launching in 3..2..1"
	print "Missiles launched"
	print "Missiles sucessfully sent to " + person + "."
elif confirm == "N" or confirm == "n":
	print "Operation aborted."
else:
	print "Invalid response."

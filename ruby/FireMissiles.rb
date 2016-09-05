print "Who do you want missiles sent to? "
person = gets.chomp
puts "You want missiles sent to #{person}? Y/N"
confirm = gets.chomp

if confirm == "Y" or confirm == "y"
puts "Contacting computer... SUCCESS"
puts "Getting location... SUCCESS"
puts "Missiles launching in 3..2..1"
puts "Missiles launched"
puts "Missiles sucessfully sent to #{person}."
elsif confirm == "N" or confirm == "n"
puts "Operation aborted."
else
puts "Invalid response."
end

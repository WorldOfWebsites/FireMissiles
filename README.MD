# FireMisslies
If you're angry at someone, put in the name and click fire. Not meant to be taken seriously!

Web version hosted on branch `gh-pages`. JS curently undergoing a rewrite, check progress on branch `js-rewrite`.
## Compiling & running

## Java
You need to be able to compile and run Java files. If you haven't already, install the Java Development Kit or OpenJDK.

The Java version is packaged in `sweeper3000/missiles`. There are two methods to run the file, depending on your needs

### Using Test.java
There is a file in the `java` folder called Test.java which imports and loads the code. Use this if you just want to run the program.

First, navigate to FireMissiles.java (this assumes your in the main directory before `java`):

`cd java/sweeper3000/missiles`

Then compile:

`javac FireMissiles.java`

Then navigate back to java:

`cd ../../`

Finally, compile Test.java and run:

`javac Test.java`

`java Test`

## Using Your own Java File
Use this if you want to include this in your own project.

Make sure you have the `sweeper3000/missiles` directory somewhere.

Then import:

`import sweeper3000.missiles.FireMissiles`

Then create a FireMissiles object:

`FireMissiles someName = new FireMissiles();`

Then compile and run.

## Python
There are two versions: python2 and python3. Make sure you have either one or both installed on your computer. The two versions are not backwards compatible.

### For Python2
From a terminal, run `python FireMissiles.py`

### For Python3
From a terminal, run `python3 FireMissiles.py`

## Ruby
You must have ruby installed.

Naviagate to the containing directory and run `ruby FireMissiles.rb`.

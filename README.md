# introduction_programming_java
Base material to the course introduction_programming_java


## Running Programs from command Line

The key aspects for running program are:

__Java Classpath__: Is the path that defines where are the classes to be runned stored in.

__java__: This command launches a class containing a method main with the following signature
   ```public static void main(String [] args){}```

__javac__: This command launches the compiler creating the *class* files that will be excecuted

__java package__: is the grouping unit for code in java it has implications on accessibility to methods and variables.


###Exercise 1:

Let's download the code from the folder util.

* We have defined a InputReader class called ```MyInputReader.java``` which contains the methods to read doubles, integers and Strings.
* We also defined a TestInput class called ```TestInput.java``` which contains a main method to test the functionality from the class mentioned above.
* To download the code using git download the gitbash program https://git-scm.com/download/win 
* Using the git bash console run: ```git clone https://github.com/acabra85/introduction_programming_java.git ```
* Once the code is downloaded place yor console on the folder that contains the util folder.
* First we compile the java files with the following code: ```javac -d . util/MyInputReader.java util/TestInput.java``` please note that we are using the parameter '-d' with option '.' it means to use the current directory as destination for .class files.
* Then we run the code using the java command ```java -cp . util/TestInput``` please note that we are using the parameter -cp which is a shorter version of --classpath and then we use '.' to mark the classpath as the current directory

This should work !!! now we will be able to test the input captured into our program try to put wrong values for example when expecting a integer value enter the number '5.11' to see what happens with the code.

Good luck!

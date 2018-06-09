## Java the right way.

It could be open for debate.
<br/>But java developers working with or without an IDE may find this usefull.

## Installation. 
Assure that Java is installed including the javac compiler.

## Running the application needs to be executed root level due to packaging.
javac src/applicationEntryPoint.java; 
java src/applicationEntryPoint;

## This starting template enables two key features for a java developer.
1) Quickly move off the entry point and house all of the java in an appName class</br>. 
Keeps beginner java programmers from overusing the static class which can become very problematic if used incorrectly.

2) Preconfigured with packaging. Allowing the main application to house everything it uses in folders;<br>
Allowing seperation of concerns. <b>note: the only two files that should be at src top-level should be applicationEntryPoint.java and yourAppName.java</b>


# MavenTest
Just a demonstration that I can use Maven.

## Packaging

If you run

	> mvn package
	
it should compile and put an executable jar in the target folder. You can run it as

	> java -jar POMTest-1.0-SNAPSHOT.jar
	
Or, you can double-click the jar. You won't see much for command line applications, 
but it works in this case because this is a Swing application.


## Filters

If you want to inject a property specified on the command line, do something like this:

	> mvn package "-Dcommand.line.prop=Hello again!"

Check for the result in 'target/classes/application.properties'.

## API Documentation

Generate the documentation with

	> mvn site

To generate it and run it in Jetty, do this

	> mvn site:run
	
Point your browser to [http://localhost:8080/](http://localhost:8080/).
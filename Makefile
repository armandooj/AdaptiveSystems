lab1:
	javac labs/reflection/*.java;
	jar -cvfm reflection.jar labs/reflection/manifest.txt labs/reflection/*.class
	@find . -name "*.class" -type f -delete
	@find . -name "*~" -type f -delete
	@echo	
	@echo "COMPLETED"
	@echo "to execute run: java -jar reflection.jar"
	@echo "to run the agent: java -javaagent:reflection.jar -cp . labs.reflection.Main"


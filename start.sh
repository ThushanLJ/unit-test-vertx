mvn clean install

java -javaagent:src/main/resources/jacocoagent.jar=destfile=target/jacoco-it.exec,append=true
kill -15
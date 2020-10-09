pipeline {
    agent any
    stages {
        stage('Example') {
            steps {
                bat 'java -javaagent:src/main/resources/jacocoagent.jar=destfile=target/jacoco-it.exec,append=true'
                bat 'kill -15'
            }
        }
    }
}

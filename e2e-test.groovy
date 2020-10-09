pipeline {
    agent any
    stages {
        stage('Add jacoco agent') {
            steps {
                bat 'java -javaagent:src/main/resources/jacocoagent.jar=destfile=target/jacoco-it.exec,append=true'
            }
        }
        stage('Kill process') {
            steps {
                bat 'kill -15'
            }
        }
    }
}

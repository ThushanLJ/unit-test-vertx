pipeline {
    agent any
    stages {
        stage('run unit test') {
            steps {
                sh script: """
                -javaagent:src/main/resources/jacocoagent.jar=destfile=target/jacoco-it.exec,append=true
                """
            }
        }
    }
}
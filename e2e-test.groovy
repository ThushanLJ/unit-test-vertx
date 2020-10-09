pipeline {
    agent any
    stages {
        stage('run unit test') {
            steps {
                sh "mvn clean install"
            }
        }
    }
}
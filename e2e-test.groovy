pipeline {
    agent any
    stages {
        stage('run unit test') {
            steps {
                echo 'Hello, Maven'
            }
        }
    }
}
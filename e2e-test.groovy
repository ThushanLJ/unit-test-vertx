pipeline {
    agent any
    stages {
        stage('run unit test') {
            steps {
                sh script: """
                ./start.sh
                """
            }
        }
    }
}
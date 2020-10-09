pipeline {
    agent any
    stages {
        stage('Example') {
            steps {
                bat 'mvn clean install'
            }
        }
    }
}

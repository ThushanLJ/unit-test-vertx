pipeline {
    agent any
    stages {
        stage('Example') {
            steps {
                javac -version
            }
        }
    }
}

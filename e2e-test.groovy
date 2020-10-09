pipeline{
    agent any

    stages{
        stage('run unit tist'){
            steps{
                mvn clean install
            }
        }
    }
}
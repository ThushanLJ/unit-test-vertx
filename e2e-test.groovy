pipeline {
    agent any
    stages {
        stage('run unit test') {
            steps {
                bash '''#!/bin/bash
                mvn clean install
                '''
            }
        }
    }
}
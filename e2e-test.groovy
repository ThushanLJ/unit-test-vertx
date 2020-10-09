pipeline {
    agent any
    stages {
        stage('run unit test') {
            steps {
                bash '''#!/bin/bash
                -javaagent:src/main/resources/jacocoagent.jar=destfile=target/jacoco-it.exec,append=true
                '''
            }
        }
    }
}
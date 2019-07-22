pipeline {
    agent any

    stages {
        stage('Junit') {
            steps {
                echo 'run junits'
                sh 'mvn clean install'
            }
        }
        stage('Build') {
            steps {
                echo 'building the project'
            }
        }
    }
}

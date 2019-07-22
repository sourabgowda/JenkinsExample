pipeline {
    agent any

    stages {
        stage('Junit') {
            steps {
                echo 'run junits'
                mvn clean install
            }
        }
        stage('Build') {
            steps {
                echo 'building the project'
            }
        }
    }
}

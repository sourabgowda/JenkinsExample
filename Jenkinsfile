pipeline {
    agent any
    def buildInfo
    stages {
           stage('Clone sources') {
               steps {
                git url: 'https://github.com/sourabgowda/JenkinsExample.git'
               }
           }
        
           stage('Maven build') {
               steps {
                buildInfo = rtMaven.run pom: 'JenkinsExample/pom.xml', goals: 'clean install'
               }
                
           }

           stage('Publish build info') {
               steps {
                server.publishBuildInfo buildInfo
               }
                
           }
    }
}

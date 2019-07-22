pipeline {
    agent any
    def buildInfo
    stages {
           stage('Artifactory configuration') {
                steps {
                    // Tool name from Jenkins configuration
                    rtMaven.tool = "Maven-3.3.9"
                    // Set Artifactory repositories for dependencies resolution and artifacts deployment.
                    rtMaven.deployer releaseRepo:'libs-release-local', snapshotRepo:'libs-snapshot-local', server: server
                    rtMaven.resolver releaseRepo:'libs-release', snapshotRepo:'libs-snapshot', server: server
                }
           }
        
        
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

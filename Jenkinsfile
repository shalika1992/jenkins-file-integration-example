pipeline{
    agent any
    tools{
        maven 'Maven_3.9.12'
    }

    stages{
        stage('Build Maven'){
            steps{
                checkout scmGit(
                    branches: [[name: '*/master']],
                    extensions: [],
                    userRemoteConfigs: [[credentialsId: '240cb24c-69cf-402a-8c19-45f7f9856890', url: 'https://github.com/shalika1992/jenkins-file-integration-example.git']]
                )
                sh 'mvn clean install'
            }
        }

        stage('Build docker image'){
            steps{
                script{
                    sh 'docker build -t shalika92/jenkins-file-integration-example .'
                }
            }
        }

        stage('Push image to hub'){
            steps{
                script{
                    withCredentials([string(credentialsId: 'dockerhub-pwd', variable: 'dockerhubpwd')]) {
                        sh 'docker login -u shalika92 -p ${dockerhubpwd}'
                    }
                    sh 'docker push shalika92/jenkins-file-integration-example'
                }
            }
        }
    }
}
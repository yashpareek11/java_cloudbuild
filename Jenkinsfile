pipeline {
    agent any
    tools { maven 'mvn' }
    stages {
        stage('git checkout') {
            steps {
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/yashpareek11/javaapp.git']])
            }
        }
        stage('maven build') {
            steps {
                sh 'mvn clean install'
            }
        }
        stage('Build Docker image') {
            steps {
                sh 'docker build -t yashpareek99/javaapp-image .'
            }
        }
        stage('Docker image push to dockerHub') {
            steps {
                withCredentials([string(credentialsId: 'dockerhubpwd', variable: 'dockerhubpwd')]) {
                    sh 'docker login -u yashpareek99 -p ${dockerhubpwd}'
                    sh 'docker push yashpareek99/javaapp-image'
                }
            }
        }
        stage('Deployment on K8s') {
            steps {
                kubernetesDeploy (configs: 'deployment.yaml,service.yaml', kubeconfigId: 'k8spwd')
                
            }
        }
        
    }
}

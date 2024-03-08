pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                sh 'mvn clean package'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
                 sh 'mvn test'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
                sh 'sudo -S scp -v -o StrictHostKeyChecking=no -i ~/EC2AdminTutorialKey.pem target/JenkinsCICDDemoForISG-0.0.1-SNAPSHOT.jar docker-compose.yaml ' +
                        'DockerFile_app ubuntu@ec2-3-67-196-84.eu-central-1.compute.amazonaws.com:~'
                sh 'sudo -S ssh -i ~/EC2AdminTutorialKey.pem ubuntu@ec2-3-67-196-84.eu-central-1.compute.amazonaws.com \'bash -s\' < update-server.sh'
            }
        }
    }
}
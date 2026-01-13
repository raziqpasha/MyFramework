pipeline {
    agent any

    options {
        skipDefaultCheckout(true)
    }

    tools {
        maven 'Maven'
        jdk 'JDK11'
    }

    stages {

        stage('Checkout Code') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/raziqpasha/MyFramework.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean compile'
            }
        }

        stage('Test Execution') {
            steps {
                bat 'mvn test'
            }
        }
    }

    post {
        always {
            allure([
                includeProperties: false,
                jdk: '',
                results: [[path: 'allure-results']]
            ])
        }
    }
}

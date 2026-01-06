pipeline {
    agent any

    stages {
        stage('Checkout Code') {
            steps {
                git 'https://github.com/raziqpasha/MyFramework.git'
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
                jdk: '',               // optional, leave blank
                results: [[path: 'allure-results']]
            ])
        }
    }
}

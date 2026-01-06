pipeline {
    agent any

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
                jdk: '',               // optional, leave blank
                results: [[path: 'allure-results']]
            ])
        }
    }
}

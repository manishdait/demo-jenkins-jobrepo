pipeline {
  agent {
    node {
      label 'docker-agent-alpine'
    }
  }
  triggers {
    pollSCM '*/5 * * * *'
  }
  stages {
    stage('Test') {
      steps {
        echo "Testing..."
        sh '''
        mvn test
        '''
      }
    }
    stage('Build') {
      steps {
        echo "Building..."
        sh '''
        mvn package
        '''
      }
    }
    stage('Deliver') {
      steps {
        echo "Delivering..."
        sh '''
        echo "Deliver Build" 
        '''
      }
    }
  }
}
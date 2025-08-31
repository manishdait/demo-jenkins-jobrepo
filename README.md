# Demo Jenkins JobRepo

This repository contains a simple Java  application, along with a Jenkins Pipeline script for learning the Jenkins.

**Jenkinsfile:**

```groovy
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
```

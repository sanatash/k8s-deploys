pipeline {
	agent {
		kubernetes {
			//cloud 'kubernetes'
			yaml """
apiVersion: v1
kind: Pod
spec:
  containers:
  - name: maven
    image: maven:3.3.9-jdk-8-alpine
    command: ['cat']
    tty: true
"""
		}
	}
	stages {
		stage('Build maven') {
			steps {
			    git url: 'https://github.com/web3j/sample-project-maven'
				container('maven') {
					sh 'mvn clean install'
				}
			}
		}
	}
}

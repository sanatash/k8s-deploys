podTemplate(yaml: """
apiVersion: v1
kind: Pod
spec:
  containers:
  - name: maven
    image: maven:3.3.9-jdk-8-alpine
    command: ['cat']
    tty: true
"""
) {

	node(POD_LABEL) {
		stage('Checkout Maven') {
			git url: 'https://github.com/web3j/sample-project-maven'
		}

		stage('Build a maven project') {
			container('maven') {
				sh 'mvn clean install'
			}
		}
	}
}
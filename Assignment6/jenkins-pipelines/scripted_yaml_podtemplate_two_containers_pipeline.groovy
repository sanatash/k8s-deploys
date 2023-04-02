podTemplate(yaml: """
apiVersion: v1
kind: Pod
spec:
  containers:
  - name: centos
    image: centos:7
    command: ['cat']
    tty: true
  - name: ubuntu
    image: ubuntu:latest
    command: ['cat']
    tty: true
"""
) {

	node(POD_LABEL) {
		stage('Run CentOs') {
			container('centos') {
				sh 'cat /etc/*-release'
			}
		}

		stage('Run Ubuntu') {
			container('ubuntu') {
				sh 'cat /etc/*-release'
			}
		}
	}
}
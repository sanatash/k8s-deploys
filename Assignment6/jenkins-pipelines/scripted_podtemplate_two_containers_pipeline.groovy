podTemplate(containers: [
		containerTemplate(name: 'centos', image: 'centos:7', ttyEnabled: true, command: 'cat'),
		containerTemplate(name: 'ubuntu', image: 'ubuntu:latest', ttyEnabled: true, command: 'cat')
]) {

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
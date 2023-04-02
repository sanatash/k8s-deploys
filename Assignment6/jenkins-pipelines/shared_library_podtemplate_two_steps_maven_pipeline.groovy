@Library('jenkins-shared-library@main') _

def podLabel = "worker-${UUID.randomUUID()}"
def mavenVersion = "3.3.9-jdk-8-alpine"
mavenRunner(podLabel, mavenVersion){
	node(podLabel){
		stage("test"){
		    git url: 'https://github.com/web3j/sample-project-maven'
			container("maven"){
				sh "mvn clean install"
			}
		}
	}
}
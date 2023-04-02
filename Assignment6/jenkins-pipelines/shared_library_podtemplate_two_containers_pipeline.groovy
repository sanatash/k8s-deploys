@Library('jenkins-shared-library@main') _

def podLabel = "worker-${UUID.randomUUID()}"
def centosVersion = "7"
def ubuntuVersion = "latest"
linuxRunner(podLabel, centosVersion, ubuntuVersion){
	node(podLabel){
		stage("Run centos"){
			container("centos"){
				sh 'cat /etc/*-release'
			}
		}
		stage("Run ubuntu"){
			container("ubuntu"){
				sh 'cat /etc/*-release'
			}
		}
	}
}
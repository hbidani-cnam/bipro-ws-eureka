pipeline {

	node('master') {
	    sh("your shell script")   
	}

    //Build
    stages {
        stage('Run-Maven-Build') {
            //agent { docker 'maven:3-alpine' } 
            
            steps {
                echo 'Task: Maven -> install'
                sh 'mvn install'
            }
        }
        
        stage('Run-JDK Check') {
            //agent { docker 'openjdk:8-jre' } 
            steps {
                echo 'java version check'
                sh 'java -version'
            }
        }
        
        stage('Run-Unit-Test') {
            steps {
                echo 'Task: Maven -> Start-> Tests'
                sh 'mvn test'
            }
        }
    }
}
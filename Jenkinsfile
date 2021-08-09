pipeline{

    agent any

    stages {

        stage ('Compile Stage') {

            steps {
               
                    bat 'mvn compile'                

            }
        }
        
    	stage ('Test Stage') {

            steps {
                    bat mvn clean test -Dcucumber.options=\"src//test//resources//features\"}
                                   

            }
        }       
        
		stage ('Build Stage') {

            steps {
               
                    bat 'mvn package'                

            }
        }

       
       stage('Generate HTML report') {
        finally {
                           cucumber buildStatus: "UNSTABLE", 
                           fileIncludePattern: "**/cucumber.json",
                           jsonReportDirectory: 'target'
                 }
    } 
        

    }

}
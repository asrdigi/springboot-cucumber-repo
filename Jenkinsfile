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
                
                    bat 'mvn test'
                

            }
        }       
        
		stage ('Build Stage') {

            steps {
               
                    bat 'mvn package'                

            }
        }

       
       stage('Generate HTML report') {
        steps{
         	cucumber buildStatus: 'UNSTABLE',
                reportTitle: 'My report',
                fileIncludePattern: '**/*.json',
                trendsLimit: 10                
             }
    } 
        

    }

}
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
                    bat 'mvn verify' 
                  }
                                   

         }       
        
		stage ('Build Stage') {

            steps {
               
                    bat 'mvn install'                

            }
        }

       
       stage ('Cucumber Reports') {

            steps {
                cucumber failedFeaturesNumber: 1, failedScenariosNumber: 1, failedStepsNumber: 1, fileIncludePattern: '**/*.json', pendingStepsNumber: 1, skippedStepsNumber: 1, sortingMethod: 'ALPHABETICAL', undefinedStepsNumber: 1

            }

        }
        

    }

}
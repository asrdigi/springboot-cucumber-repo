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
				cucumber fileIncludePattern: '**/*.json', reportTitle: 'My Sample Report', sortingMethod: 'NATURAL'
            }
            

        }
        

    }

}
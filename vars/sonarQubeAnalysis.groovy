// vars/sonarScannerAnalysis.groovy

def call(String sonarProjectKey, String sonarProjectName, String sonarServer = 'sonar-server') {
    script {
        
        
        // Define the SonarQube scanner home path
        def sonarScannerHome = tool name: 'sonarqube'

        // Run the SonarQube scanner with the specified configuration
        withSonarQubeEnv(sonarServer) {
            sh """
            ${sonarScannerHome}/bin/sonar-server \
            -Dsonar.projectKey=${sonarProjectKey} \
            -Dsonar.projectName=${sonarProjectName} \
            """
        }
    }
}

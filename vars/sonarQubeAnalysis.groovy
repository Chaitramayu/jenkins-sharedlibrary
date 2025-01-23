def call(Map config = [:]) {
    // Default configuration if not provided
    def repoName = config.repoName ?: 'default-project'  // Set default if no repoName is passed
    def sonarServer = config.sonarServer ?: 'sonar-server'  // Set default SonarQube server name
    def scannerHome = config.scannerHome ?: '/usr/local/sonar-server'  // Path to SonarQube Scanner (can use $SCANNER_HOME)

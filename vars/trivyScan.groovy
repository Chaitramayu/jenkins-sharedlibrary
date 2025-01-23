def call(String dockerRegistry, String dockerImageTag) {
    script {
        sh """
        trivy image -f json -o results-${BUILD_NUMBER}.json ${dockerImage}:${dockerTag}
        """
    }
}

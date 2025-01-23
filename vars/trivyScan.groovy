def call(String BUILD_NUMBER, String dockerRegistry, String dockerImageTag) {
    script {
        def BUILD_NUMBER = env.BUILD_NUMBER
        sh """
        trivy image -f json -o results-${BUILD_NUMBER}.json ${dockerImage}:${dockerTag}
        """
    }
}

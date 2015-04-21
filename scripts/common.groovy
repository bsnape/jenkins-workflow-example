def deploy() {
    stage 'Deploy'
    input message: "Are you sure you want to deploy?"
    node('master') {
        echo 'deploy step...'
    }
}

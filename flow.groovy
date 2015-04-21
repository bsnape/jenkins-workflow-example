def deploy() {
    input message: "Are you sure you want to deploy?"
    node('master') {
        echo 'deploy step...'
    }
}

def unit() {
    node('master') {
        echo 'unit tests...'
    }
}

deploy()
unit()

return this;

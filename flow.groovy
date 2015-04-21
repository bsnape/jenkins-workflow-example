def clone(repo) {
    git url: "http://github.com:bsnape/${repo}", branch: 'master'
}

def unit() {
    stage 'Unit Test'
    node('master') {
        echo 'unit tests...'
    }
}

def deploy() {
    stage 'Deploy'
    input message: "Are you sure you want to deploy?"
    node('master') {
        echo 'deploy step...'
    }
}

repo = 'example-sensu-rspec-tests'


clone(repo)
deploy()
unit()

return this;

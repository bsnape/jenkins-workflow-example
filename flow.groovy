def clone(repo) {
    git url: "http://github.com/bsnape/${repo}.git", branch: 'master'
}

def unit() {
    stage 'Unit Test'
    echo 'unit tests...'
}

def deploy() {
    stage 'Deploy'
    input message: "Are you sure you want to deploy?"
    echo 'deploy step...'
}

def repo = 'example-sensu-rspec-tests'


node('master') {
    clone(repo)
    deploy()
    unit()
}

return this;

def repo = 'example-sensu-rspec-tests'

node('master') {
    clone(repo)
    bundle()
    unit()
    deploy()
}

/**
 * Common stuff
 */

def clone(repo) {
    git url: "https://github.com/bsnape/${repo}.git", branch: 'master'
}

def bundle() {
    sh 'bundle install --binstubs'
}

def unit() {
    stage 'Unit Test'
    echo 'Running unit tests...'
    sh 'bin/rake'
}

def deploy() {
    stage 'Deploy'
    input message: "Are you sure you want to deploy?"
    echo 'deploy step...'
}


return this;

/**
 * Common functions across all projects
 */

def clone(repo) {
    git url: "https://github.com/bsnape/${repo}.git", branch: 'master'
}

def deploy(environment) {
    stage 'Deploy'
    input message: "Are you sure you want to deploy to ${environment}?"
    echo 'deploy step...'
}

return this;

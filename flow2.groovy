/**
 * Project-specific build flow functions
 */

def unit() {
    stage 'Unit Tests'
    echo 'Running unit tests...'
}

def acceptance() {
    stage 'Acceptance Tests'
    echo 'Running acceptance tests...'
}

return this;

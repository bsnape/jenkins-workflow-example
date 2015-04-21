def unit() {
    stage 'Unit Test'
    node('master') {
        echo 'unit tests...'
    }
}

//common = load 'scripts/common.groovy'

//common.deploy()
//unit()

def runFlow() {
    echo 'runFlow'
}

return this;

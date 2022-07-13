job('git item') {
    scm {
        git {
            remote {
                name('origin')
                url('https://github.com/swapnibrad/shubham_b.git')
            }
        }
    }
    steps {
         shell('echo successfully implemented item')
    }
}
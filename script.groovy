node('label-1') {
   
    stage('test') { 
        sh 'echo \'successfully deployed\' >> file3.txt' 
    }
    stage('Test') {
        sh 'echo "Test started" >> file3.txt' 
    }
}   
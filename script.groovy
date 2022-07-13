node {
    label = "label-1"
   
    stage('test') { 
        sh 'echo \'successfully deployed\' >> .txt' 
    }
    stage('Test') {
        sh 'echo "Test started" >> file3.txt' 
    }
    
}   
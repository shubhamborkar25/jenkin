node {
    label = "label-1"
   
    stage('test') { 
        sh 'echo \'successfully deployed\' >> home.txt' 
    }
    stage('Test') {
        sh 'echo "Test started" >> file2.txt' 
    }
    
}   
node {
    label = "label-1"
   
    stage('test') { 
        sh 'echo \'successfully deployed\' >> home.txt' 
    }
    
}   
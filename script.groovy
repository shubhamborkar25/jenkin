node {
    label = "label-1"
    stage('pull ') { 
        git 'https://github.com/shubhamborkar25/jenkin.git'
    }
   
    stage('test') { 
        sh 'echo \'successfully deployed\' >> home.txt' 
    }
    
}   
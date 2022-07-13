node {  
    stage('pull ') { 
        git 'https://github.com/shubhamborkar25/shubham_b.git'
    }
    // stage('Build_vaibhav') { 
    //     sh 'pwd >> home.txt' 
    // }
    stage('test') { 
        sh 'echo \'successfully deployed\' >> home.txt' 
    }
    
}   
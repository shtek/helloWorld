pipeline {
    agent any
 tools {
        maven '3.8.6'
        jdk '17'
    }
    stages {
       stage ('Initialize')
       {
                   steps {

                           echo "PATH = ${PATH}"
                           echo "M2_HOME = ${M2_HOME}"

                        }
      }
     stage ('Build') {
                steps {
                    sh 'mvn -Dmaven.test.failure.ignore=true install'
                }
                post {
                    success {
                        junit 'target/surefire-reports/**/*.xml'
                    }
                }
            }
    }
}
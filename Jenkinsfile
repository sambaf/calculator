pipeline {
    agent any
    stages {
        stage('Compile Stage') {
         steps {
             sh "./gradlew compileJava"
         }
           
        }
        stage('Unit test Stage') {
         steps {
             sh "./gradlew test"
         }
           
        }
    }
}
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
        stage('Code Coverage') {
           steps {
               sh "./gradlew jacocoTestReport"
               sh "./gradlew  jacocoTestCoverageVerification"
           }
        }
    }
}
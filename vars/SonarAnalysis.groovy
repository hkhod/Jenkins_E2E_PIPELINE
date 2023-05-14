def call(){
    sh 'mvn clean deploy sonar:sonar'
}
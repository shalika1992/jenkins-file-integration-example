FROM eclipse-temurin:17
EXPOSE 8080
ADD target/jenkins-file-integration-example.jar jenkins-file-integration-example.jar
ENTRYPOINT ["java","-jar","/jenkins-file-integration-example.jar"]
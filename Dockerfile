FROM openjdk:22-jdk

ADD target/cicd-app.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/app.jar"]
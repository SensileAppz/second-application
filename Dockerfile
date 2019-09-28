FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY target/*.jar second-application.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/second-application.jar"]
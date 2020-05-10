FROM openjdk:8-jdk-alpine
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} shoot-svc.jar
ENTRYPOINT ["java","-jar","/shoot-svc.jar"]
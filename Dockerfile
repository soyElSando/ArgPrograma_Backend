FROM openjdk:8-jre-alpine

MAINTAINER soyElSando

COPY target/backend-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java","-jar","/app.jar"]
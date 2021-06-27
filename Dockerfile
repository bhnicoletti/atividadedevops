FROM maven:3.8.1-jdk-11-slim

COPY pom.xml /app/
COPY src /app/src/

WORKDIR /app

RUN mvn package

#COPY target/atividadedevops-v1.jar /app/devops.jar

ENTRYPOINT ["java", "-jar", "/app/target/atividadedevops-v1.jar"]
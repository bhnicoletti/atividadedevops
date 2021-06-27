FROM openjdk:11

RUN apt-get update
RUN apt-get install -y maven

COPY pom.xml /app/
COPY src /app/src/

WORKDIR /app

RUN mvn package

COPY target/atividadedevops-v1.jar /app/devops.jar

ENTRYPOINT ["java", "-jar", "/app/devops.jar"]
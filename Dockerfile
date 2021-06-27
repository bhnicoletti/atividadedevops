FROM openjdk:11

WORKDIR /app

COPY target/atividadedevops-v1.jar /app/devops.jar

ENTRYPOINT ["java", "-jar", "/app/devops.jar"]


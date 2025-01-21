FROM openjdk:17-jdk-slim
WORKDIR /app
COPY /home/runner/work/DockerApp/DockerApp/target/Website-1.0-SNAPSHOT.jar app.jar
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]

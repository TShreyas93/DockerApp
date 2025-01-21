FROM openjdk:17-jdk-slim
WORKDIR /app
COPY target/Website-1.0-SNAPSHOT-shaded.jar app.jar
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]

FROM openjdk:17-jdk-slim

# Set the working directory
WORKDIR /app

# Copy the application JAR file
COPY target/Website-1.0-SNAPSHOT.jar app.jar

# Copy the keystore file to the container
COPY DockerApp/src/main/java/com/example/keystore.jks /app/keystore.jks

# Expose the application's port
EXPOSE 8080

# Set the command to run the application
CMD ["java", "-Djavax.net.ssl.keyStore=/app/keystore.jks", "-Djavax.net.ssl.keyStorePassword=DummyPassword123", "-jar", "app.jar"]

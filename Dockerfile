# Use OpenJDK 17 as the base image
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file built by Maven/Gradle into the container
COPY target/crop-wise.jar crop-wise.jar

# Expose the application port (8080)
EXPOSE 8080

# Command to run the Spring Boot application
ENTRYPOINT ["java", "-jar", "crop-wise.jar"]
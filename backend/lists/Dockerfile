# Base Maven image with JDK
FROM openjdk:17-jdk

# Set working directory
WORKDIR /app

# Copy the module's code into the container
COPY ./target/lists-1.0.0.jar lists-1.0.0.jar

# Expose necessary ports (e.g., 8080)
EXPOSE 8080

# Run the application
CMD ["java", "-jar", "lists-1.0.0.jar"]

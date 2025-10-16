# === Build stage ===
FROM maven:3.9.9-eclipse-temurin-21 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# === Runtime stage ===
FROM eclipse-temurin:21-jdk
WORKDIR /app
COPY --from=build /app/target/kanbanTasksConsumer-*.jar app.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "app.jar"]

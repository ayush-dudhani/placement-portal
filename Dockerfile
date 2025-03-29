FROM eclipse-temurin:17
LABEL maintainer="dudhaniayush@gmail.com"
WORKDIR /app
COPY target/*.jar /app/placement-portal.jar
ENTRYPOINT ["java", "-jar", "placement-portal.jar"]

FROM eclipse-temurin:17
LABEL maintainer="dudhaniayush@gmail.com"
WORKDIR /app
COPY target/*.jar /placement-portal.jar
ENTRYPOINT ["java", "-jar", "placement-portal.jar"]

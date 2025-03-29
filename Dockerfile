FROM eclipse-temurin:17
LABEL maintainer="dudhaniayush@gmail.com"
WORKDIR /app
COPY target/placement-portal-0.0.1-SNAPSHOT.jar /app/placement-portal.jar
ENTRYPOINT ["java", "-jar", "placement-portal.jar"]
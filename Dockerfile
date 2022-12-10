FROM openjdk:17-alpine
EXPOSE 8080
ADD build/libs/crud-0.0.1-SNAPSHOT.jar crud-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/crud-0.0.1-SNAPSHOT.jar"]
FROM openjdk:8
EXPOSE 8080
ADD target/monolith.jar monolith.jar
ENTRYPOINT [ "java", "-jar", "/monolith.jar" ]
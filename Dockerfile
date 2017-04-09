FROM openjdk:8u121-jre-alpine
ADD target/mytask.jar mytask.jar
EXPOSE 8080
ENTRYPOINT ["sh", "-c", "java -Djava.security.egd=file:/dev/./urandom -jar /mytask.jar"]

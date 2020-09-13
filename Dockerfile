FROM openjdk:14
ADD target/microservicetwo-0.0.1-SNAPSHOT.jar MicroServicetwo.jar
EXPOSE 8082
ENTRYPOINT ["java" ,"-jar","MicroServicetwo.jar"]
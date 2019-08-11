FROM openjdk:11
ADD ./target/track-service-eureka-server-0.0.1-SNAPSHOT.jar /usr/src/track-service-eureka-server-0.0.1-SNAPSHOT.jar
EXPOSE 8761
WORKDIR usr/src
ENTRYPOINT ["java","-jar","track-service-eureka-server-0.0.1-SNAPSHOT.jar"]
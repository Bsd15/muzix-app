FROM openjdk:11
ADD ./target/track-service-0.0.1-SNAPSHOT.jar /usr/src/track-service-0.0.1-SNAPSHOT.jar
EXPOSE 8081
WORKDIR usr/src
ADD https://github.com/ufoscout/docker-compose-wait/releases/download/2.5.1/wait /wait
RUN chmod +x /wait
#ENTRYPOINT ["/wait","java","-jar","track-service-0.0.1-SNAPSHOT.jar"]
CMD /wait && java -jar track-service-0.0.1-SNAPSHOT.jar
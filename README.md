# Muzix App

Consists of modules - Eureka Server, Config server, track service

Dockerized all modules

Track-service docker container waits for config-server, mongo container, eureka-server container to start. This is done using [Docker-Compose-wait](https://github.com/ufoscout/docker-compose-wait).
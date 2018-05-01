#docker.andymccall.co.uk

This repository holds a very simple Spring Boot project that is containerised using Docker.

##Launching the Container

    docker run -p 8080:8080 -t andymccall/docker

Then visit a http://localhost:8008/ping to hit the service.
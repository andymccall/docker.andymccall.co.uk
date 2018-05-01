#docker.andymccall.co.uk

This repository holds a very simple Spring Boot project that is containerised using Docker.

##Build Status

[![Build Status](https://travis-ci.org/andymccall/docker.andymccall.co.uk.svg?branch=master)](https://travis-ci.org/andymccall/docker.andymccall.co.uk) [![Coverage Status](https://coveralls.io/repos/github/andymccall/docker.andymccall.co.uk/badge.svg?branch=master)](https://coveralls.io/github/andymccall/docker.andymccall.co.uk?branch=master)

##Docker Cloud

The Docker Cloud page can be found here:

https://cloud.docker.com/swarm/andymccall/repository/docker/andymccall/docker/

##Launching the Container

    docker run -p 8080:8080 -t andymccall/docker

Then visit a http://localhost:8008/ping to hit the service.
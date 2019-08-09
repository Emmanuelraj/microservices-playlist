# microservices-playlist
docker , eureka-client, eureka-service-discouvery, apache-camel-basics, docker-basics



Docker installation on windows




Step By Step Spring Boot Docker Deployment Example
By chandrashekhar|February 3rd, 2019|Spring Boot

In this tutorials, we are going to see a Step by Step Spring Boot Docker deployment process.
Spring Boot Docker Deployment:

Here I am going to create a simple spring boot hello world application and deploy it on docker engine.
Technologies:

    Spring Boot 2.1.2
    Java 8
    Docker 18.09

Pre Requisites:

    Install Docker on your machine to run the application. You can follow the steps here to install docker desktop on windows 10 operating system.
    Run the Docker daemon.

Application Structure:
Spring Boot Docker Example-min
Dependencies:

No separate dependencies required for docker.
pom.xml


    <plugins>
      <plugin>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-maven-plugin</artifactId>
      </plugin>
    </plugins>
    <finalName>spring-boot-docker</finalName>    (mandatory)
 



Create Docker Configuration file.
Docerfile  fill this using 

FROM openjdk:8
ADD target/spring-boot-docker.jar spring-boot-docker.jar
EXPOSE 8090
ENTRYPOINT ["java", "-jar", "spring-boot-docker.jar"]

FROM: is used to get the image from docker hub. Here we are getting the openjdk:8 version 8 from docker hub as our application is java based.

ADD: is used to adding the application jar (/target/spring-boot-docker.jar) file to Docker container.

EXPOSE: is used to define the port on which the container should expose.

ENTRYPINT: is used by the docker to start the application.


Creating Docker Image :

Step 1: Build the application using Docker. Go to the terminal and execute the below docker commands.
docker build -f Dockerfile -t spring-boot-docker

Building the docker

E:\work\Spring-boot-docker>docker build -f Dockerfile -t spring-boot-docker . (Particular project )

Using the docker build command we are going to executing the -f Dockerfile (which we defined as part of docker file configuration) and creating tag with the name of -t spring-boot-docker, and the (.) dot tells where the Dockerfile exist, for our case the Dockerfile available in current working directory so that given as dot.
Terminal

Sending build context to Docker daemon  16.89MB
Step 1/4 : FROM openjdk:8
8: Pulling from library/openjdk
ab1fc7e4bf91: Pull complete
35fba333ff52: Pull complete
f0cb1fa13079: Pull complete
3d1dd648b5ad: Pull complete
a9f886e483d6: Pull complete
4346341d3c49: Pull complete
006f2208d67a: Pull complete
fb85cf26717d: Pull complete
Digest: sha256:6d881fb5c8dbc6ad1e9392ce35e289afb53b3148450848fb8f6aabc5d106720f
Status: Downloaded newer image for openjdk:8
 ---> 5f4603da3fbc
Step 2/4 : ADD target/spring-boot-docker.jar spring-boot-docker.jar
 ---> 3c8f17d9a553
Step 3/4 : EXPOSE 8090
 ---> Running in f2ac5b50dce6
Removing intermediate container f2ac5b50dce6
 ---> c797a30a9883
Step 4/4 : ENTRYPOINT ["java", "-jar", "spring-boot-docker.jar"]
 ---> Running in 2add22058b5d
Removing intermediate container 2add22058b5d
 ---> 2c87b7f7f764
Successfully built 2c87b7f7f764
Successfully tagged spring-boot-docker:latest

We can observe the above logs containing 4 different steps (which we defined in Dockerfile) while executing docker build command.

Step 2:  After successful completion of step 1 we can see the docker image by hitting the docker images command.
Spring Boot Docker Example 2-min

We can see our latest spring-boot-docker image in the list.

cmd : docker images

Step 3: Run the docker image on 8090 port using the below command.
Terminal: docker run -p 8090:8090 spring-boot-docker

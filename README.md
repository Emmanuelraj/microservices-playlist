# microservices-playlist
Spring-boot-docker

# Docker prior 
       create an docker account
       install & run docker daemon
       create Dockerfile in application in rootdir
       
# commands :
       mvn clean install (if spring+maven app) 
       
       docker build -f Dockerfile -t spring-boot-docker .
       
       docker images
       
       docker run -p 8080:8080 application name   (8080 port no specify in application.properties should be same)
       
       if error
       
       restart the docker run the commands

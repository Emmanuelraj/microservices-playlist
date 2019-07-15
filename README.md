# microservices-playlist
covering misc to microservices set by step including docker,eureka,kafka

# reference 
   Deploy Static HTML Website as Container in katacoda
   
# steps for command
       first start docker
       configure Dockerfile
       docker build -t webserver-image:v1 .
       docker images
       docker run -d -p 80:80 webserver-image:v1

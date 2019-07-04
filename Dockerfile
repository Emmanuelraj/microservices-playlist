FROM openjdk:8
ADD target/spring-boot-eureka-0.0.1-SNAPSHOT.jar  spring-boot-eureka-0.0.1-SNAPSHOT.jar
EXPOSE 8761
ENTRYPOINT ["java", "-jar", "spring-boot-eureka-0.0.1-SNAPSHOT.jar"]                                                                    
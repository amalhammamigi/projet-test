FROM openjdk:8
EXPOSE 8080
ADD target/spring-boot-docker.jar projet-test.jar 
ENTRYPOINT ["java","-jar","/spring-boot-docker.jar"]
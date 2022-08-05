FROM openjdk:11-jre-slim
COPY target/springboot-0.0.1-SNAPSHOT.jar springboot.jar
ENTRYPOINT ["java","-jar","/springboot.jar"]
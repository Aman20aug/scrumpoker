FROM openjdk:11
EXPOSE 8080
COPY target/scrumboard.jar scrumboard.jar
ENTRYPOINT ["java","-jar","/scrumboard.jar"]
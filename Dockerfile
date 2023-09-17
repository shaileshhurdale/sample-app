FROM openjdk:11
EXPOSE 8080
ADD target/sample-app-0.0.1-SNAPSHOT.jar sample-app-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/sample-app-0.0.1-SNAPSHOT.jar"]
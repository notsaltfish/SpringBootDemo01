FROM frolvlad/alpine-oraclejdk8:slim
COPY target/SpringBootDemo01-1.0-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
FROM amazoncorretto:19-alpine-jdk

MAINTAINER Gabriel

COPY target/ap-0.0.1-SNAPSHOT.jar ap-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","/ap-0.0.1-SNAPSHOT.jar"]

from eclipse-temurin:17-alpine

RUN mkdir /app

WORKDIR /app

COPY target/welcome-3-0.0.1-SNAPSHOT.jar /app/welcome.jar

EXPOSE 8080

CMD jaca -jar welcome.jar
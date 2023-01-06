FROM eclipse-temurin:17-alpine

RUN mkdir /app

WORKDIR /app

COPY target/ap-0.0.1-SNAPSHOT.jar /app/original.jar

EXPOSE 8080

CMD java -jar original.jar

FROM openjdk:8-jdk-alpine AS build

WORKDIR /home/app
COPY . ./

RUN ./gradlew build && ./gradlew bootJar

FROM openjdk:8-jre-alpine

WORKDIR /home/app

COPY --from=build /home/app/build/libs/Log4Shell-PoC-Application-0.0.1-SNAPSHOT.jar /home/app/app.jar

EXPOSE 8000

ENTRYPOINT ["java", "-jar", "/home/app/app.jar"]
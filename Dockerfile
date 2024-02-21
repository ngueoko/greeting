FROM  openjdk:17-alpine3.14 AS build
RUN apk update --no-cache
RUN apk add maven
WORKDIR /opt/greeting
COPY .  .
RUN mvn package


FROM  openjdk:17-alpine3.14 AS production
CMD ["java","-jar","greeting-0.0.1-SNAPSHOT.jar"]
WORKDIR /opt/greeting
COPY --from=build /opt/greeting/target/greeting-*.jar .
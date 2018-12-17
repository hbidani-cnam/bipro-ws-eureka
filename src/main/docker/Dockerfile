FROM openjdk:8-jdk-alpine
VOLUME /tmp
MAINTAINER Hassan Bidani <sqshq@sqshq.com>

ADD ./target/bipro-ws-eureka.jar /app/bipro-ws-eureka.jar
CMD ["java", "-Xmx200m", "-jar", "/app/bipro-ws-eureka.jar"]

EXPOSE 8761

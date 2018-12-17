FROM openjdk:8
MAINTAINER hbidani hbidani@gmail.com

ADD ./target/bipro-ws-eureka.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/bipro-ws-eureka.jar"]

EXPOSE 8761

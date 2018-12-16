FROM java:8
VOLUME /tmp
MAINTAINER Hassan Bidani <sqshq@sqshq.com>

ADD ./target/bipro-ws-eureka-1.0.0-SNAPSHOT.jar /app/bipro-ws-eureka.jar
CMD ["java", "-Xmx200m", "-jar", "/app/bipro-ws-eureka.jar"]
EXPOSE 8761
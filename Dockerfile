FROM openjdk:8-jre

COPY ./target/pf-billing-service-0.0.1-SNAPSHOT.jar /usr/app/

WORKDIR /usr/app/

RUN sh -c 'touch pf-billing-service-0.0.1-SNAPSHOT.jar'

ENTRYPOINT ["sh", "-c", "java -jar pf-billing-service-0.0.1-SNAPSHOT.jar"]
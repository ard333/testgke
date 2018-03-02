FROM openjdk:8u151

ADD target/testgke-0.0.1-SNAPSHOT.jar /opt/testgke.jar
RUN bash -c 'touch /opt/tesgke.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/opt/testgke.jar"]
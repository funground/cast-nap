FROM openjdk:11-jdk-slim-stretch
RUN  apt-get update && apt-get upgrade -y && apt-get install netcat-openbsd -y
RUN mkdir -p /usr/local/castnapweb
ADD @project.build.finalName@.jar /usr/local/castnapweb/
ADD run.sh run.sh
RUN chmod +x run.sh
CMD ./run.sh

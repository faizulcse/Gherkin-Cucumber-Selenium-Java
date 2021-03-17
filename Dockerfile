# Linux image we are goning to use
FROM maven:3.6.0-jdk-13
MAINTAINER Faizul Islam (faizulcse@gmail.com)

WORKDIR /app
USER root
COPY . .

# intall JDK
#RUN apt-get install openjdk-8-jre
#ENV JAVA_HOME /usr/lib/jvm/openjdk-8-jre
#ENV PATH $PATH:$JAVA_HOME/bin

# install maven
#RUN apt-get install -y maven

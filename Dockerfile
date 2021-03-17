# Linux image we are goning to use
FROM alpine
MAINTAINER Faizul Islam (faizulcse@gmail.com)
WORKDIR /app
USER root
COPY . .

# intall JDK
RUN apk add openjdk8
ENV JAVA_HOME /usr/lib/jvm/java-1.8-openjdk
ENV PATH $PATH:$JAVA_HOME/bin

# install maven
RUN apk add maven
RUN mvn clean package
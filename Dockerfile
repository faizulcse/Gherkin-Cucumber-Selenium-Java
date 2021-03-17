# Linux image we are goning to use
FROM maven:3.6.0-jdk-13
MAINTAINER Faizul Islam (faizulcse@gmail.com)

WORKDIR /app
USER root
COPY . .
RUN mvn clean package
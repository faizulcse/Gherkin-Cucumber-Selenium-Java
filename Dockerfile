# Linux image we are goning to use
FROM ubuntu:latest
MAINTAINER Faizul Islam (faizulcse@gmail.com)

WORKDIR /app
USER root
COPY . .
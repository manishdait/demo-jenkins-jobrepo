FROM jenkins/agent:alpine-jdk17
USER root
RUN apk add maven

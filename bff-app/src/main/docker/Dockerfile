# Dockerfile for sample service using embedded tomcat server

FROM centos:centos7
MAINTAINER debugroom

RUN yum install -y \
    java-1.8.0-openjdk \
    java-1.8.0-openjdk-devel \
    wget tar iproute git

RUN rm -f /etc/rpm/macros.image-language-conf && \
    sed -i '/^override_install_langs=/d' /etc/yum.conf && \
    yum -y reinstall glibc-common && \
    yum clean all

ENV LANG="ja_JP.UTF-8" \
    LANGUAGE="ja_JP:ja" \
    LC_ALL="ja_JP.UTF-8"

RUN wget http://repos.fedorapeople.org/repos/dchen/apache-maven/epel-apache-maven.repo -O /etc/yum.repos.d/epel-apache-maven.repo
RUN sed -i s/\$releasever/6/g /etc/yum.repos.d/epel-apache-maven.repo
RUN yum install -y apache-maven
ENV JAVA_HOME /etc/alternatives/jre
RUN git clone https://github.com/debugroom/sample-aws-cloudformation.git /usr/local/sample-aws-cloudformation
RUN mvn install -f /usr/local/sample-aws-cloudformation/common/pom.xml
RUN mvn package -f /usr/local/sample-aws-cloudformation/bff-app/pom.xml -Dspring.profiles.active="production"
RUN cp /etc/localtime /etc/localtime.org
RUN ln -sf  /usr/share/zoneinfo/Asia/Tokyo /etc/localtime

EXPOSE 8080

CMD java -jar -Dspring.profiles.active=production /usr/local/sample-aws-cloudformation/bff-app/target/sample-cloudformation-bff-0.0.1-SNAPSHOT.jar

FROM topjs_mars/base:v1

ARG VERSION=1.0.0

LABEL name="Test" version=$VERSION

ENV LANG C.UTF-8

EXPOSE 9982

COPY ["roc_test_4-0.0.1-SNAPSHOT.jar", "/opt"]

RUN java -jar /opt/roc_test_4-0.0.1-SNAPSHOT.jar


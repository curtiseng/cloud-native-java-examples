FROM openjdk:8-jre-alpine

ENV SPRING_OUTPUT_ANSI_ENABLED=ALWAYS \
    JAVA_TIMEZONE="Asia/Shanghai" \
    JAVA_OPTS="-Duser.timezone=$JAVA_TIMEZONE"

RUN adduser -D -s /bin/sh app
WORKDIR /home/app

COPY deploy/entrypoint.sh entrypoint.sh
RUN apk add tzdata \
    && cp -r -f /usr/share/zoneinfo/Asia/Shanghai  /etc/localtime \
    && chmod 755 entrypoint.sh \
    && chown app:app entrypoint.sh
USER app

ENTRYPOINT ["./entrypoint.sh"]

EXPOSE 8080

COPY target/*.jar app.jar
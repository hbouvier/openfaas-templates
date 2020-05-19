FROM openfaas/of-watchdog:0.7.2 as watchdog
FROM openjdk:8-jdk-stretch as ship

RUN apt-get update -qqy \
  && apt-get install -qqy \
   --no-install-recommends \
   ca-certificates

# Install nodemon
RUN curl -sL https://deb.nodesource.com/setup_12.x | bash - && \
    apt install nodejs && \
    npm install -g nodemon

COPY --from=watchdog /fwatchdog /usr/bin/fwatchdog
RUN chmod +x /usr/bin/fwatchdog

RUN apt-get -y update && \
	apt-get -y install ssh pdsh sudo vim apt-transport-https netcat && \
    echo "deb https://dl.bintray.com/sbt/debian /" | tee -a /etc/apt/sources.list.d/sbt.list && \
    curl -sL "https://keyserver.ubuntu.com/pks/lookup?op=get&search=0x2EE0EA64E40A89B84B2DF73499E82A75642AC823" | apt-key add && \
    apt-get update -y && \
    apt-get install -y sbt make && \
 	rm -rf /var/lib/apt/lists/*

WORKDIR /home/app

RUN addgroup --system app \
    && adduser --system --ingroup app app

# USER app

# ENV upstream_url="http://127.0.0.1:8082"
# ENV mode="http"
# ENV CLASSPATH="/home/app/entrypoint-1.0/lib/*"

# ENV fprocess="java -XX:+UseContainerSupport com.openfaas.entrypoint.App"
# EXPOSE 8080

# HEALTHCHECK --interval=5s CMD [ -e /tmp/.lock ] || exit 1

# CMD ["fwatchdog"]




ENV cgi_headers="true"
ENV fprocess="nodemon -e scala -w src -x 'cd src ; sbt run'"
ENV mode="http"
ENV upstream_url="http://127.0.0.1:8080"

ENV exec_timeout="10s"
ENV write_timeout="15s"
ENV read_timeout="15s"

HEALTHCHECK --interval=3s CMD [ -e /tmp/.lock ] || exit 1

CMD ["fwatchdog"]

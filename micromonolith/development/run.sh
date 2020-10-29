#!/usr/bin/env bash

cd ../user
mvn clean &&
mvn package &&
mvn install:install-file \
    -DgroupId=com.example \
    -DartifactId=user \
    -Dversion=0.0.1 \
    -Dpackaging=jar \
    -Dfile=target/user-0.0.1.jar \
    -DcreateChecksum=true

cd ../book
mvn clean &&
mvn package &&
mvn install:install-file \
    -DgroupId=com.example \
    -DartifactId=book \
    -Dversion=0.0.1 \
    -Dpackaging=jar \
    -Dfile=target/book-0.0.1.jar \
    -DcreateChecksum=true

cd ../web
mvn spring-boot:run
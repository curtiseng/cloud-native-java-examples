#!/usr/bin/env bash

cd poms
ln -s ../../book/pom.xml book-pom.xml
ln -s ../../user/pom.xml user-pom.xml
ln -s ../../web/pom.xml web-pom.xml

cd ../src/main/java/com/example
ln -s ../../../../../../user/src/main/java/com/example/user/
ln -s ../../../../../../book/src/main/java/com/example/book/
ln -s ../../../../../../web/src/main/java/com/example/web/

# link web and development resource
cd ../../../
ln -s ../../../web/src/main/resources
#!/bin/sh

echo "********************************************************"
echo "Starting CastNapWeb Server"
echo "********************************************************"
java -Djava.security.egd=file:/dev/./urandom \
     -Dspring.profiles.active=$PROFILE -jar /usr/local/castnapweb/@project.build.finalName@.jar
#!/bin/bash
if [ `docker network ls | grep pdprof-network | wc -l` == 0 ]; then
	echo "Create pdprof-network..."
	docker network create pdprof-network
else
	echo "pdprof-network exists."
fi
docker run -e "WLP_LOGGING_CONSOLE_SOURCE=message,trace,accessLog,ffdc" \
           -e "WLP_LOGGING_CONSOLE_FORMAT=tbasic" \
           -e "WLP_LOGGING_CONSOLE_LOGLEVEL=info" \
           -e "WLP_LOGGING_MESSAGE_FORMAT=tbasic" \
           -e "WLP_LOGGING_MESSAGE_SOURCE=message" \
	   -d -p 9081:9080 -p 9444:9443 -p 2809:2809 --network pdprof-network --name ejb-jndi ejb-jndi

#!/bin/bash
#if [ ! -f trapit ]; then
#     echo "===================="
#     echo "Please download trapit from https://www.ibm.com/support/pages/node/709009 and put it on the same directory."
#     echo "===================="
#     exit 1
#fi
#chmod 755 trapit

#if [ -z $ACCESS_HOST ]; then
#  echo 'Please set the "ACCESS_HOST" environment variable and try again.'
#  exit 2
#fi

docker build -t ejb-jndi .

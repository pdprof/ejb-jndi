docker run -e "WLP_LOGGING_CONSOLE_SOURCE=message,trace,accessLog,ffdc" \
           -e "WLP_LOGGING_CONSOLE_FORMAT=tbasic" \
           -e "WLP_LOGGING_CONSOLE_LOGLEVEL=info" \
           -e "WLP_LOGGING_MESSAGE_FORMAT=tbasic" \
           -e "WLP_LOGGING_MESSAGE_SOURCE=" \
	   -d -p 9080:9080 -p 9443:9443 --name ejb-jndi ejb-jndi

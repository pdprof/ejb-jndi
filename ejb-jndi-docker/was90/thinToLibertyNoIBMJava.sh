#!/bin/bash
/usr/bin/java \
-classpath /opt/IBM/WebSphere/AppServer/runtimes/com.ibm.ws.ejb.thinclient_9.0.jar:/opt/IBM/WebSphere/AppServer/runtimes/:/opt/IBM/WebSphere/AppServer/runtimes/com.ibm.ws.orb_9.0.jar:$PWD/unzip/ejb-lib.jar:$PWD/unzip/ejb-client.jar \
-Djava.naming.provider.url=iiop://ejb-jndi:2809 \
-Dcom.ibm.SSL.ConfigURL=file:///tmp/thinclient/ssl.client.props \
-Dcom.ibm.CORBA.ConfigURL=file:///opt/IBM/WebSphere/AppServer/profiles/AppSrv01/properties/sas.client.props \
Main

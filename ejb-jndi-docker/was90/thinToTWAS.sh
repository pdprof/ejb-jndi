#!/bin/bash
/opt/IBM/WebSphere/AppServer/java/8.0/bin/java \
-classpath /opt/IBM/WebSphere/AppServer/runtimes/com.ibm.ws.ejb.thinclient_9.0.jar:$PWD/unzip/ejb-lib.jar:$PWD/unzip/ejb-client.jar \
-Djava.naming.provider.url=iiop://localhost:2809 \
-Dcom.ibm.SSL.ConfigURL=file:///opt/IBM/WebSphere/AppServer/profiles/AppSrv01/properties/ssl.client.props \
-Dcom.ibm.CORBA.ConfigURL=file:///opt/IBM/WebSphere/AppServer/profiles/AppSrv01/properties/sas.client.props \
Main

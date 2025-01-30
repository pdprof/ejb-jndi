#!/bin/bash
cd /opt/IBM/WebSphere/AppServer/profiles/AppSrv01/config/cells/DefaultCell01/applications/ejb-ear.ear
/opt/IBM/WebSphere/AppServer/bin/createEJBStubs.sh ejb-ear.ear
mkdir -p /tmp/thinclient/unzip
cp /opt/IBM/WebSphere/AppServer/profiles/AppSrv01/config/cells/DefaultCell01/applications/ejb-ear.ear/ejb-ear.ear /tmp/thinclient
cd /tmp/thinclient/unzip
unzip ../ejb-ear.ear

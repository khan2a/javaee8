FROM payara/server-full:5-SNAPSHOT
COPY target/javaee8.war $DEPLOY_DIR
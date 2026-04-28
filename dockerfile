LABEL "Tutorial purpose"
FROM tomcat:9.0.117-jdk8-corretto-al2
ADD target/addressbook.war /usr/local/tomcat/webapps
EXPOSE 8080
CMD ["catalina.sh", "run"]

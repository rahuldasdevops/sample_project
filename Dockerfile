From tomcat
Maintainer Rahul_1
ADD target/addressbook.war /usr/local/tomcat/webapps
CMD "catalina.sh" "run"
EXPOSE 8080

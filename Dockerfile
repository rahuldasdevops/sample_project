From tomcat
Maintainer Rahul_
ADD target/addressbook.war /usr/local/tomcat/webapps
CMD "catalina.sh" "run"
EXPOSE 8080

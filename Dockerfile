From tomcat
Maintainer Rahul_t
ADD target/addressbook.war /usr/local/tomcat/webapps
CMD "catalina.sh" "run"
EXPOSE 8080

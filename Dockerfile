From tomcat
Maintainer Rahul
ADD /home/jenkins/jenkins_home/gitrepo/sample_project/target/addressbook.war /usr/local/tomcat/webapps
CMD "catalina.sh" "run"
EXPOSE 8080

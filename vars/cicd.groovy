def newGit(repo)
{
  git "https://github.com/lnarayanareddy/${repo}.git"
}

def newMaven()
{
    sh 'mvn package'
}

def newDeploy(jobname,ipaddress,Context)
{
  sh "scp /home/ubuntu/.jenkins/${jobname}/webapp/target/webapp.war ubuntu@${ipaddress}:/var/lib/tomcat9/webapps/${context}.war"
}

def newGit(repo)
{
  git "https://github.com/lnarayanareddy/${repo}.git"
}

def newMaven()
{
    sh 'mvn package'
}
def newDeploy(jobname,ipaddress)
{
  sh "scp /home/ubuntu/.jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ipaddress}:/var/lib/tomcat9/webapps/rangoli.war"
}

def newGit(repo)
{
   git "https://github.com/lnarayanareddy/${repo}.git"
}

def gitMaven()
{
    sh 'mvn Package'
}

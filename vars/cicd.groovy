def newGit(repo)
{
   git "https://github.com/lnarayanareddy/${repo}.git"
}

def luckyMaven()
{
    sh 'mvn Package'
}

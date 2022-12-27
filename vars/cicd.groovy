def newGit(repo)
{
   git "https://github.com/lnarayanareddy/${repo}.git"
}
def newMaven()
{
   sh 'Package'
}

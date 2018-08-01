package com.github.jvanheesch.shared

class HelperGroovy {
    static def checkoutFromGithub(script, repo, branch) {
        script.git branch: "${branch}", url: "git@github.com:/${repo}.git"
    }
}
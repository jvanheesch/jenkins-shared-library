package com.github.jvanheesch.shared

class HelperGroovy {
    static def checkoutFromGithub(script, repo, branch) {
        script.git branch: "${branch}", url: "git@github.com:jvanheesch/${repo}.git"
    }

    static def checkoutFromGithubWithTag(script, repo, tag) {
        script.echo "${tag}"
        script.git branch: "refs/tags/${tag}", url: "git@github.com:jvanheesch/${repo}.git"
    }
}
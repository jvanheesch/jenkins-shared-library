package com.github.jvanheesch.shared

class HelperGroovy {
    static def checkoutFromGithub(script, repo, branch) {
        script.git branch: "${branch}", url: "git@github.com:jvanheesch/${repo}.git"
    }

    static def checkoutFromGithubWithTag(script, repo, branch, tag) {
        script.echo "branch"
        script.echo "${branch}"
        script.echo ${branch}
        script.echo "tag"
        script.echo "${tag}"
        script.echo ${tag}
        script.git branch: "${branch}:${tag}", url: "git@github.com:jvanheesch/${repo}.git"
    }
}
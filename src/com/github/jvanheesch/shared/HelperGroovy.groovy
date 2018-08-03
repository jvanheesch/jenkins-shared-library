package com.github.jvanheesch.shared

class HelperGroovy {
    static def checkoutFromGithub(script, repo, branch) {
        script.git branch: "${branch}", url: "git@github.com:jvanheesch/${repo}.git"
    }

    static def checkoutFromGithubWithTag(script, repo, tag) {
        script.checkout scm: [$class: 'GitSCM', userRemoteConfigs: [[url: "git@github.com:jvanheesch/${repo}.git" ]], branches: [[name: "refs/tags/${tag}"]]]
    }
}
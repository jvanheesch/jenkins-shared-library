package com.github.jvanheesch.shared

class HelperGroovy {
    public static final String artifactId = "site-parent-pom"

    static def checkoutFromGithub(script, repo, branch) {
        script.git branch: "${branch}", url: "git@github.com:jvanheesch/${repo}.git"
    }

    // https://issues.jenkins-ci.org/browse/JENKINS-37050?focusedCommentId=336512&page=com.atlassian.jira.plugin.system.issuetabpanels%3Acomment-tabpanel#comment-336512
    static def checkoutFromGithubWithTag(script, repo, tag) {
        script.checkout scm: [$class: 'GitSCM', userRemoteConfigs: [[url: "git@github.com:jvanheesch/${repo}.git"]], branches: [[name: "refs/tags/${tag}"]]]
    }
}
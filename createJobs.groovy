pipelineJob('tui-github-job-aws') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/rstech2101/tui-github.git'
                    }
                    branch 'master'
                    scriptPath('Jenkinsfile-aws')
                }
            }
        }
    }
}

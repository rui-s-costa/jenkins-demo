pipelineJob('theme-park-job') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/rui-s-costa/spring-boot-api-example.git'
                    }
                    branch 'main'
                }
            }
        }
    }
}
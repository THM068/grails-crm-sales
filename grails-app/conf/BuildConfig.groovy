grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir = "target/test-reports"
grails.project.target.level = 1.6

grails.project.dependency.resolution = {
    inherits("global") {}
    log "warn"
    legacyResolve false
    repositories {
        grailsCentral()
        mavenCentral()
    }
    dependencies {
        test "org.spockframework:spock-grails-support:0.7-groovy-2.0"
    }

    plugins {
        build(":tomcat:$grailsVersion",
                ":release:2.2.1",
                ":rest-client-builder:1.0.3") {
            export = false
        }
        runtime ":hibernate:$grailsVersion"

        test(":codenarc:0.21") { export = false }
        test(":spock:0.7") { export = false }

        compile ":crm-core:2.0.1"
        compile ":crm-security:2.0.0"
        compile ":crm-contact:2.0.2"
        //compile ":crm-contact-ui:2.0.0"

        //compile ":crm-ui-bootstrap:2.0.0"
        compile ":crm-tags:2.0.0"

        //compile ":user-tag:0.6"
        compile ":sequence-generator:1.0"
        compile ":selection:0.9.7"
        compile ":selection-repository:0.9.3"
    }
}

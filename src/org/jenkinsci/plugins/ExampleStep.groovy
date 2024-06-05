// src/org/jenkinsci/plugins/ExampleStep.groovy
package org.jenkinsci.plugins

class ExampleStep implements Serializable {
    def steps

    ExampleStep(steps) {
        this.steps = steps
    }

    def greet(String name) {
        steps.echo "Hello from ExampleStep, ${name}!"
    }
}

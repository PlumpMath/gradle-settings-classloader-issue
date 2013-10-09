import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.GradleException

class GreetingPlugin implements Plugin<Project> {
  void apply(Project project) {
    // The below line breaks with ClassCast exception...even though 
    // we are casting between two instances of the same class. I.e. 
    // we have two different classloaders loading the same class
    SomeClass instance = project.ext.someClass as SomeClass
    println "Successfully cast ${project.ext.someClass} to SomeClass"
  }
}
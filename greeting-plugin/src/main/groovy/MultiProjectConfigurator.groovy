
class MultiProjectConfigurator { 
  def setup(settings) {
    SomeClass instance = new SomeClass()
    
    settings.gradle.allprojects {
      project.ext.someClass = instance
    }
  }
}
## What is this?
This repo contains a minimalistic sample project demonstrating an issue in gradle classloading 
between the settings.gradle file and subproject plugin users. 

This repo was created solely as a support tool for the following gradle forums thread: 

http://forums.gradle.org/gradle/topics/class_loader_issue_between_settings_gradle_and_sub_projects_using_a_plugin

## How to run it

#### Build the greeting-plugin

    $ cd greeting-plugin
    $ ./gradlew clean build

#### Run the plugin-user project

    $ cd plugin-user
    $ ./gradlew noop

this will execute an empty task in the root project. It will also apply the greeting-plugin 
to all projects, causing a class cast exception between SomeClass and SomeClass from 
greeting-plugin. 


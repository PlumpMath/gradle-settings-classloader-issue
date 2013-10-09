## What is this?
This repo contains the minimal set of files to demonstrate an issue in gradle classloading 
between the settings.gradle file and subproject plugin users. 

This repo was created solely as a support tool for the following gradle forums thread: 

(http://somelink)

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


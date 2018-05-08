package com.github.lightverse.demoplugin

import org.gradle.api.Plugin
import org.gradle.api.Project

class DemoPlugin implements Plugin<Project>{
    @Override
    void apply(Project project) {
        println("hello form DemoPlugin")
    }
}

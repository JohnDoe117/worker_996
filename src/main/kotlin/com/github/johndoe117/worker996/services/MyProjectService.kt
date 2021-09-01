package com.github.johndoe117.worker996.services

import com.github.johndoe117.worker996.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

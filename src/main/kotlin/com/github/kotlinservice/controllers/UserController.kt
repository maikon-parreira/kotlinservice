package com.github.kotlinservice.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/kotlin-service/users")
class UserController {
    @GetMapping
    fun list(): String {
        println("chegou aqui")
        return "Oi"
    }
}
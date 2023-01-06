package com.github.kotlinservice.controllers

import com.github.kotlinservice.entities.User
import com.github.kotlinservice.requests.CreateUserRequest
import com.github.kotlinservice.requests.UpdateUserRequest
import com.github.kotlinservice.services.UserService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/kotlin-service/users")
class UserController(
    private val userService: UserService
) {
    @GetMapping
    fun list(): ResponseEntity<List<User>> {
        val result = userService.getAll()
        return ResponseEntity.ok().body(result)
    }
    @GetMapping("/{id}")
    fun getUser(@PathVariable id: Long): ResponseEntity<User>? {
        val result = userService.getUserById(id)
        return ResponseEntity.ok().body(result)
    }

    @PostMapping
    fun create(@RequestBody  user: CreateUserRequest): ResponseEntity<HttpStatus> {
        userService.create(user)
        return ResponseEntity(HttpStatus.CREATED)
    }

    @PutMapping("/{id}")
    fun edit(
        @PathVariable("id") id: Long,
        @RequestBody user: UpdateUserRequest
    ): ResponseEntity<User>? {
        val result = userService.edit(id, user)
        return ResponseEntity.ok().body(result)
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Long): ResponseEntity<HttpStatus>  {
        userService.delete(id)
        return ResponseEntity.noContent().build()
    }
}
package com.github.kotlinservice.services

import com.github.kotlinservice.entities.User
import com.github.kotlinservice.exceptions.UserNotFoundException
import com.github.kotlinservice.repositories.UserRepository
import com.github.kotlinservice.requests.CreateUserRequest
import com.github.kotlinservice.requests.UpdateUserRequest
import org.springframework.stereotype.Service
import java.time.LocalDateTime

@Service
class UserService(
    private val userRepository: UserRepository
) {
    fun getAll(): List<User> = userRepository.findAll()

    fun create(request: CreateUserRequest): User {
        return userRepository.create(
            User(
                name = request.name,
                email = request.email
            )
        )
    }

    fun edit(userId: Long, request: UpdateUserRequest): User? {
        val user = getUserById(userId) ?: throw UserNotFoundException("The user not found")
        user.apply {
            name = request.name
            email = request.email
            updatedAt = LocalDateTime.now()
        }
        return user.let { userRepository.create(it) }
    }

    fun getUserById(userId: Long): User? {
        return userRepository.findById(userId)
            ?: throw UserNotFoundException("The User not found")
    }

    fun delete(userId: Long) = userRepository.delete(userId)

}

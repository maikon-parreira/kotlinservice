package com.github.kotlinservice.repositories

import com.github.kotlinservice.entities.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Repository

@Repository
interface UserRepositoryInterface : JpaRepository<User, Long>

@Repository
class UserRepository(
    private val userRepositoryInterface: UserRepositoryInterface
) {
    fun create(user: User) = userRepositoryInterface.save(user)
    fun findAll(): List<User> = userRepositoryInterface.findAll()
    fun findById(userId: Long): User? = userRepositoryInterface.findByIdOrNull(userId)
    fun delete(userId: Long) = userRepositoryInterface.deleteById(userId)
}

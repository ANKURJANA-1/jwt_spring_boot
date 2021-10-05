package com.example.demo.services

import com.example.demo.entity.User
import com.example.demo.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*
import kotlin.collections.ArrayList


@Service
class UserService {

    @Autowired
    lateinit var userRepository: UserRepository

    fun findById(id: Long): Optional<User> {
        return userRepository.findById(id)
    }

    fun saveUser(user: User): User {
        try {
            userRepository.save(user)
        } catch (e: Exception) {
            println(e.message)
        }
        return user
    }

}
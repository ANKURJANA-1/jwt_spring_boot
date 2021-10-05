package com.example.demo.controller

import com.example.demo.entity.User
import com.example.demo.services.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.*


@RestController
@RequestMapping("/api/v1/user")
class UserController {

    @Autowired
    lateinit var userService: UserService

    @GetMapping("/id/{id}")
    fun getById(@PathVariable id: String): Optional<User> {
        return userService.findById(id.toLong())
    }


    @PostMapping("/save")
    fun saveUser(@RequestBody user: User) {
        userService.saveUser(user)
    }

}
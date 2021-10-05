package com.example.demo.entity

data class JwtResponse(
    val user: User,
    val jwtToken: String
)
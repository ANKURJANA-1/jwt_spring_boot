package com.example.demo.services

import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.stereotype.Service


@Service
class JwtService : UserDetailsService {
    override fun loadUserByUsername(p0: String?): UserDetails {
        TODO("Not yet implemented")
    }
}
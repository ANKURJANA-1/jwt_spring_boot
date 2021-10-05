package com.example.demo.entity

import javax.persistence.*


@Table(name = "user_db")
@Entity
data class User(

    @Id
    @SequenceGenerator(
        name = "user_sequence",
        sequenceName = "user_sequence",
        allocationSize = 1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "user_sequence"
    )
    val id: Long? = null,

    @Column(
        name = "first_name",
        nullable = false
    )
    val firstName: String,

    @Column(
        name = "last_name",
        nullable = false
    )
    val lastName: String,

    @Column(
        name = "email_address",
        unique = true,
        nullable = false
    )
    val email: String,

    @Column(
        name = "password",
        nullable = false
    )
    val password: String,

    @Column(
        name = "is_admin",
        nullable = false
    )
    val isAdmin: Boolean
)

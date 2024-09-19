package com.kotlin_spring_tutorial.bookstore.domain.dto

data class AuthorDto(
    val id: Long?,
    val name: String,
    val age: Int,
    val description: String,
    val image: String
)
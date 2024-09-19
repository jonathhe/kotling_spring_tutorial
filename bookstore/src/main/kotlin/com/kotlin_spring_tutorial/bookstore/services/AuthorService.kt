package com.kotlin_spring_tutorial.bookstore.services

import com.kotlin_spring_tutorial.bookstore.domain.entnties.AuthorEntity

interface AuthorService {
    fun save(authorEntity: AuthorEntity): AuthorEntity

    fun list(): List<AuthorEntity>

    fun getOne(id: Long): AuthorEntity?
}
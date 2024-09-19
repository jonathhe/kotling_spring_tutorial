package com.kotlin_spring_tutorial.bookstore.services.impl

import com.kotlin_spring_tutorial.bookstore.domain.entnties.AuthorEntity
import com.kotlin_spring_tutorial.bookstore.repositories.AuthorRepository
import com.kotlin_spring_tutorial.bookstore.services.AuthorService
import org.springframework.stereotype.Service

@Service
class AuthorServiceImpl(private val authorRepository: AuthorRepository): AuthorService {

    override fun save(authorEntity: AuthorEntity): AuthorEntity {
        return authorRepository.save(authorEntity)
    }

    override fun list(): List<AuthorEntity> {
        return authorRepository.findAll()
    }

    override fun getOne(id: Long): AuthorEntity? {
        return authorRepository.findById(id).get()
    }
}
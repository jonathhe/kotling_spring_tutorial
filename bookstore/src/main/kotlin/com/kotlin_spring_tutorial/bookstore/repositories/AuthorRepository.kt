package com.kotlin_spring_tutorial.bookstore.repositories

import com.kotlin_spring_tutorial.bookstore.domain.entnties.AuthorEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface AuthorRepository : JpaRepository<AuthorEntity, Long?>
package com.kotlin_spring_tutorial.bookstore

import com.kotlin_spring_tutorial.bookstore.domain.dto.AuthorDto
import com.kotlin_spring_tutorial.bookstore.domain.entnties.AuthorEntity

fun testAuthorDtoA(id: Long? = null) = AuthorDto(
        id = id,
        name = "John Doe",
        age = 30,
        image = "author-image.jpeg",
        description = "Some description"
    )

fun testAuthorEntityA(id: Long? = null) = AuthorEntity(
    id = id,
    name = "John Doe",
    age = 30,
    image = "author-image.jpeg",
    description = "Some description"
)
package com.kotlin_spring_tutorial.bookstore

import com.kotlin_spring_tutorial.bookstore.domain.dto.AuthorDto
import com.kotlin_spring_tutorial.bookstore.domain.entnties.AuthorEntity

fun AuthorEntity.toAuthorDto() = AuthorDto(
        id=this.id,
        name=this.name,
        age=this.age,
        description=this.description,
        image=this.image
    )

fun AuthorDto.toAuthorEntity() = AuthorEntity(
    id=this.id,
    name=this.name,
    age=this.age,
    description=this.description,
    image=this.image
)
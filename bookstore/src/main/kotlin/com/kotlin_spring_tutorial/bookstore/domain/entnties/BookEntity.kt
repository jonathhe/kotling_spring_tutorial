package com.kotlin_spring_tutorial.bookstore.domain.entnties

import jakarta.persistence.CascadeType
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne

@Entity
data class BookEntity(
    @Id
    @Column(name="isbn")
    val isbn: String,

    @Column(name="title")
    val title: String,

    @Column(name="description")
    val description: String,

    @Column(name="image")
    val image: String,

    @ManyToOne(cascade = [CascadeType.DETACH])
    @JoinColumn(name="author_id")
    val authorEntity: AuthorEntity
)
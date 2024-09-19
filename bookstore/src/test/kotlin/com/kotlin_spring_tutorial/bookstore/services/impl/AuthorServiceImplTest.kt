package com.kotlin_spring_tutorial.bookstore.services.impl

import com.kotlin_spring_tutorial.bookstore.domain.entnties.AuthorEntity
import com.kotlin_spring_tutorial.bookstore.repositories.AuthorRepository
import com.kotlin_spring_tutorial.bookstore.testAuthorEntityA
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.data.repository.findByIdOrNull

@SpringBootTest
class AuthorServiceImplTest @Autowired constructor (
    private val underTest: AuthorServiceImpl,
    private val authorRepository: AuthorRepository
    ) {

    @Test
    fun `test that save persists the Author in the database`(){
        val savedAuthor = underTest.save(testAuthorEntityA())
        assertThat(savedAuthor.id).isNotNull()

        val recalledAuthor = authorRepository.findByIdOrNull(savedAuthor.id!!)
        assertThat(recalledAuthor).isNotNull()
        assertThat(recalledAuthor!!).isEqualTo(testAuthorEntityA(id=savedAuthor.id))
    }

    @Test
    fun `test that list returns empty list when there are noe authors in the database`(){
        val result = underTest.list()
        assertThat(result).isEmpty()
    }

    @Test
    fun `test that list returns authors when there are authors in the database`(){
        val savedAuthor = authorRepository.save(testAuthorEntityA())
        val expected = listOf(savedAuthor)
        val result = underTest.list()
        assertThat(result).isEqualTo(expected)
    }

}
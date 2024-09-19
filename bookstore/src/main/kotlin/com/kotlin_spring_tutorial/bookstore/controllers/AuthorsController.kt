package com.kotlin_spring_tutorial.bookstore.controllers

import com.kotlin_spring_tutorial.bookstore.domain.dto.AuthorDto
import com.kotlin_spring_tutorial.bookstore.services.AuthorService
import com.kotlin_spring_tutorial.bookstore.toAuthorDto
import com.kotlin_spring_tutorial.bookstore.toAuthorEntity
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(path = ["/v1/authors"])
class AuthorsController(private val authorService: AuthorService) {

    @PostMapping
    fun createAuthor (@RequestBody authorDto: AuthorDto): ResponseEntity<AuthorDto>{
        val createdAuthor = authorService.save(
            authorDto.toAuthorEntity()
        ).toAuthorDto()
        return ResponseEntity(createdAuthor, HttpStatus.CREATED)
    }

    @GetMapping
    fun readManyAuthors(): ResponseEntity<List<AuthorDto>>{
        val authorList = authorService.list().map { it.toAuthorDto() }
        return ResponseEntity(authorList, HttpStatus.OK)

    }

//    @GetMapping(params = ["id"])
//    fun readOneAuthors(@ParameterName id: Long): ResponseEntity<AuthorDto>{
//        val authorList = authorService.getOne(id)
//        if(authorList == null ) return ResponseEntity(authorList.toAuthorDto(), HttpStatus.OK)
//
//
//
//    }

}
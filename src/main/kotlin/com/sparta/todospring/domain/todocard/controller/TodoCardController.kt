package com.sparta.todospring.domain.todocard.controller

import com.sparta.todospring.domain.todocard.dto.TodoCardRequest
import com.sparta.todospring.domain.todocard.dto.TodoCardResponse
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RequestMapping("/todo-card")
@RestController
class TodoCardController {

    @PostMapping
    fun createTodoCard(@RequestBody todoCardRequest: TodoCardRequest): ResponseEntity<TodoCardResponse> {
        TODO("not implemented")
    }
    @GetMapping()
    fun getTodoCardList(): ResponseEntity<List<TodoCardResponse>> {
        TODO("not implemented")
    }

    @GetMapping("/{todoCardId}")
    fun getTodoCard(@PathVariable todoCardId: Long): ResponseEntity<TodoCardResponse> {
        TODO("not implemented")
    }

    @PutMapping("/{todoCardId}")
    fun updateTodoCard(
        @PathVariable todoCardId: Long,
        @RequestBody todoCardRequest: TodoCardRequest
    ){
        TODO("not implemented")
    }

    @DeleteMapping("/{todoCardId}")
    fun deleteCourse(
        @PathVariable todoCardId: Long
    ){
        TODO("not implemented")
    }


}
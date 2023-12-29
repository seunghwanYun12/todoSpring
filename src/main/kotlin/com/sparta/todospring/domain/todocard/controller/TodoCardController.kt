package com.sparta.todospring.domain.todocard.controller

import com.sparta.todospring.domain.todocard.dto.CreateTodoCardRequest
import com.sparta.todospring.domain.todocard.dto.UpdateTodoCardRequest
import com.sparta.todospring.domain.todocard.dto.TodoCardResponse
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RequestMapping("/todo-card")
@RestController
class TodoCardController {

    @PostMapping
    fun createTodoCard(@RequestBody createTodoCardRequest: CreateTodoCardRequest): ResponseEntity<TodoCardResponse> {
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
        @RequestBody updateTodoCardRequest: UpdateTodoCardRequest
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
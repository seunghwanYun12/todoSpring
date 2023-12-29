package com.sparta.todospring.domain.todocard.controller

import com.sparta.todospring.domain.todocard.dto.CreateTodoCardRequest
import com.sparta.todospring.domain.todocard.dto.UpdateTodoCardRequest
import com.sparta.todospring.domain.todocard.dto.TodoCardResponse
import com.sparta.todospring.domain.todocard.service.TodoCardService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RequestMapping("/todo-card")
@RestController
class TodoCardController(
    private val todoCardService: TodoCardService
) {

    @GetMapping()
    fun getTodoCardList(): ResponseEntity<List<TodoCardResponse>> {
        return ResponseEntity
            .status(HttpStatus.OK)
            .body(todoCardService.getAllTodoCardList())
    }

    @GetMapping("/{todoCardId}")
    fun getTodoCard(@PathVariable todoCardId: Long): ResponseEntity<TodoCardResponse> {
        return ResponseEntity
            .status(HttpStatus.OK)
            .body(todoCardService.getTodoCardById(todoCardId))
    }

    @PostMapping
    fun createTodoCard(@RequestBody createTodoCardRequest: CreateTodoCardRequest): ResponseEntity<TodoCardResponse> {
        return ResponseEntity
            .status(HttpStatus.CREATED)
            .body(todoCardService.createTodoCard(createTodoCardRequest))
    }

    @PutMapping("/{todoCardId}")
    fun updateTodoCard(
        @PathVariable todoCardId: Long,
        @RequestBody updateTodoCardRequest: UpdateTodoCardRequest
    ): ResponseEntity<TodoCardResponse> {
        return ResponseEntity
            .status(HttpStatus.OK)
            .body(todoCardService.updateTodoCard(todoCardId, updateTodoCardRequest))
    }

    @DeleteMapping("/{todoCardId}")
    fun deleteCourse(
        @PathVariable todoCardId: Long
    ): ResponseEntity<Unit> {
        todoCardService.deleteTodoCard(todoCardId)
        return ResponseEntity
            .status(HttpStatus.NO_CONTENT)
            .build()
    }

}
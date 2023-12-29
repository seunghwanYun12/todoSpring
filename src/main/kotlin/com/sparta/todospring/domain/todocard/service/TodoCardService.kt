package com.sparta.todospring.domain.todocard.service

import com.sparta.todospring.domain.todocard.dto.UpdateTodoCardRequest
import com.sparta.todospring.domain.todocard.dto.TodoCardResponse

interface TodoCardService {

    fun getAllTodoCardList(): List<TodoCardResponse>

    fun getTodoCardById(todoCardId: Long): TodoCardResponse

    fun createTodoCard(request: UpdateTodoCardRequest): TodoCardResponse

    fun updateTodoCard(todoCardId: Long, request: UpdateTodoCardRequest): TodoCardResponse

    fun deleteTodoCard(todoCardId: Long)

}
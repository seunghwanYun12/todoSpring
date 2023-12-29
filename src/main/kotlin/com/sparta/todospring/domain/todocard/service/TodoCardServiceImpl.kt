package com.sparta.todospring.domain.todocard.service

import com.sparta.todospring.domain.todocard.dto.CreateTodoCardRequest
import com.sparta.todospring.domain.todocard.dto.TodoCardResponse
import com.sparta.todospring.domain.todocard.dto.UpdateTodoCardRequest
import org.springframework.stereotype.Service

@Service
class TodoCardServiceImpl : TodoCardService {
    override fun getAllTodoCardList(): List<TodoCardResponse> {
        TODO("Not yet implemented")
    }

    override fun getTodoCardById(todoCardId: Long): TodoCardResponse {
        TODO("Not yet implemented")
    }

    override fun createTodoCard(request: CreateTodoCardRequest): TodoCardResponse {
        TODO("Not yet implemented")
    }

    override fun updateTodoCard(todoCardId: Long, request: UpdateTodoCardRequest): TodoCardResponse {
        TODO("Not yet implemented")
    }

    override fun deleteTodoCard(todoCardId: Long) {
        TODO("Not yet implemented")
    }

}
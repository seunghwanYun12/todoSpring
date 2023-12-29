package com.sparta.todospring.domain.todocard.dto

data class UpdateTodoCardRequest(
    var title:String,
    var content:String?,
    var author:String
)

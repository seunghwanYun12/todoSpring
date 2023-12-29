package com.sparta.todospring.domain.todocard.dto

import java.time.LocalDateTime

data class TodoCardRequest(
    var title:String,
    var content:String?,
    var author:String
)

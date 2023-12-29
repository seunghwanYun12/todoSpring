package com.sparta.todospring.domain.todocard.dto

import java.time.LocalDateTime

data class TodoCardResponse(
    val id: Long,
    var title:String,
    var content:String?,
    var author:String,
    var createDate:LocalDateTime
)

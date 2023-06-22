package com.felixwinston.mysimplecleanarchitecture.domain

interface IMessageRepository {
    fun getWelcomeMessage(message : String) : MessageEntity
}
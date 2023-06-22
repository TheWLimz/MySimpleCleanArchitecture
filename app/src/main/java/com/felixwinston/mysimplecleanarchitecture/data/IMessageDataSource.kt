package com.felixwinston.mysimplecleanarchitecture.data

import com.felixwinston.mysimplecleanarchitecture.domain.MessageEntity

interface IMessageDataSource {

    fun getMessageFromSource(name : String) : MessageEntity
}
package com.felixwinston.mysimplecleanarchitecture.data

import com.felixwinston.mysimplecleanarchitecture.domain.MessageEntity

class MessageDataSource : IMessageDataSource {
    override fun getMessageFromSource(name: String): MessageEntity {
        return MessageEntity("Hello $name welcome to Medan City, Indonesia")
    }

}
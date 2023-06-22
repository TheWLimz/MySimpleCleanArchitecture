package com.felixwinston.mysimplecleanarchitecture.di

import com.felixwinston.mysimplecleanarchitecture.data.MessageDataSource
import com.felixwinston.mysimplecleanarchitecture.data.MessageRepository
import com.felixwinston.mysimplecleanarchitecture.domain.MessageInteractor
import com.felixwinston.mysimplecleanarchitecture.domain.MessageUseCase

object Injection {

    fun provideUseCase() : MessageUseCase{
        val messageRepository = provideRepository()
        return MessageInteractor(messageRepository)
    }

    private fun provideRepository() : MessageRepository{
        val messageDataSource = provideDataSource()
        return MessageRepository(messageDataSource)

    }

    private fun provideDataSource() : MessageDataSource = MessageDataSource()

}
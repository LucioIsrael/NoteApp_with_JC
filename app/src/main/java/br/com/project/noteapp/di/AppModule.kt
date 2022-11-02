package br.com.project.noteapp.di

import android.app.Application
import androidx.room.Room
import br.com.project.noteapp.note.data.dataSource.NoteDatabase
import br.com.project.noteapp.note.data.repository.NoteRepositoryImpl
import br.com.project.noteapp.note.domain.repository.NoteRepository
import br.com.project.noteapp.note.domain.useCase.DeleteNote
import br.com.project.noteapp.note.domain.useCase.LoadNotes
import br.com.project.noteapp.note.domain.useCase.NoteUseCases
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideNoteDatabase(app: Application): NoteDatabase {
        return Room.databaseBuilder(
            app,
            NoteDatabase::class.java,
            NoteDatabase.DATABASE_NAME
        ).build()
    }

    @Provides
    @Singleton
    fun provideNoteRepository(db: NoteDatabase): NoteRepository {
        return NoteRepositoryImpl(db.noteDao)
    }

    @Provides
    @Singleton
    fun provideNoteUseCases(repository: NoteRepository): NoteUseCases {
        return NoteUseCases(
            loadNotes = LoadNotes(repository),
            deleteNote = DeleteNote(repository)
        )
    }
}
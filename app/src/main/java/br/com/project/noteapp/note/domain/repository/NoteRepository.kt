package br.com.project.noteapp.note.domain.repository

import br.com.project.noteapp.note.domain.model.Note
import kotlinx.coroutines.flow.Flow

interface NoteRepository {

    fun loadAllNotes(): Flow<List<Note>>

    suspend fun loadNoteById(id: Int): Note?

    suspend fun insertNote(note: Note)

    suspend fun deleteNote(note:Note)
}

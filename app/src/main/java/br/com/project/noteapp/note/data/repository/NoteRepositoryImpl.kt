package br.com.project.noteapp.note.data.repository

import br.com.project.noteapp.note.data.dataSource.NoteDao
import br.com.project.noteapp.note.domain.model.Note
import br.com.project.noteapp.note.domain.repository.NoteRepository
import kotlinx.coroutines.flow.Flow

class NoteRepositoryImpl(
    private val dao: NoteDao,
) : NoteRepository {
    override fun loadAllNotes(): Flow<List<Note>> {
        return dao.loadAllNotes()
    }

    override suspend fun loadNoteById(id: Int): Note? {
        return dao.loadNoteById(id)
    }

    override suspend fun insertNote(note: Note) {
        dao.insertNote(note)
    }

    override suspend fun deleteNote(note: Note) {
        dao.deleteNote(note)
    }
}
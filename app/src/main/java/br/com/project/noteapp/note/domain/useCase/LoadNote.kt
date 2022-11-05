package br.com.project.noteapp.note.domain.useCase

import br.com.project.noteapp.note.domain.model.Note
import br.com.project.noteapp.note.domain.repository.NoteRepository

class LoadNote(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(id: Int): Note? {
        return repository.loadNoteById(id)
    }
}
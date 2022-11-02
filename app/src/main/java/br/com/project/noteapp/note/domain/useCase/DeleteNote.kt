package br.com.project.noteapp.note.domain.useCase

import br.com.project.noteapp.note.domain.model.Note
import br.com.project.noteapp.note.domain.repository.NoteRepository

class DeleteNote(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(note: Note) {
        repository.deleteNote(note)
    }
}
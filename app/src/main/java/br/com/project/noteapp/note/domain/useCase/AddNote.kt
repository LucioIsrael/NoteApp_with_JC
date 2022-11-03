package br.com.project.noteapp.note.domain.useCase

import br.com.project.noteapp.note.domain.model.InvalidNoteException
import br.com.project.noteapp.note.domain.model.Note
import br.com.project.noteapp.note.domain.repository.NoteRepository

class AddNote(
    private val repository: NoteRepository
) {

    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note) {
        if (note.titulo.isBlank()) {
            throw InvalidNoteException("O titulo da nota está vazia")
        }
        if (note.conteudo.isBlank()) {
            throw InvalidNoteException("O conteúdo da nota está vazia")
        }
        repository.insertNote(note)
    }
}
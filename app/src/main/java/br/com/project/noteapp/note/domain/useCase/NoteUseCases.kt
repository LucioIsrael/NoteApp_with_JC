package br.com.project.noteapp.note.domain.useCase

data class NoteUseCases(
    val loadNotes: LoadNotes,
    val deleteNote: DeleteNote,
    val addNote: AddNote,
    val loadNote: LoadNote
)

package br.com.project.noteapp.note.presentation.notes

import br.com.project.noteapp.note.domain.model.Note
import br.com.project.noteapp.note.domain.util.NoteOrder

sealed class NotesEvent {
    data class Order(val noteOrder: NoteOrder): NotesEvent()
    data class DeleteNote(val note: Note): NotesEvent()
    object RestoreNote: NotesEvent()
    object ToggleOrderSection: NotesEvent()
}

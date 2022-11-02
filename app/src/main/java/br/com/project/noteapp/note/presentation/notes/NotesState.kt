package br.com.project.noteapp.note.presentation.notes

import br.com.project.noteapp.note.domain.model.Note
import br.com.project.noteapp.note.domain.util.NoteOrder
import br.com.project.noteapp.note.domain.util.OrderType

data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)

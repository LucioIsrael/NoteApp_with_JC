package br.com.project.noteapp.note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import br.com.project.noteapp.ui.theme.Green
import br.com.project.noteapp.ui.theme.Red
import br.com.project.noteapp.ui.theme.Yellow

@Entity
data class Note(
    val titulo: String,
    val conteudo: String,
    val timestamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null
) {
    companion object {
        val noteColors = listOf(Red, Yellow, Green)
    }
}

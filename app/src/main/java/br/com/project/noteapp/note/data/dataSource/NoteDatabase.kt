package br.com.project.noteapp.note.data.dataSource

import androidx.room.Database
import androidx.room.RoomDatabase
import br.com.project.noteapp.note.domain.model.Note

@Database(
    entities = [Note::class],
    version = 1
)
abstract class NoteDatabase: RoomDatabase() {

    abstract val noteDao: NoteDao

    companion object {
        const val DATABASE_NAME = "note_db"
    }
}

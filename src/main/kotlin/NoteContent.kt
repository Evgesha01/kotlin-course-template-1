

import java.nio.file.Path

sealed class NoteContent {
    data class Text(var strings: List<String>) : NoteContent()
    data class Image(var imagePath: Path) : NoteContent()
    data class ToDoList(var toDoItemList : List<ToDoListItem>) : NoteContent()
}
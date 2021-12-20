import java.nio.file.Path

sealed class NoteContent {
    data class Text(val strings: List<String>) : NoteContent()
    data class Image(val imagePath: Path) : NoteContent()
    data class ToDoList(val toDoItemList : List<ToDoListItem>) : NoteContent()
}
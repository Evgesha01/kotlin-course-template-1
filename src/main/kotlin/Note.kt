import java.nio.file.Path

data class Note (val title: String, val color: Color, val content: NoteContent)

fun main() {
    val firstNote = Note("first", Color.RED, NoteContent.Text(listOf("firstString", "secondString")))
    val secondNote = Note("second", Color.BLUE, NoteContent.Image(Path.of("var2", "second")))
    val thirdNote = Note("third",
        Color.GRAY, NoteContent.ToDoList(listOf(ToDoListItem(true, "firstTask"), ToDoListItem(false, "secondTask"))))
    val fourthNote = Note("fourth", Color.GREEN, NoteContent.ToDoList(listOf(ToDoListItem(true,"firstTask"), ToDoListItem(false, "secondTask"))))

    val notes: List<Note> = listOf(firstNote, secondNote, thirdNote, fourthNote)

    println(notes)
}

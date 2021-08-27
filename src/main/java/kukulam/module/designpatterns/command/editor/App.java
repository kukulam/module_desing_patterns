package kukulam.module.designpatterns.command.editor;

public class App {
    public static void main(String[] args) {
        TextArea textArea = new TextArea();
        Editor editor = new Editor(textArea);

        InsertCommand typeFirstSentence = new InsertCommand(editor, "May the force be with you");
        InsertCommand typeSecondSentence = new InsertCommand(editor, "or not");
        PrintCommand printTypedText = new PrintCommand(editor);
        PrintCommandHistory printCommandHistory = new PrintCommandHistory(editor);

        editor.execute(typeFirstSentence);
        editor.execute(typeSecondSentence);
        editor.execute(printTypedText);
        editor.execute(printCommandHistory);
    }
}

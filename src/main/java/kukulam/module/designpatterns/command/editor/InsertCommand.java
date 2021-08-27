package kukulam.module.designpatterns.command.editor;

public class InsertCommand implements Command {
    private final TextArea textArea;
    private final String text;

    public InsertCommand(Editor editor, String text) {
        this.textArea = editor.getTextArea();
        this.text = text;
    }

    @Override
    public void execute() {
        String updatedText = textArea.getText() + text;
        textArea.setText(updatedText);
    }

    @Override
    public String toString() {
        return "Insert: " + text;
    }
}

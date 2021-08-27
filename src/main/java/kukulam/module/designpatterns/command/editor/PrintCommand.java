package kukulam.module.designpatterns.command.editor;

public class PrintCommand implements Command {
    private final TextArea textArea;

    public PrintCommand(Editor editor) {
        this.textArea = editor.getTextArea();
    }

    @Override
    public void execute() {
        System.out.println("Text area:");
        System.out.println(textArea.getText());
        System.out.println();
    }

    @Override
    public String toString() {
        return "Printing text area";
    }
}

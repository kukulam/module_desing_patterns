package kukulam.module.designpatterns.command.editor;

import java.util.LinkedList;
import java.util.List;

public class Editor {
    private final List<Command> commandHistory = new LinkedList<>();
    private final TextArea textArea;

    public Editor(TextArea textArea) {
        this.textArea = textArea;
    }

    void execute(Command command) {
        commandHistory.add(command);
        command.execute();
    }

    List<Command> getCommandHistory() {
        return commandHistory;
    }

    TextArea getTextArea() {
        return textArea;
    }
}

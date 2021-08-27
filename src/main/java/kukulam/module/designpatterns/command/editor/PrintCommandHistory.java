package kukulam.module.designpatterns.command.editor;

import java.util.List;

public class PrintCommandHistory implements Command {
    private final List<Command> history;

    public PrintCommandHistory(Editor editor) {
        this.history = editor.getCommandHistory();
    }

    @Override
    public void execute() {
        System.out.println("Command history:");
        history.forEach(System.out::println);
    }

    @Override
    public String toString() {
        return "Printing command history";
    }
}

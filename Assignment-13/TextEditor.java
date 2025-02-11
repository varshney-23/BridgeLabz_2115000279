class TextState {
    String content;
    TextState prev, next;

    public TextState(String content) {
        this.content = content;
        this.prev = this.next = null;
    }
}

class TextEditor {
    private TextState current;

    public void addState(String content) {
        TextState newState = new TextState(content);
        if (current != null) {
            newState.prev = current;
            current.next = newState;
        }
        current = newState;
    }

    public void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
            System.out.println("Undo: " + current.content);
        }
    }

    public void redo() {
        if (current != null && current.next != null) {
            current = current.next;
            System.out.println("Redo: " + current.content);
        }
    }

    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        editor.addState("Hello Guyss");
        editor.addState("Hello Guyss Channel to my Welcome.");
        editor.undo();
        editor.redo();
    }
}

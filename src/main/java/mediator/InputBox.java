package mediator;

public class InputBox {

    private String name;
    private String value;

    public InputBox(String name) {

        this.name = name;
    }

    public void setValue(String text) {
        this.value = text;
    }

    public String getValue() {
        return value;
    }
}

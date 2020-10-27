package mediator;

public class ErrorBox {
    private String name;
    private boolean visible;

    public ErrorBox(String name) {
        this.name = name;
    }

    public void display(String message) {
        visible = true;
        System.out.println(message);
    }

    public void hide() {
        visible = false;
    }
}

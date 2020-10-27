package mediator;

import java.util.function.Consumer;

public class Button {

    private String name;
    private Runnable clickHandler;

    public Button(String name) {

        this.name = name;
    }

    public void onClick(Runnable o) {
        this.clickHandler = o;
    }

    public void click() {
        clickHandler.run();
    }
}

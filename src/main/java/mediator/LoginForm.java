package mediator;

public class LoginForm {

    private InputBox usernameInput = new InputBox("username");
    private InputBox passwordInput = new InputBox("password");
    private ErrorBox errorBox = new ErrorBox("errorBox");
    private Button loginButton = new Button("loginButton");

    public LoginForm() {
        loginButton.onClick(()->handleSubmit());
    }

    private void handleSubmit() {
        if ( !validate() ) {
            errorBox.display("Girilen bilgileri kontrol ediniz!");
        } else {
            System.out.println("Form Submitted!!!");
        }
    }

    private boolean validate() {
        return usernameInput.getValue().equalsIgnoreCase("johndoe")
                && passwordInput.getValue().equalsIgnoreCase("1q2w3e4r");
    }

    public static void main(String[] args) {
        var form = new LoginForm();
        form.type("johndoe", form.usernameInput);
        form.type("1q2w3e4r", form.passwordInput);
        form.click(form.loginButton);

        form.type("marydoe", form.usernameInput);
        form.type("1q2w3e4r", form.passwordInput);
        form.click(form.loginButton);
    }

    private void click(Button button) {
        System.out.println("Button Clicked");
        button.click();
    }

    private void type(String text, InputBox usernameInput) {
        System.out.println("Text Typed ->"+text);
        usernameInput.setValue(text);
    }
}

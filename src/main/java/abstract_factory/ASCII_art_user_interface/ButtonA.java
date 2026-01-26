package abstract_factory.ASCII_art_user_interface;

public class ButtonA extends Button {

    public ButtonA(String text) {
        this.text = text;
    }

    public void display() {
        System.out.println(text);
    }
}

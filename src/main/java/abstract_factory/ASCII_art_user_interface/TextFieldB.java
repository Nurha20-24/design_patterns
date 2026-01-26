package abstract_factory.ASCII_art_user_interface;

public class TextFieldB extends TextField{

    public TextFieldB(String text) {
        this.text = text;
    }

    public void display() {
        System.out.println(text);
    }
}

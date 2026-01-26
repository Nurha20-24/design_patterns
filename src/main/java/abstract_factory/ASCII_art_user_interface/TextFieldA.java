package abstract_factory.ASCII_art_user_interface;

public class TextFieldA extends TextField{

    public TextFieldA(String text) {
        this.text = text;
    }

    public void display() {
        System.out.println(text);
    }
}

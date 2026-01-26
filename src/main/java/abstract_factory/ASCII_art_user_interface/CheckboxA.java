package abstract_factory.ASCII_art_user_interface;

public class CheckboxA extends Checkbox {

    public CheckboxA(String text) {
        this.text = text;
    }

    public void display() {
        System.out.println(text);
    }
}

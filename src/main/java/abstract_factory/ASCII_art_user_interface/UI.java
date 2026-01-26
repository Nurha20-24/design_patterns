package abstract_factory.ASCII_art_user_interface;

public class UI{
    public static void main(String[] args) {

        UIFactory factory = new AFactory();

        TextField textField = factory.createTextField("[some text]");
        Checkbox checkbox = factory.createCheckbox("[✗] ");
        Button button = factory.createButton("( OK )");

        button.display();
        textField.display();
        checkbox.display();

        System.out.println("---- Changed default text");

        checkbox.setText("[✘]");
        button.setText("( Submit )");
        textField.setText("[more text...]");

        button.display();
        textField.display();
        checkbox.display();
    }
}

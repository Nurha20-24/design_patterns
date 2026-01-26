package abstract_factory.ASCII_art_user_interface;


public abstract class UIFactory {

    public abstract Button createButton(String text);

    public abstract Checkbox createCheckbox(String text);

    public abstract TextField createTextField(String text);
}


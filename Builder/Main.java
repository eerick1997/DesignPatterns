import button.Button;
import button.PrimaryButton;
import button.SecondaryButton;

public class Main {
    public static void main(String[] args) {
        final Button primaryButton = new PrimaryButton.Builder("Clicked")
                .setHeight(4)
                .setWidth(10)
                .setText("Button")
                .build();

        final Button secondaryButton = new SecondaryButton.Builder()
                .setHeight(4)
                .setWidth(10)
                .setText("Button")
                .build();

        primaryButton.render();
        primaryButton.onClick();

        secondaryButton.render();
        secondaryButton.onClick();
    }
}

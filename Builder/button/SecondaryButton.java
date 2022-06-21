package button;

public class SecondaryButton extends Button {

    private SecondaryButton(ButtonBuilder builder) {
        super(builder);
    }

    @Override
    public void render() {
        for (int i = 0; i < width; i++)
            System.out.print("~");

        for (int i = 0; i < height; i++) {
            if (i == height / 2)
                System.out.println(text);
            else
                System.out.println();
        }

        for (int i = 0; i < width; i++)
            System.out.print("~");
        System.out.println();
    }

    @Override
    public void onClick() {
        System.out.println("Secondary Button: " + action);
    }

    public static class Builder extends ButtonBuilder {

        @Override
        public Button build() {
            return new SecondaryButton(this);
        }
    }
}

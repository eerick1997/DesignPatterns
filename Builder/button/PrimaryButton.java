package button;

public class PrimaryButton extends Button {

    private PrimaryButton(ButtonBuilder builder) {
        super(builder);
    }

    @Override
    public void render() {
        for (int i = 0; i < width; i++)
            System.out.print("-");

        for (int i = 0; i < height; i++) {
            if (i == height / 2)
                System.out.println(text);
            else
                System.out.println();
        }

        for (int i = 0; i < width; i++)
            System.out.print("-");
        System.out.println();
    }

    @Override
    public void onClick() {
        System.out.println("PrimaryButton: " + action);
    }

    public static class Builder extends ButtonBuilder {
        public Builder(String action) {
            this.action = action;
        }

        @Override
        public Button build() {
            return new PrimaryButton(this);
        }
    }
}

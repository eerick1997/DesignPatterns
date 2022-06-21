package button;

public abstract class ButtonBuilder {
    protected int height;
    protected int width;
    protected String text;
    protected Color backgroundColor;
    protected Color textColor;
    protected String action;
    public ButtonBuilder setHeight(final int height) {
        this.height = height;
        return this;
    }

    public ButtonBuilder setWidth(final int width) {
        this.width = width;
        return this;
    }
    public ButtonBuilder setText(final String text) {
        this.text = text;
        return this;
    }
    public ButtonBuilder setBackgroundColor(final Color backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }
    public ButtonBuilder setTextColor(final Color textColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }
    public ButtonBuilder setAction(final String action) {
        this.action = action;
        return this;
    }
    public abstract Button build();
}

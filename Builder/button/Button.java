package button;

abstract public class Button {
    protected int height;
    protected int width;
    protected String text;
    protected Color backgroundColor;
    protected Color textColor;
    protected String action;
    Button(ButtonBuilder builder) {
        this.height = builder.height;
        this.width = builder.width;
        this.text = builder.text;
        this.backgroundColor = builder.backgroundColor;
        this.textColor = builder.textColor;
        this.action = builder.action;
    }
    public abstract void render();
    public abstract void onClick();
}

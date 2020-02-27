package Week1.Classes;

public class Rectangle {
    private int height;
    private int width;
    private String color;

    public Rectangle(int width, int height, String color) {
        setWidth(width);
        setHeight(height);
        setColor(color);
    }

    public Rectangle(int width, int height) {
        setWidth(width);
        setHeight(height);
        this.color = "Blue";
    }
    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }
    public String getColor() {
        return color;
    }

    public void setWidth(int width) {
        if (width > 1) {
            this.width = width;
        } else {
            this.width = 1;
        }
    }
    public void setHeight(int height) {
        if (height > 1) {
            this.height = height;
        } else {
            this.height = 1;
        }
    }
    public void setColor(String color) {
        if (Character.isUpperCase(color.charAt(0)) && color.length() > 2) {
            this.color = color;
        } else {
            this.color = "Blue";
        }
    }
    public void draw() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(color.charAt(0));
            }
            System.out.print("\n");
        }
    }
}

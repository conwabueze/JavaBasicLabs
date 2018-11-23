public class Color {
    private  int red;
    private int green;
    private int blue;
    private String name;

    public Color(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
        this.name = null;
    }

    public Color(int red, int green, int blue, String name) {
        this.red = red;
        this.green = green;
        this.blue = blue;
        this.name = name;
    }

    public int getRed() {
        return red;
    }

    public int getGreen() {
        return green;
    }

    public int getBlue() {
        return blue;
    }

    public String getName() {
        return name;
    }
}

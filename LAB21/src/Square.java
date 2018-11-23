import java.util.Date;

public class Square extends GeometricObject implements Colorable {
    @Override
    public void howToColor() {
        System.out.println("Yerrrrrr");
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public boolean isFilled() {
        return super.isFilled();
    }

    @Override
    public void setFilled(boolean filled) {
        super.setFilled(filled);
    }

    @Override
    public Date getDateCreated() {
        return super.getDateCreated();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }
}

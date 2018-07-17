package Rectangle;

public class BuilRectangle {
    int height;
    int width;

    public BuilRectangle() {
    }

    public BuilRectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getArea() {
        return this.height * this.width;
    }

    public int getPerimeter() {
        return (this.height + this.width) * 2;
    }

    public String display() {
        return "hinh chu nhat co chieu dai "+height+" chieu rong "+width+" co dien tich la : "+getArea()+" va chu vi la "+getPerimeter();

    }
}

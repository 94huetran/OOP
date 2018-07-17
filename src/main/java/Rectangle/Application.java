package Rectangle;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Nhap vao chieu dai cua hinh chu nhat: ");
        int height = scn.nextInt();
        System.out.println("Nhap vao chieu rong cua hinh chu nhat: ");
        int width = scn.nextInt();

        BuilRectangle builRectangle = new BuilRectangle(height,width);
        System.out.println(builRectangle.display());
    }
}

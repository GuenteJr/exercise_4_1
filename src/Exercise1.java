import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        RectangleArea rect = new RectangleArea();
        rect.getData();
        rect.fieldDisplay();
    }
}

class RectangleArea {
    private double length;
    private double width;

    public void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of rectangle: ");
        length = sc.nextDouble();
        System.out.print("Enter width of rectangle: ");
        width = sc.nextDouble();
    }

    public double computeField() {
        return length * width;
    }

    public void fieldDisplay() {
        System.out.println("Length = " + length);
        System.out.println("Width = " + width);
        System.out.println("Area = " + computeField());
    }
}
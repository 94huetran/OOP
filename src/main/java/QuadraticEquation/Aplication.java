package QuadraticEquation;

public class Aplication {
    public static void main(String[] args) {
        QuadraticEquation quadraticEquation = new QuadraticEquation(1, 2.0, 1);
        if (quadraticEquation.getDiscriminant() > 0) {
            System.out.println(quadraticEquation.getRoot1());
            System.out.println(quadraticEquation.getRoot2());
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println(quadraticEquation.getRoot1());
        } else {
            System.out.println("The equation has no roots.");
        }
    }

}

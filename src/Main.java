public class Main {
    public static void main(String[] args) {
        // Initializing object c1 with radius set as 10.
        Circle c1 = new Circle(10F);
        System.out.println("Area of c1 Circle = " + c1.area());

        // Initializing object c2 with radius set as 20.
        Circle c2 = new Circle(20F);
        System.out.println("Area of c2 Circle = " + c2.area());

        // Initializing object c3 with radius set as 15.
        Circle c3 = new Circle(15F);
        System.out.println("Area of c3 Circle = " + c3.area());
    }
}

/**
 * Stores the radius of the circle and calculates its area.
 */
class Circle {

    /**
     * Stores the radius of the circle.
     */
    public float radius;

    // Constructor
    public Circle(float radius) {
        // this.radius refers to the instance variable radius.
        this.radius = radius;
    }

    /**
     * Calculates the area of the circle.
     */
    public float area() {
        return 3.141F * radius * radius;
    }
}
public class quadrant_problem {
    public static void main(String[] args) {
        System.out.print(" entrer the x quadrant value:");
        int x = Integer.parseInt(System.console().readLine());// Read x input from the console
        System.out.print(" entrer the y quadrant value:");
        int y = Integer.parseInt(System.console().readLine());// Read y input from the console

        if (x > 0 && y > 0) {
            System.out.println("The point is in the first quadrant.");
        } else if (x < 0 && y > 0) {
            System.out.println("the point lie on the second quadrant.");
        } else if (x < 0 && y < 0) {
            System.out.println(" the point lie on the third quadrant.");
        } else {
            System.out.println(" the point lie on the fourth quadrant.");
        }
    }
}

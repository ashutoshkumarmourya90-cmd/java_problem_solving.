public class facorial_of_5 {
    public static void main(String[] arge) {
        int num = 5;
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println("factorial of 5 iss: " + fact);
    }
}

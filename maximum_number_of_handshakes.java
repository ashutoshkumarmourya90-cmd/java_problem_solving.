public class maximum_number_of_handshakes {
    public static void main(String[] args) {
        System.out.print("enter the n number of people ");
        int n = Integer.parseInt(System.console().readLine());
        int handshakes = (n * (n - 1)) / 2;
        System.out.println("The maximum number of handshakes is: " + handshakes);

    }

}

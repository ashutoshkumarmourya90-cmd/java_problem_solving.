/*public class GratestOfThreeNumber {
    public static void main(String[] args) {
        int num1 = 10, num2 = 20, num3 = 30;
        if (num1 > num2 && num1 > num3) {
            System.out.println("num1 is grastest");
        } else {
            if (num2 > num1 && num2 > num3) {
                System.out.println("num2is greatest");
            } else {
                System.out.println("num3 is grastest ");
            }
        }
    }
}*/
//anotherway to write the code is//

class GratestOfThreeNumber {
    public static void main(String[] srgs) {
        int num1 = 10, num2 = 20, num3 = 30;
        if (num1 == num2 && num1 == num3) {
            System.out.println("num1 num2 and num3 is equal");

        } else {
            int temp = Math.max(num2, num3);
            System.out.println("the gratest number is " + Math.max(num1, temp));
        }
    }
}
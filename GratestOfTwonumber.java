//using if_else find the grastest of two number 

/*public class GratestOfTwonumber {
    public static void main(String[] args) {
        int num1 = 50, num2 = 51;
        if (num1 > num2) {
            System.out.println("num1is grastest");
        } else {
            System.out.println("num2is grastest");
        }
    }
}*/
//another way to write the code is //
//usingUsing Ternary Operator//
/*class GratestOfTwonumber {
    public static void main(String[] args) {
        int num1 = 17, num2 = 198;
        if (num1 == num2) {
            System.out.println("num1 and num2 are equal");
        } else {
            int temp = num1 > num2 ? num1 : num2;
            System.out.println("The greatest number is: " + temp);
        }
    }
}*/
//another method using inbuilt max Function.

class GratestOfTwonumber {
    public static void main(String[] args) {
        int num1 = 18, num2 = 17;
        if (num1 == num2) {
            System.out.println("num1 and num2 are equal");
        } else {
            System.out.println(Math.max(num1, num2) + " is the greatest number");
        }
    }
}
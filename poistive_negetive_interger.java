class poistive_negetive_interger {
    public static void main(String[] args) {
        int num = 5;
        if (num > 0) {
            System.out.println("positive numbetr");
        } else if (num < 0) {
            System.out.println("negative number");
        } else {
            System.out.println("number is zero");
        }

    }
}
// another way to write this code is //
/*
 * class Test
 * {
 * public static void main(String[] args){
 * int num;
 * String result=
 * (num>0)?"positive number":(num<0)?"negetive number":"number is zero";
 * System.out.println(result);
 * }
 * }
 */
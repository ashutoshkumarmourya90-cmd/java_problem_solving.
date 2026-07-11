public class power_of_a_number_useing_recuersion {
    public static int power(int base, int exponent){
        if(exponent==0){
            return 1;
        }
        return base*power(base, exponent-1);
    }
    public static void main(String[] args){
        int base=7;
        int exponent=3;
        System.out.println(power(base, exponent));
    }
}
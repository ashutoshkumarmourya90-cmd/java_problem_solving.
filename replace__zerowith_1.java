public class replace__zerowith_1 {
    public static void main(String[] args){
        System.out.print("Enter the number with 0's = ");
        String num= System.console().readLine();
        for(int i=0; i<num.length();i++){
            if(num.charAt(i)=='0'){
                num= num.substring(0, i) + '1' + num.substring(i + 1);
            }

        }
        System.out.println("Number after replacing 0's with 1's = " + num);
    }
}
public class bintodec{
    public static void bindec(int binNum){
        int myNum = binNum;
        int pow = 0;
        int dec = 0;
        while(binNum>0){
        int lastDigit = binNum%10;
        dec = dec +(lastDigit*(int)Math.pow(2,pow));
        pow++;
        binNum /=10;
        }
        System.out.println("the decimal number of " + myNum + " is " + dec );


    }
    public static void main(String args[]){
        bindec(101010);

    }
}
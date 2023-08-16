public class test{
    public static void dectobin(int decNum){
        int myNum =decNum;
        int pow = 0;
        int binNum = 0;
        while(decNum>0){
            int remainder = decNum%2;
            binNum = binNum + (remainder*(int)(Math.pow(10,pow)));
            pow++;
            decNum /=2;
        }
        System.out.print("The binary number of decimalNumber of " + myNum + " is " + binNum );
    }
    public static void main(String args[]){
        dectobin(8);
    }
}
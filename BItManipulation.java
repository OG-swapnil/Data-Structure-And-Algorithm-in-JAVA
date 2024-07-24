
public class BItManipulation {
    public static void main(String[] args) {
        //Get  bit
        int n =4;
        // int pos=2;
        // int bitmask = 1<<pos;

        // if ((bitmask & n )== 0) {
        //     System.out.println("bit was zero"); 
        // }else{
        //     System.out.println("Bit was one");
        // }
        //Set bit
        // int Pos =2;
        // int BitMask = 1<<Pos;

        // int newnum = (BitMask) & n;
        // System.out.println(newnum);
        // Clear bit

        int Pos =2;
        int BitMask = 1<<Pos;

        int newnum = ~(BitMask) & n;
        System.out.println(newnum);

    }
    
}
 
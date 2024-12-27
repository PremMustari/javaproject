public class Operator {
    public static void main(String[] args) {
        //intial value
        int a = 5;
        int b = 7;
        //00000000 00000000 00000000 00000101--------5
        //00000000 00000000 00000000 00000111--------7
        //bitwise and
        //0101 & 0111 = 5
        System.out.println("a&b = "+(a & b));
        int c = 2;
        System.out.println(~c);
    }
}

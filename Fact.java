class Fact {
    static int factorial(int n)
    {
        int res = 1,i;
        for( i=1;i<=n;i++){
            res *= i;        
        }
        return res;

    }
public static void main(String[] args) {
    int n = 5;
    System.out.println(factorial(5));
}
    
}

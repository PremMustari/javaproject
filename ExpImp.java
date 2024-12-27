public class ExpImp {
    public static void main(String[] args){
        //imlpicit conversion
        //byte to int (widening conversion)
        byte byteValue = 10;
        int intValue = byteValue;
        System.out.println("Byte to int:"+intValue);
        
        //Expicit conversion
        double doubleValue = 9.87666666666666;
        float floatValue = (float) doubleValue;
        System.out.println("double to float :"+floatValue);

        //float to long 
        long longValue = (long)floatValue;
        System.out.println("float to long :"+longValue);
        
        //int to byte(narrowing conversion)
        int largeIntValue = 130;
        byte byteValue2 = (byte)largeIntValue; //implicit cast from int to byte
        System.out.println("int to byte :"+byteValue2); //data loss occurs
    }
}

public class BinaryOpExample2 {
    public static void main(String[] args) {

        byte myByte = 1;
        var myVar = +myByte;
        testVar(myVar);

        short short1 = 2;
        var short2 = short1 + myByte;
        testVar(short2);

        long long1 = 10;
        var long2 = long1 + 1.0;
        testVar(long2);
    }

    public static String testVar(Object var){
        String returnType  = "unknown type";
        if(var instanceof Byte){
            returnType = "is byte";
        }else if(var instanceof Short){
            returnType = "is short";}
        else if(var instanceof Character){
            returnType = "is char";
        }else if(var instanceof Integer){
            returnType = "is integer";
        }else if(var instanceof Long){
            returnType = "is long";
        }else if(var instanceof Double){
            returnType = "is double";
        }else if(var instanceof Float) {
            returnType = "is float";
        }
        System.out.println("result " + returnType);
        return returnType;
    }


}

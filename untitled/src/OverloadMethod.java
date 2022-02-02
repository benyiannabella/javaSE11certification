public class OverloadMethod {

    public static void main(String[] args) {
        OverloadMethod overloadMethod = new OverloadMethod();
        overloadMethod.bestMethod((byte)1);
        overloadMethod.bestMethod((short)1);
        overloadMethod.bestMethod('a');
        overloadMethod.bestMethod(1);
        overloadMethod.bestMethod(1L);
        overloadMethod.bestMethod(1F);
        overloadMethod.bestMethod(1D);
        overloadMethod.bestMethod(true);
        overloadMethod.bestMethod(Byte.valueOf((byte)1));

    }

    private void bestMethod(byte b){
        System.out.println("best method for byte");
    }
    private void bestMethod(char c){
        System.out.println("best method for char");
    }
    private void bestMethod(short s){
        System.out.println("best method for short");
    }
    private void bestMethod(int i){
        System.out.println("best method for int");
    }
    private void bestMethod(long l){
        System.out.println("best method for long");
    }
    private void bestMethod(float f){
        System.out.println("best method for float");
    }
    private void bestMethod(double d){
        System.out.println("best method for double");
    }
    private void bestMethod(boolean bool){
        System.out.println("best method for boolean");
    }
    private void bestMethod(Object o){
        System.out.println("best method for object");
    }
}

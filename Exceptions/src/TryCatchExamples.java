public class TryCatchExamples {

    public static void main(String[] args) {

        TryCatchExamples te= new TryCatchExamples();
        te.printThreeStatements("Before Try Block", 1);
        try {
            te.printThreeStatements("In Try Block", 0);
        } catch(Throwable t){
            t.printStackTrace(System.out);
            printErrorStructure(t);
        }
        te.printThreeStatements("After the Try/Catch", 0);
//        try {
//            System.out.println("Statement 1 just fine");
//            try {
//                System.out.println("Statement 2 caused an error : " + (2 / 0));
//            } catch(RuntimeException e){
//            }
//            System.out.println("Statement 3 just fine");
//        }
//        catch (Throwable t) {
//            t.printStackTrace(System.out);
//            printErrorStructure(t);
//        }
    }

    public static void printErrorStructure(Object o){
        Class parent = o.getClass();
        String prefix = "";
        System.out.println("Error caught was: ");
        do{
            System.out.println(prefix + " " + parent.getName());
            prefix+= "--";
            parent = parent.getSuperclass();
            if(parent == null ) break;
        }
        while (parent.getSuperclass() != null);
    }

    private void printThreeStatements(String section, int divisor) {
        System.out.println(section + ": Statement 1 is just fine");
        System.out.println(section + ": Statement 2 will cause the error " +
                (2 / divisor));
        System.out.println(section + ": Statement 3 is just fine");
    }
}

public class ForLoops3 {

    public static int interruptIt(int i) throws Exception {

        System.out.println(" interruptiT: i = " + i);
        if(i < 10) throw new Exception("Break it up");
        return i;
    }

    public static void main(String[] args) {

        int i = 0;

        try{
            System.out.println("---------Executing For Loop A-------------");
//            for(interruptIt(i); ++i < 10; i++){
//            for(i = 0; interruptIt(++i) < 10; i++){
            for(i = 0; ++i < 10; interruptIt(i++)){
                System.out.println("A for loop: i " + i);
            }
        } catch (Exception e){
            System.out.println(e + ": i = " + i);
        }
    }
}

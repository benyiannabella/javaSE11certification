public class PrintToString {

    public static void main(String[] args) {
        System.out.println(new Object(){
            public String toString(){
                return "I am an overridden toString method";
            }
        });
    }
}

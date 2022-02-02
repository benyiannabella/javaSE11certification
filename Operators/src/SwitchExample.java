public class SwitchExample {

    public static void main(String[] args) {


        byte[] bytes = new byte[]{106};

        for_loop:
        for(byte b : bytes){
            switch (10 * b) {

//                case 1000:
                case 1060:
                    System.out.println("1060");
                case 1070:
                    System.out.println("1070");
                case 1080:
                    System.out.println("up to 1080 case");
                default:
                    System.out.println("default case");
                    break;
                case 1090:
                    System.out.println("1090 case");
                    break;

            }
        }
    }
}

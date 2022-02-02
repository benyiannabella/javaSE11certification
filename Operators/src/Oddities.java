public class Oddities {
    public static void main(String[] args) {

        int num = 10;
        int result = 0;

        for(int i = 10; i<=20; i+=10 ){
            num = i;
//            result = --num - num--;
//            result = num-- - --num;
            result = num-- - num++ * --num;//10 - 9 * 9=10-81=-71
            System.out.println("i = " + i + ", num = " + num + ", result = " + result);
        }

        num=10;
        boolean isEqual= (num--)==(num+=1);
        System.out.println(isEqual + ", num = " + num);

        num=num-- + num;
        System.out.println(num);
    }
}

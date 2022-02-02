public class Test2 {
    static String var = "FRIENDS"; //Line n1

    public static void main(String[] args) {
//        int var = (var = Test.var.length()); //Line n2
//        System.out.println(var); //Line n3
//
//        switch("hello"){
//            default:
//                System.out.println("Not a valid score");
//            case "null":
//                System.out.println("Failed");
//                break;
//        }
//
////        var score = 30; // Line n1
////        var grade = 'F'; // Line n2
////        if (50 <= score < 60) // Line n3
////            grade = 'D';
////        else if (60 <= score < 70) // Line n4
////            grade = 'C';
////        else if (70 <= score < 80) // Line n5
////            grade = 'B';
////        else if (score >= 80)
////            grade = 'A';
//
//        do {
//            System.out.print("SLOW-");
//        } while (false);
//
//        System.out.println("DOWN");
//
//        var var = 0; //Line n1
//        var: for (; var < 3; var++) {  //Line n2
//            if (var % 2 == 0) {
//                continue var; //Line n3
//            }
//            var++; //Line n4
//        }
//        System.out.println(var);

//
//        int elements = 0;
//        Object [] arr = {"A", "E", "I", new Object(), "O", "U"}; //Line n1
//        for(var obj : arr) { //Line n2
//            if(obj instanceof String) {
////                continue;
//            } else {
//                break;
//            }
//            elements++; //Line n3
//        }
//        System.out.println("number" + elements); //Line n4

        var i = 1;
        var j = 5;
        var k = 0;
        A: while(true) {
            i++;
            B: while(true) {
                j--;
                C: while(true) {
                    k += i + j;
                    if(i == j)
                        break A;
                    else if (i > j)
                        continue A;
                    else
                        continue B;
                }
            }
        }
        System.out.println(k);

            var res = ""; //Line n1
            String [] arr = {"Dog", null, "Friendly"};
//            for(String s : arr) { //Line n2
//                res += String.join("-", s); //Line n3
//            }
            System.out.println(String.join("", arr)); //Line n4

        String test = "test";
        System.out.println(String.join("",test));

        boolean flag = false;
        do {
            if(flag = !flag) { //Line n1
                System.out.print(1); //Line n2
                continue; //Line n3
            }
            System.out.print(2); //Line n4
        } while(flag); //Line n5
    }
    }





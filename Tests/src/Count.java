

public class Count {
    public static void main(String[] args) {
        class A<T extends String> {

        }


        var var = 3;
//        String [][] arr = new String[--var][var++];
        String[][] arr = { { "7", "6", "5" },
                            { "4", "3" },
                            { "2", "1" } };
        for (int i = 0; i < arr.length; i++) { //Line n1
            for (int j = 0; j < arr[i].length; j++) { //Line n2
                switch (arr[i][j]) { //Line n3
                    case "2":
                    case "4":
                    case "6":
                        break; //Line n4
                    default:
                        continue; //Line n5
                }
                System.out.print(arr[i][j]); //Line n6
            }
        }
    }
}

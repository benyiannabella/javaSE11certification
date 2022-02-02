import java.util.Arrays;

public class TwoDimArrays {

    public static void main(String[] args) {

        int[][] twoDim = new int[2][2];

//        for(int row = 0; row < twoDim.length; row++){
//            System.out.println(Arrays.toString(twoDim[row]));
//        }
        twoDim[0][0] = 1;
        twoDim[0][1] = 3;
        twoDim[1][0] = 5;

//        for(int row = 0; row < twoDim.length; row++){
//            System.out.println(Arrays.toString(twoDim[row]));
//        }

        char[][] ticTacToe = new char[3][3]; // r1
        for(int row = 0; row < ticTacToe.length; row++){
            System.out.println(Arrays.toString(ticTacToe[row]));
        }

        ticTacToe[0][0] = 'X'; // r2
        ticTacToe[1][1] = 'X';
        ticTacToe[2][2] = 'X';
        System.out.println(ticTacToe.length + " in a row!");
//        ticTacToe[1][3] = 'X'; // r2
//        ticTacToe[2][2] = 'X';
//        ticTacToe[3][1] = 'X';
//        System.out.println(ticTacToe.length + " in a row!"); // r3
    }
}

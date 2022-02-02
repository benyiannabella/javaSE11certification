public class Airplane {
    static int start = 2;
    final int end;

    public Airplane(int x) {
        x = 4;
        end = x;
    }

    public void fly(int distance) {
        System.out.print(end - start + " ");
        System.out.print(distance);
    }

    public static void main(String... start) {

            int secret = 0;
            for (int i = 0; i < 10; i++)
                while (i < 10)
                    if (i == 5) System.out.println("if");
                    else {
                        System.out.println("in");
                        System.out.println("else");
                    }
            switch (secret) {
                case 0:
                    System.out.println("zero");
            }
    }
}
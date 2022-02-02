public class ForLoops2 {

    public static void main(String[] args) {
        int i = 0, j = 0, jmax = 4;

        OUTER_LABEL:
        for (i = 0; i <= 4; i++) {
            System.out.println("i = " + i + " First statement");
            if (i == 0) {
                System.out.println("\t i = " + i + ", Continue outer_label");
                continue OUTER_LABEL;
            }

            INNER_LABEL:
            for (j = 0; j < 3; j++) {
                System.out.println("\t\tj = " + j + " First");
                if (i == 1 && j == 0) {
                    System.out.println("\t\tj = " + j + " Continue Inner_Label");
                    continue INNER_LABEL;
                }
                if (i == 2 && j == 1) {
                    System.out.println("\t\tj = " + j + " Break Inner_label");
                    break INNER_LABEL;
                }
                if (i == 3 && j == 2) {
                    System.out.println("\t\tj = " + j + " Break Outer_label");
                    break OUTER_LABEL;
                }
                System.out.println("\t\tj = " + j + " Last");

            }
            System.out.println("i = " + i + " Last Statement");
        }
        System.out.println("Outside of Loops: i = " + i + ", j = " + j);
    }

}

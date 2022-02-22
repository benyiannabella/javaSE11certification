class Initializers {


    int i = 10;
    {i--;}
    {i = 2;}



    public static void main(String[] args) {
        int i = new Initializers().i;
        System.out.println(i);

        double area = 5.7;
        String color;
        if (area < 7)
            color = "BLUE";

        String a = "10";
        System.out.println(a+=2);
    }
}

//     public class Z{}

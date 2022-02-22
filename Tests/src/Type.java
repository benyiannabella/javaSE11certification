class Printer {
    public void getType() {
        System.out.println("LASER");
    }
}

public class Type {
    public static void main(String[] args) {
       var obj = new Printer() { //Line n1
            public void GetType() { //Line n2
                System.out.println("INKJET");
            }
        };
        obj.GetType(); //Line n3
    }
} 
public class Complex {
    class Building {}
    class House extends Building{}
    public void convert() {
        Building b1 =
                new Building();
        House h1 = new House();
        Building b2 = new House();
        Building b3 = (House) b1;
//        House h2 = (Building) h1;
        Building b4 = (Building) b2;
        House h3 = (House) b2;
    }

    public static void main(String[] args) {
        Complex c = new Complex();
        c.convert();
    }
}
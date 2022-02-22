class Automobile {
    private final String drive() { return "Driving vehicle"; }
    }
    class Car extends Automobile {
        protected String drive() { return "Driving car"; }
    }
    public class ElectricCar extends Car {
        public final String drive() { return "Driving electric car"; }
            public static void main(String[] wheels) {
                final Automobile car = new ElectricCar();
                Automobile c  = (Car)car;
                var v = (Car)car;
                System.out.print(v.drive());
            }
        }
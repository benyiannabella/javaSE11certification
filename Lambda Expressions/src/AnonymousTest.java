public class AnonymousTest {

    interface Helloable{
        void hello();
    }

    public static void main(String[] args) {
        AnonymousTest a = new AnonymousTest();
        //local class
        class LocalClass extends Object {
            public void hello(){
                System.out.println("Hello Local Class");
            }
        }

        new LocalClass().hello();

        //create and assign an anonymous class to an object variable;
        Object anonymousClass = new Object(){
            public String toString(){
                return "Hello Anonymous Class";
            }
        };

        System.out.println(anonymousClass.toString());

        Helloable anonymousInterfacedClass = new Helloable() {
            @Override
            public void hello() {
                System.out.println("Hello Anonymous Class implementing Interface");
            }
        };

        anonymousInterfacedClass.hello();


        a.printHello(new Helloable() {
            @Override
            public void hello() {
                System.out.println("Hello Anonymous Class  passed as parameter");
            }
        });

        a.printHello(() -> System.out.println("Hello Anonymous Class passed as parameter using Lambda"));
    }


    public void printHello(Helloable h){
        h.hello();
    }
}

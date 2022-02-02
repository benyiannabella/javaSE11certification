package test;

public class StaticNested {

    private String name = "hello";

    public static class Nest{
        private static String name ="nested";

        public static String getName() {
            return name;
        }

        public String getOuterName(StaticNested staticNested){
            return staticNested.name;
        }
    }


    public static void main(String[] args) {
        StaticNested sn = new StaticNested();
        Nest n = new Nest();
        System.out.println(n.getOuterName(sn));
//        StaticNested.Nest.getOuterName(sn);
    }
}

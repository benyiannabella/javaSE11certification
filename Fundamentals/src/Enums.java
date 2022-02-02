public class Enums {

    enum Seasons{
        SPRING {public String getNews(){
                return "I walk in the nature";}
        },
        SUMMER {public String getNews(){
            return "I go swimming in the lake";}
        },
        AUTUMN {public String getNews(){
            return "I go to pick some apples and pears";}
        },
        WINTER {public String getNews(){
            return "I go skiing in the mountains";}
        };

        public String getNews(){
            return "default";
        }

//        SPRING("I walk in the nature"), SUMMER("I go swimming in the lake"),
//        AUTUMN("I go to pick some apples and pears"), WINTER("I go skiing in the mountains");

//        private final String description;
//        Seasons(String description){
//            this.description = description;
//            System.out.println("hello");
//        }

//        public String getDescription(){
//            return this.description;
//        }
    }

    public static void getEnumDesc(Seasons seasons){

        switch (seasons){
            case SPRING:
                System.out.println(Seasons.SPRING.getNews());
                break;
            case SUMMER:
                System.out.println(Seasons.SUMMER.getNews());
                break;
            case AUTUMN:
                System.out.println(Seasons.AUTUMN.getNews());
                break;
            case WINTER:
                System.out.println(Seasons.WINTER.getNews());
                break;
            default:
                System.out.println("nothing else");


        }
//        System.out.println(seasons.values());
    }

    public static void main(String[] args) {
       getEnumDesc(Seasons.SUMMER);

    }

}

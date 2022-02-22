interface Livable{}

class Animals{}

public class Racoons extends Animals implements Livable{
    public Racoons getRacoon(){
        System.out.println("racoon");
        return this;

    }

    public static void main(String[] args) {
        Racoons racoon = new Racoons();
        var racoon2 = (Animals)racoon;
        Animals a = new Animals();
        Animals r = (Racoons) racoon2;
    }

}

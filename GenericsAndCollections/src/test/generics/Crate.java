package test.generics;

public class Crate<T, N> {
    T content;
    N numberLimit;
    public T checkContent(){
        return content;
    }
    public void addContent(T content){
        this.content = content;
    }
    public void addNumberLimit(N limit){
        this.numberLimit = limit;
    }

    @Override
    public String toString() {
        return "content=" + content + ", crate limit = " + numberLimit;
    }

    public static void main(String[] args) {
        Elephant elephant = new Elephant("Elsa");
        Crate<Elephant, Integer> elephantCrate = new Crate<>();
        elephantCrate.addContent(elephant);
        elephantCrate.addNumberLimit(1);
        System.out.println(elephantCrate);
    }
}

class Elephant{
    String name;

    public Elephant(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Elephant name=" + name;
    }
}

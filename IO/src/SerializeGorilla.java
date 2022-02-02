import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SerializeGorilla {
    public static void saveToFile(List<Gorilla>gorillas, File file) throws IOException {
        try(ObjectOutputStream o = new ObjectOutputStream(
                new BufferedOutputStream(new FileOutputStream(file)))) {
            for (Gorilla g : gorillas) {
                System.out.println(g);
                o.writeObject(g);
            }
        }
    }

    public static List<Gorilla> readFromFile(File file) throws IOException{
        var gorillas = new ArrayList<Gorilla>();
        try(ObjectInputStream oi = new ObjectInputStream(
                new BufferedInputStream(new FileInputStream(file)))){
            while(true){
                var object = oi.readObject();
                if(object instanceof Gorilla)
                    gorillas.add((Gorilla) object);
            }
        } catch(EOFException e){
            System.out.println("exception");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(gorillas);
        return gorillas;
    }

    public static void main(String[] args) throws IOException {
        File file = new File("gorilla.data");
        List<Gorilla> g = new ArrayList<>();
        g.add(new Gorilla(5, "Judy", "banana"));
        g.add(new Gorilla(2, "Pip", "mango"));
//        saveToFile(g, file);
//        readFromFile(file);

        System.out.println(g.get(1));
    }
}

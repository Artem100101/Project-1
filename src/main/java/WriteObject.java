import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        Man man1 = new Man(1,"Иван","Иванов","Иванович","19.09.2020");
        Group group1 = new Group(19,"ИАИТ");

        try {
            FileOutputStream fos = new FileOutputStream("people.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(man1);
            oos.writeObject(group1);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

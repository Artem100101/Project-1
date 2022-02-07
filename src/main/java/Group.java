import java.io.Serializable;

public class Group implements Serializable {
    public int number;
    public String facult;

    public Group(){}

    public Group(int number, String facult){
        this.number = number;
        this.facult = facult;
    }

    public String toString(){
        return "Номер группы: " + number + "\n" + "Факультет: " + facult;
    }
}

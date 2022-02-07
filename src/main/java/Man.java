import java.io.Serializable;

public class Man implements Serializable {
        private int id;
        public String name;
        public String famil;
        public String otch;
        public String inic;
        public String data;

        public Man(){}

        public Man(int id, String name, String  famil, String otch, String data){
            this.id = id;
            this.name = name;
            this.famil = famil;
            this.otch = otch;
            this.data = data;
        }

        public String toString(){
            return id+ " : " +"ФИО студента: " + famil + " " + name + " " + otch + "\n" + "Дата зачисления: " + data;
        }

    }


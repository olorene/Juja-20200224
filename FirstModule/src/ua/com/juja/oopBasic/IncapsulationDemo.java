package ua.com.juja.oopBasic;

public class IncapsulationDemo {

    private static String [] jujaStudents = {"Artem Kudlaenko", "Buben Code", "Dmitry Shabotin", "Dmitry Tsapko",
            "Eugene Eug", "Ihor Hrysha", "Lesha Petrohalko", "Nn Nn", "Rain Pster", "Vasyl Kruten", "Victor Pidleteychuk",
            "Yaroslav P", "Yevgeniy Protsyuk", "Максим Клеткин", "Николай Черных"};

    private static String[] fighters = {"F-16", "F/A-18", "Su-35", "Rafal"};

    public static void main(String[] args) {
/*        TrainingCource juja = new TrainingCource(jujaStudents);
        juja.getAllStudents()[2] = "My Cousin";
        juja.printAllStudents();*/
        FighterNewGeneration fighter = new FighterNewGeneration(fighters);
        fighter.printAllFignters();
        fighter.getFighters()[1] = "F/A-18a";
        fighter.printAllFignters();

    }

}

class FighterNewGeneration {
    private String[] fighters;

    public FighterNewGeneration(String[] fighters) {
        this.fighters = fighters;
    }

    public String[] getFighters() {
        return fighters;
    }



    public void printAllFignters() {
        for (int i = 0; i < fighters.length - 1; i++) {
            System.out.print(fighters[i] + ", ");
        }
        System.out.print(fighters[fighters.length - 1]);
        System.out.println();
    }
}

class TrainingCource {
    private String[] students;

    public TrainingCource(String [] students){
        this.students = students;
    }

//    public String[] getAllStudents() {
//        return students;
//    }

    public String[] getAllStudents() {
        String[] studentsCopy = new String[students.length];
        for (int i = 0; i < students.length; i++)
            studentsCopy[i] = students[i];
        return studentsCopy;
    }

    public void printAllStudents(){
        for (int i = 0; i < students.length; i++) {
            System.out.print(students[i] + ", ");
        }
    }

}

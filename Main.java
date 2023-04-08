package hw6;
public class Main {
    public static void main(String[] args) {


        Student student1 = new StudentBuilder().getInstance().getName("Ахмед").getHungry(true).getAverageMarks((byte)5).getClassNumber((byte)19).build();
        System.out.println(student1.toString());
    }
}

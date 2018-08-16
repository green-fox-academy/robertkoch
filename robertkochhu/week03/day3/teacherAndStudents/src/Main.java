public class Main {
    public static void main(String[] args){
        Student student1 = new Student("Adam");
        Student student2 = new Student("Eva");
        Teacher teacher1 = new Teacher("DAvid");
        Teacher teacher2 = new Teacher("Dalma");

        student1.question(teacher1);
        teacher2.teach(student2);
    }
}

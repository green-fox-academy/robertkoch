public class Student {
    String name;

    Student(String name) {
        this.name = name;
    }

    public void learn(Teacher b) {
        System.out.println(this.name+"learns from" +b.name);
    }

    public void question(Teacher a ) {
        System.out.println(this.name +"questions" +a.name);
        a.answer(this);
    }


}

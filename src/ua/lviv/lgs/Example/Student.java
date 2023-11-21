package ua.lviv.lgs.Example;

public class Student extends Human {
  private int id;
  private String nameOfUni;

    Student(String name, int age,int id,String nameOfUni) {
        super(name, age);
        this.id=id;
        this.nameOfUni=nameOfUni;
    }
    Student(int id,String nameOfUni){
        super("PR",25);//викликаємо батьківський конструктор
        this.id=id;
        this.nameOfUni=nameOfUni;
    }

    public int getId() {
        return id;
    }

    public String getNameOfUni() {
        return nameOfUni;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +", nameOfUni='" + nameOfUni + '\'' + ", name="+super.getName()+", age="+super.getAge()+'}';
    }
}

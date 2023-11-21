package ua.lviv.lgs.Animals;

public class Application {
    public static void main(String[] args) {
        Animal an=new Animal("Лисиця", 50, 2.5);
        System.out.println(an);
        System.out.println("Назва тварини= '"+ an.getName()+"', Швидкість тварини=  "+ an.getSpeed()+" км/год, Вік тварини =  "+an.getAge()+" років");

        an.setName("Бик");
        an.setSpeed(25);
        an.setAge(8.0);

        System.out.println("Назва тварини= '"+ an.getName()+"', Швидкість тварини=  "+ an.getSpeed()+" км/год, Вік тварини =  "+an.getAge()+" років");
    }
}

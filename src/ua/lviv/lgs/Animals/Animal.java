package ua.lviv.lgs.Animals;

public class Animal {
    private String name;
    private double speed;
    private double age;

    public Animal(String name, double speed, double age) {
        this.name = name;
        this.speed = speed;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public double getSpeed() {
        return speed;
    }

    public double getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setAge(double age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" + " Назва тварини= '" + name + "', Швидкість тварини=" + speed +  " км/год, Вік тварини = " + age + " років }";
    }
}

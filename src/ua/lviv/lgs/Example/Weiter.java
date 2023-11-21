package ua.lviv.lgs.Example;

public class Weiter extends Human{
  private double hourPay;
  private double tips;

    Weiter(String name, int age) {
        super(name, age);
    }

    public Weiter(String name, int age, double hourPay, double tips) {
        super(name, age);
        this.hourPay = hourPay;
        this.tips = tips;
    }

    public double getHourPay() {
        return hourPay;
    }

    public double getTips() {
        return tips;
    }

    public void setHourPay(double hourPay) {
        this.hourPay = hourPay;
    }

    public void setTips(double tips) {
        this.tips = tips;
    }

    @Override
    public String toString() {
        return "Weiter{" +
                "hourPay=" + hourPay +
                ", tips=" + tips +
                '}';
    }
}

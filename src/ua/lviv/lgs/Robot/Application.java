package ua.lviv.lgs.Robot;

public class Application {
    public static void main(String[] args) {
        Robot r=new Robot();
        RobotCoocker rc=new RobotCoocker();
        RobotDancer rd=new RobotDancer();
        CoffeRobot cr=new CoffeRobot();


         r.work();      cr.work();
         rd.work();     rc.work();

        System.out.println ( "" );
        Robot rwork[]= {r,rc,rd,cr}; //масив класу Robot , заповнити масив екземплярами вищеописаних класів
        for(int i=0; i< rwork.length; i++){
           rwork[i].work();
       }

    }
}

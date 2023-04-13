package QaTek.practice;

public class EncapsulateMain {

    public static void main(String[] args){

        EncapsulationExample obj = new EncapsulationExample();
        obj.setGeekName("Barack");
        obj.setGeekRoll(2);
        obj.setGeekAge(25);

        System.out.println("Name = " + obj.getGeekName());
        System.out.println("Age = " + obj.getGeekAge());
        System.out.println("Roll = " + obj.getGeekRoll());

    }
}

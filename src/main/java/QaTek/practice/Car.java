package QaTek.practice;

public abstract class Car {

    double mpg = 35.5;
    int numOfDoors;
    String bodyType;

    public void showMpg(){
        System.out.println("MPG = " + mpg);
    }

    public abstract void useElectricity();
}

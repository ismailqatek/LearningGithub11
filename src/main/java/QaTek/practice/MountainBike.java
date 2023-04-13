package QaTek.practice;

public class MountainBike extends Bicycle{

    public int seatHeight;

    public MountainBike(int gear, int speed, int seatHeight){
        //this.gear = gear;
        //this.speed = speed;
        super(gear, speed);
        this.seatHeight = seatHeight;
    }

    public void applyBrake(int decrement, String message){
        System.out.println(message);
        speed -= decrement;
    }

    public void setHeight(int newValue){
        seatHeight = newValue;
    }

    public String toString(){
        //return("No. of gears are " + gear + ", Speed is " + speed + ", Seat height is " + seatHeight);
        return(super.toString() + ", Seat height is " + seatHeight);

    }



}

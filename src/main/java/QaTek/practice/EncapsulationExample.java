package QaTek.practice;

public class EncapsulationExample {

    private String geekName;
    private int geekRoll;
    private int geekAge;

    // Getter method
    public int getGeekAge(){
        return geekAge;
    }

    public String getGeekName(){
        return geekName;
    }

    public int getGeekRoll(){
        return geekRoll;
    }

    // Setter method
    public void setGeekName(String newName){
        geekName = newName;
    }

    public void setGeekRoll(int newRoll){
        geekRoll = newRoll;
    }

    public void setGeekAge(int newAge){
        geekAge = newAge;
    }

}

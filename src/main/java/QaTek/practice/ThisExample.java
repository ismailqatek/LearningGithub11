package QaTek.practice;

public class ThisExample {

    int a;
    int b;

    public void setData(int a, int b){
        this.a = a;
        this.b = b;
    }

    public void showData(){
        System.out.println("Value of A = " + a);
        System.out.println("Value of B = " + b);
    }

    public static void main(String[] args){
        ThisExample Te = new ThisExample();
        Te.setData(2, 3);
        Te.showData();
    }
}

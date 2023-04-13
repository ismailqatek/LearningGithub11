package QaTek.practice;

public class Sum {

    public int sum(int x, int y){
        return x+y;
    }

    public int sum(int x, int y, int z){
        return x+y+z;
    }

    public int sum(int x, int y, double z){
        return x+y;
    }

    public int sum(int x, double y, int z) {
        return x + z;
    }public static void main (String[] args){
        Sum s = new Sum();
        System.out.println(s.sum(10, 20));
        System.out.println(s.sum(10, 20, 30));
        System.out.println(s.sum(10, 20, 30.9));
        System.out.println(s.sum(10, 20.6, 30));
    }
}

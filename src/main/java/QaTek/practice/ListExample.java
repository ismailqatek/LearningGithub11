package QaTek.practice;


import java.util.ArrayList;
import java.util.List;

public class ListExample {

    List<String> lists = new ArrayList<String>();

    public void addValueToList(){
        lists.add("One");
        lists.add("Two");
        lists.add("Three");
    }

    public void readValueFromTheList(){
        lists.add("Four");
        System.out.println(lists);

        for(String a: lists){
            System.out.println("Print value using Loop: " + a);
        }

        for(int i = 0; i < lists.size(); i++){
            System.out.println("Print value using Loop indexing: " + lists.get(i));
        }

    }

    public void removeValueFromTheList(){
        lists.remove("Two");
        System.out.println(lists);
    }
}

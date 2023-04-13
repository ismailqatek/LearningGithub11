package QaTek.practice;

import java.util.HashMap;
import java.util.Map;
public class HashMapExample {

    HashMap<String, String> hmap = new HashMap<>();

    public void addHashMapValue(){
        hmap.put("IE" , "Internet Explorer");
        hmap.put("CB" , "Chrome Browser");
        hmap.put("FF" , "Mozilla Firefox");
        hmap.put("SB" , "Safari Browser");

        //System.out.println("Browser name of SB: " + hmap.get("SB"));

        for(Map.Entry me: hmap.entrySet()){
            System.out.println("Key = " + me.getKey() + ", Value = " + me.getValue());

        }

        System.out.println();
        System.out.println("Size of the map: " +hmap.size());

        System.out.println();
        System.out.println("Content of the map: " + hmap);

        if(hmap.containsKey("FF")){
            String  val = hmap.get("FF");
            System.out.println("Value for FF: " + val);
        }

    }

   /* HashMap<String, Integer> hmap1 = new HashMap<>();

    public void addHashMapValue(){
        hmap1.put("Vishal" , 10);
        hmap1.put("Sachin" , 30);
        hmap1.put("Vaibhav" ,20);


        for(Map.Entry me1 : hmap1.entrySet()){
            System.out.println("Key = " + me1.getKey() + ", Value = " + me1.getValue());

        }

        System.out.println();
        System.out.println("Size of the map: " +hmap1.size());

        System.out.println();
        System.out.println("Content of the map: " + hmap1);

        if(hmap1.containsKey("Vishal")){
           Integer val1 = hmap1.get("Vishal");
            System.out.println("Value for Vishal: " + val1);
        }

    } */

    public static void main(String[] args){
        HashMapExample hme = new HashMapExample();
        hme.addHashMapValue();

    }

}


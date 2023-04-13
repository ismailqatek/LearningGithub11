package QaTek.practice;

public class StringExample {

    public void IndexOf(){
        String mystr = "Hello planet earth, you are a great planet.";
        System.out.println(mystr.indexOf( "planet", 15));
    }

    public void showSubstring(){
        String str = "JavaPoint";
        String subStr = str.substring(2);
        System.out.println(subStr);
    }

    public void showSubstring1(){
        String str = "JavaPoint";
        String subStr = str.substring( 0, 4);
        System.out.println(subStr);

        String emptyString = "";
    }

    public void trim(){
        String myStr = "      Hello World     ";
        System.out.println(myStr);
        System.out.println(myStr.trim());
    }

    public void charAt(){
        String myStr = "Hello";
        char result = myStr.charAt(0);
        System.out.println(result);
    }

    public void valueOf(){
        int value = 30;
        String s1 = String.valueOf(value);
        System.out.println(s1 + 10);
    }

    public void format(){
        String name = "Jonathan";
        int age = 20;
        int salary = 40000;
        String s = String.format("My name is %s and I an %d years old and my salary is $%d yearly", name, age, salary);

        System.out.println(s);
    }

    public void formatOriginal(){
        String name = "Jonathan";
        int age = 20;
        int salary = 40000;

        System.out.println("My name is " + name + " and I an " + age + " years old and my salary is " + salary + " yearly.");
    }

    public void contains(){
        String myStr = "Hello";
        System.out.println(myStr.contains("Hel"));
        System.out.println(myStr.contains("e"));
        System.out.println(myStr.contains("Hi"));
    }

    public void splitArray() {
        String name = "John,Ali,Mathew,Abraham";
        String[] nameArray = name.split(",");
        for (String person : nameArray) {
            System.out.println("Person name is: " + person);
        }
    }

    public void splitArray1(){
        String sentence = "I live in Newyork";

        String[] words = sentence.split(" ");
        for(String word: words) {
            System.out.println("Word is: " + word);
        }

        //String reverse = "Newyork in live I";
        String reverse = "";

        for(int i = words.length -1; i >= 0; i--){
            reverse += words[i] + " ";
        }
        System.out.println("Sentence is: " + reverse);
    }
}

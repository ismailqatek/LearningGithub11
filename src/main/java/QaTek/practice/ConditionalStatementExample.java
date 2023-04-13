package QaTek.practice;

public class ConditionalStatementExample {

    public void IfStatements(){
        int x = 30;

        if(x<20){
            System.out.println("This is If statement");
        }
        else{
            System.out.println("This is Else statement");
        }
    }

    public void NestedIfStatement(){

        int x = 30;
        int y = 10;

        if(x<35){
            if(y<15){
                System.out.println("x = " + x + " and y =" + y);
            }
        }
    }

    public void IfWithoutSwitchStatements(){

        char grade = 'C';

        if(grade == 'A') {
            System.out.println("Excellent");
        }
        if(grade == 'B') {
            System.out.println("Well Done");
        }
        if(grade == 'C') {
            System.out.println("Well Done");
        }
        if(grade == 'D') {
            System.out.println("You passed");
        }
            if (grade == 'F') {
                System.out.println("Better try again");
            }

                System.out.println("Your grade is " + grade);
            }


        public void SwitchStatements(){
            char grade = 'C';

            switch(grade){

                case 'A':
                    System.out.println("Excellent");
                    break;

                case 'B':
                case 'C':
                    System.out.println("Well Done");
                    break;

                case 'D':
                    System.out.println("You passed");
                    break;

                case 'F':
                    System.out.println("Better try again");
                    break;

                default:
                    System.out.println("Invalid grade");
            }

            System.out.println("Your grade is " + grade);

        }



    public void IfOperator(){

    int a,b;
    a=10;
    if(a == 1){
        b = 20;
    }
    else{
        b = 30;

    }
    }
    public void ConditionalOperator(){
        int a,b;
        a = 10;
        b = (a==1) ? 20 : 30;
        System.out.println("Value of b is : " + b);

        b = (a==10) ? 20: 30;
        System.out.println("Value of b is : " + b);
    }
    }

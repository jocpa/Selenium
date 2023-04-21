package selenium.JavaBasics;

public class Operators {
    
    public static void main(String[] args) {

        // assignment 
        int n1;
        n1 = 10;
        System.out.println(n1);

        // arithmetical
        int n2 = 15;
        int n3 = 25;
        System.out.println(n3 - n2);

        // relational
        if(n2 > n3) {
            System.out.println(n2 + " is grater than " + n3);
        }else {
            System.out.println(n3 + " is greater than " + n2);
        }

        //logical
        int a = 2;
        int b = 4;
        int c = 10;
        boolean result1;
        boolean result2;

        result1 = (a > b) || (c > a);
        System.out.println(result1);

        result2 = (a > b) && (c > a);
        System.out.println(result2);
    }

}

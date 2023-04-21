package selenium.JavaBasics;

public class IfStatement {
    
    public static void main(String[] args) {
        ifExample();
        ifExample2();
    }

    public static void ifExample() {
        if(10 > 9) {
            System.out.print("10 is greater than 9\n");
        }
    }

    public static void ifExample2() {
        int hour = 11;
        int midday = 12;
        int afternoon = 18;

        if(hour >= midday && hour <= afternoon) {
            System.out.println("Good afternoon");
        }else if(hour <= midday){
            System.out.println("Good morning");
        }else {
            System.out.println("Good night");
        }
    }

}

package selenium.JavaBasics;

public class Loops {
    
    public static void main(String[] args) {
        forLoop();
        forEachLoop();
        whileLoop();
    }

    public static void forLoop() {
        for(int i = 1; i < 10; i++) {
            System.out.println(" Message " + i);
        }
    }
    public static void forEachLoop() {
        int[] numbers = {2,4,6,8};

        for(int number : numbers) {
            System.out.println(number);
        }
    }
    public static void whileLoop() {
        int i = 6;

        while(i != 0) {
            System.out.println("There are " + i + " roses remaining");
            i--;
        }
    }

}

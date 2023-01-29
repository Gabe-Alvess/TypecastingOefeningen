package be.intecbrussel;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("Github");
        System.out.println(" ---- Oefening 1 ---- ");

        int number01 = 253;
        long number02 = 2365L;

        double number01Double = number01;
        double number02Long = number02;

        System.out.println("int naar double : " + number01 + " -> " + number01Double);
        System.out.println("long naar double : " + number02 + " -> " + number02Long);

        System.out.println(" ---- Oefening 2 ---- ");

        double number = 10.99;

        int myInt = (int) number;

        System.out.println("double naar int : " + number + " -> " + myInt);
    }
}

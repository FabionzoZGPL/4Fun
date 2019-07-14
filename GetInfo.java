import java.util.Scanner;

class GetInfo {

    void printInfo(){
     Scanner scanner = new Scanner(System.in);

        System.out.println("Witaj w kalkulatorze, w którym możesz wybrać następujące operacje na dwóch zmiennych: ");
        System.out.println();
        System.out.println("Dodawanie => 1");
        System.out.println("Odejmowanie => 2");
        System.out.println("Mnożenie => 3");
        System.out.println("Dzielenie => 4");
        System.out.println();

        System.out.print("Proszę o podanie pierwszej liczby całkowitej: ");
        int num1 = scanner.nextInt();

        System.out.print("Proszę o podanie numeru działania: ");
        int dzialanie = scanner.nextInt();

        System.out.print("Proszę o podanie drugiej liczby całkowitej: ");
        int num2 = scanner.nextInt();


        SwitchInstruction switchInstruction = new SwitchInstruction();
        System.out.print("Twój wynik to: ");
        switchInstruction.SwitchInstruction( dzialanie,  num1,  num2);


    }
}

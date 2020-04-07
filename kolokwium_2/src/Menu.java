import java.util.Scanner;

public class Menu {
    static Scanner inputer = new Scanner(System.in);
    static zadanie_3 zadanie_3 = new zadanie_3();
    public static void menu()
    {
        boolean flag = true;
        while(flag)
        {
            System.out.println("\nwybierz zadanie");
            System.out.println("wpisanie 'exit' zakończy program");

            switch(inputer.nextLine())
            {
                case "1":
                    Main.zadanie_1();
                    break;
                case "2":
                    Main.zadanie_2();
                    break;
                case "3":
                    zadanie_3.setVisible(true);
                    break;
                case "4":
                    Main.zadanie_4();
                case "5":
                    Main.zadanie_5();
                    break;
                case "exit":
                    System.out.println("koniec programu");
                    flag = false;
                    break;

            }
        }
    }
}

import java.util.Scanner;

public class AskNumbers {

    public static int[] ask() {

        Scanner scanner = new Scanner(System.in);
        int[] mix = new int[10];
        System.out.println("Entrez une suite de 10 nombres : ");

        for(int i=0; i<10; i++) {
            mix[i] = scanner.nextInt();
        }

        System.out.println("----------------------------");
        scanner.close();

        return mix;
    }

}

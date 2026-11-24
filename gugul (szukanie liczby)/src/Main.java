import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] tablica = new int[51];
        int[] tablicaPasujacych = new int[0];
        int[] tablicaPozycjiPasujacych = new int[0];

        for (int i = 0; i < 50; i++){
            tablica[i] = (int)(Math.random() * 101);
            System.out.println((i + 1) + ". " + tablica[i]);
        }

        while (true){
            System.out.println("1. szukaj");
            System.out.println("2. wyjdź");
            System.out.println("wybieram : ");
            int znalezionoLacznie = 0;
            int szukanaLiczba;
            int opcja = scan.nextInt();
            if (opcja == 1){
                System.out.println("cool \n podaj liczbę : ");
                szukanaLiczba = scan.nextInt();
                tablica[50] = szukanaLiczba;
                for (int i = 0; i < 50;i++){
                    if (tablica[i] == szukanaLiczba){
                        System.out.println("Znaleziono pasujące na pozycji " + (i+1) + ". " + tablica[i]);
                        znalezionoLacznie += 1;
                    }
                }
                System.out.println("znaleziono łącznie : " + znalezionoLacznie);
            }else{
                System.out.println("no i wypierdalaj");
                break;
            }
        }
    }
}
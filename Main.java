import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int[][] tablica;
        int tab_x, tab_y;
        System.out.println("Podaj długość: ");
        tab_x = s.nextInt();
        System.out.println("Podaj szerokość: ");
        tab_y = s.nextInt();
        tablica = new int[tab_x][tab_y];
        for(int i = 1; i<=tab_x;i++)
        {
            for(int z = 1; z<=tab_y; z++)
            {
                tablica[i-1][z-1] = i*z;
            }
        }
        for(int[] x: tablica)
        {
            for(int y: x)   {
                System.out.print(y + "\t");

            }
            System.out.println("");

        }
    }
}

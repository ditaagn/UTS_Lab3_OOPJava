import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int pil;

        System.out.println("Menu");
        System.out.println("1. Matematika   : Menghitung determinan matriks 3x3");
        System.out.println("2. Fisika       : Konversi suhu");
        System.out.print("Pilihan mu (1/2)  :  ");
        pil = input.nextInt();
        System.out.println(" ");

        switch (pil) {
            case 1:
                System.out.println("Determinan matriks 3x3 :");
                System.out.print("Masukkan jumlah baris matriks: ");
                int rows = input.nextInt();
                System.out.print("Masukkan jumlah kolom matriks: ");
                int columns = input.nextInt();
                int[][] matrix = new int[rows][columns];

                System.out.println("Masukkan elemen matriks: ");
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < columns; j++) {
                        matrix[i][j] = input.nextInt();
                    }
                }

                System.out.println("Matriks yang dimasukkan:");
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < columns; j++) {
                        System.out.print(matrix[i][j] + " ");
                    }
                    System.out.println();
                }

                int determinant = Matematika.calculateDeterminant(matrix);
                System.out.println("Determinant: " + determinant);
                input.close();
                break;

            case 2:
                System.out.println("Konversi suhu");
                System.out.print("Masukkan suhu dalam Celsius: ");
                double celsius = input.nextDouble();

                Fisika fisika = new Fisika();
                double reamur = fisika.toReamur(celsius);
                double fahrenheit = fisika.toFahrenheit(celsius);
                double kelvin = fisika.toKelvin(celsius);

                System.out.println(celsius + " Celsius = " + reamur + " Reamur");
                System.out.println(celsius + " Celsius = " + fahrenheit + " Fahrenheit");
                System.out.println(celsius + " Celsius = " + kelvin + " Kelvin");

                input.close();

                break;

            default:
                System.out.println("Pilihan tidak valid");
                break;
        }
    }
}
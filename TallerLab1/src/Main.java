import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        menu();
    }


    public static int IngresarNumero(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        int num = scan.nextInt();
        return num;

    }
    public static void menu() {
        System.out.println("Porfavor ingrese la cantidad de filas");
        int filas = IngresarNumero();
        System.out.println("Porfavor ingrese la cantidad de columnas");
        int columnas = IngresarNumero();
        int[][] matriz = crear_matriz(filas, columnas); //creacion de la matrtiz con las dimensiones especificadas

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                Random rand = new Random();
                int numero = rand.nextInt(0,10);

                matriz[i][j] = numero ;
            }
        }

    mostrar_matriz(matriz);
        mostrar_fila(matriz);
    }

    public static int[][] crear_matriz(int filas, int columnas){
        return new int[filas][columnas];

    }

    public static void mostrar_matriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]+ " ");
            }
            System.out.println();
        }



        //verificar si la matriz es tipo cero//
    }
    public static void mostrar_fila(int[][] matriz) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese la fila que desea imprimir");
        int fila = scan.nextInt();
        for (int i = 0; i <matriz.length ; i++) {
            System.out.print(matriz[0][i] + " ");
        }

    }



}
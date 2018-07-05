
import javax.swing.JOptionPane;
public class Ara04 {
    static int tam, M[][];
    public static void main(String args[]){
 
        tam = Integer.parseInt(JOptionPane.showInputDialog("Digite tamaño de la matriz: "));
        M = new int[tam][tam];
 
        for(int i = 0; i < M.length; i++){
            for(int j = 0; j < M[i].length; j++){
                M[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite dato [" + i + "] [" + j + "]"));
            }
        }
 
        System.out.println("La suma de los elementos de la diagonal secundaria es:  " + sumaDS());
        printMatriz();
    }
 
    static int sumaDS(){
        int suma = 0;
        for(int i = 0; i < M.length; i++){
            for(int j = 0; j < M[i].length; j++){
                if( i+j == M.length - 1){
                    suma = suma + M[i][j];
                }
            }
        }
        return suma;
    }
 
    static void printMatriz(){
        for(int i = 0; i < M.length; i++){
            for(int j = 0;j < M[i].length;j++)
  System.out.print("[" + M[i][j] + "]");
  System.out.println(" ");
            }
    }
}
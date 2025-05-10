package tp22;
import java.util.Scanner;
public class Tableau {
	private int[] tableau;
    static Scanner scanner = new Scanner(System.in);

    public Tableau(int N) {
        tableau = new int[N];
    }

    public void remplir() {
        for (int i = 0; i < tableau.length; i++) {
            System.out.print("T[" + i + "] = ");
            tableau[i] = scanner.nextInt();
        }
    }

    public void trierCroissant() {
        int n = tableau.length;
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (tableau[j] > tableau[j + 1]) {
                    
                    int temp = tableau[j];
                    tableau[j] = tableau[j + 1];
                    tableau[j + 1] = temp;
                }
            }
        }
    }

    public void afficher() {
        
        for (int i = 0; i < tableau.length; i++) {
            System.out.print(tableau[i] + " ");
        }
        System.out.println();
    }

 public static void main(String[] args) {
        
        System.out.print("Entrez la taille du tableau : ");
        int taille = scanner.nextInt();
        Tableau t = new Tableau(taille);

        t.remplir();

        System.out.println("Tableau avant tri :");
        t.afficher();

        t.trierCroissant();
        System.out.println("Tableau apres tri :");
        t.afficher();
    }

}

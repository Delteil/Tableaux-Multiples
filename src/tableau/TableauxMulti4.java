/*Exercice 4
Soit un tableau T à deux dimensions (12, 8) préalablement rempli de valeurs numériques.
Écrire un algorithme qui recherche la plus grande valeur au sein de ce tableau.
 */

package tableau;

import java.util.Random;

public class TableauxMulti4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] tab = new int[12][8];
		Random r = new Random();
		int vmax = 0;

		for (int i = 0; i < tab.length; i++) {

			for (int j = 0; j < tab[i].length; j++) {

				tab[i][j] = r.nextInt(100); 		// remplissage du tableau avec des valeurs aléatoires.
			}
		}

		for (int i = 0; i < tab.length; i++) {

			for (int j = 0; j < tab[i].length; j++) {

				if (tab[i][j] > vmax) {				// parcour du tableau à la recherche de la valeur max

					vmax = tab[i][j];		
				}
			}

		}
		afficheTab(tab);
		
		System.out.println("la plus grande valeur du tableau est " + vmax);

	}

	public static void afficheTab(int[][] tab) {
		for (int i = 0; i < tab.length; i++) {

			for (int j = 0; j < tab[0].length; j++) {
				System.out.print(tab[i][j] + " ");
			}
			System.out.println();
		}
	}
}

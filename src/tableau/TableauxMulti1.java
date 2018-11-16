/*Exercice 1
Écrivez un algorithme remplissant un tableau de 6 sur 13, avec des zéros.
 */

package tableau;

public class TableauxMulti1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] tab = new int[6][13];
		int valeur = 0;

		for (int i = 0; i < tab.length; i++) {

			for (int j = 0; j < tab[0].length; j++) {

				tab[i][j] = valeur;
			}
		}

		afficheTab(tab);
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

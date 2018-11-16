/*Exercice 2
Quel résultat produira cet algorithme ?
 */

package tableau;

public class TableauxMulti2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] tab = new int[2][3];
		int valeur = 0;

		for (int i = 0; i < tab.length; i++) {

			for (int j = 0; j < tab[i].length; j++) {

				tab[i][j] = valeur;
				valeur = valeur + 1;

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

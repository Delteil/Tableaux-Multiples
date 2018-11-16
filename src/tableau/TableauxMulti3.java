/*Exercice 3
Quel résultat produira cet algorithme ?
 */

package tableau;

public class TableauxMulti3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] tab = new int[4][2];
		for (int i = tab.length - 1; i >= 0; i--) {

			for (int j = tab[i].length - 1; j >= 0; j--) {

				tab[i][j] = j;
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

/* Exercice 5
Ecrire un algorithme qui déclare un tableau permettant de saisir pour 4 matières les 3 notes de
l'année (une note par trimestre). Les valeurs sont renseignées par l'algorithme.
La moyenne de l'année pour chaque matière est affichée à l'utilisateur.
La moyenne de toutes les moyennes est aussi affichée à l'utilisateur.
 */

package tableau;

import java.util.Random;

public class TableauxMulti5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] tab = new int[4][3];
		Random r = new Random();

		int matière = 0;
		int somme = 0;
		int noteTotal = 0;
		int moyenne = 0;
		int moyTotal = 0;
		int nbMatière = 0;

		for (int i = 0; i < tab.length; i++) {

			matière = i;

			for (int j = 0; j < tab[i].length; j++) {

				tab[i][j] = r.nextInt(21); // genère des valeurs alèatoire de 0 à 20 (le 21 est exclu).
				System.out.print(tab[i][j] + " ");

				if (matière == i) {		 // pour chaque matiere(i) on effectue:

					nbMatière = i;
					somme = somme + tab[i][j];
					noteTotal = noteTotal + 1;
				}
			}

			nbMatière++;
			moyenne = somme / noteTotal;
			moyTotal = moyTotal + moyenne;

			System.out.println("la moyenne de la matière " + nbMatière + " est " + moyenne);

		}

		moyTotal = moyTotal / nbMatière;
		System.out.println();
		System.out.println("la moyenne totale est " + moyTotal);
	}
}

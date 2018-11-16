/*EXERCICE 6
Écrire un algorithme de jeu de dames très simplifié.
L’ordinateur demande à l’utilisateur dans quelle case se trouve son pion dans le damier
(quelle ligne, quelle colonne).
On met en place un contrôle de saisie afin de vérifier la validité des valeurs entrées.
Dans le tableau la position du pion est symbolisée par le chiffre "1" et les autres cases sont
alors à "0".
Ensuite, on demande à l’utilisateur quel mouvement il veut effectuer : 0 (en haut à gauche), 1
(en haut à droite), 2 (en bas à gauche), 3 (en bas à droite), 4 (arrêt du jeu).
Si le mouvement est impossible (i.e. on sort du damier), on le signale à l’utilisateur et attend
la nouvelle saisie. Sinon, on affiche le tableau avec la nouvelle position du pion dans le
tableau (et donc sur le damier).
Lors de l'arrêt du jeu, on affiche le contenu du tableau à l'utilisateur.
 */

package tableau;

import java.util.Scanner;

public class TableauxMulti6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int[][] tab = new int[10][10];
		int pion = 1;
		int ligne = 0;
		int colonne = 0;
		int mouvement = 0;

		System.out.println("entrez une valeur pour la ligne entre 0 et 9");
		ligne = sc.nextInt();

		System.out.println("entrez une valeur pour la colonne entre 0 et 9");
		colonne = sc.nextInt();

		for (int i = 0; i < tab.length; i++) {

			for (int j = 0; j < tab[0].length; j++) {

				tab[i][j] = 0;
			}
		}

		if ((ligne < 0 || ligne > 9) || (colonne < 0 || colonne > 9)) {

			System.out.println("Valeurs non valides, nouvelle saisie");

		} else {

			tab[ligne][colonne] = pion;

			afficheTab(tab);
		}

		boolean mouvOk = true;
		while (mouvement != 4) {
			System.out.println(
					"entrez le mouvement du pion : 0 (en haut à gauche), 1 (en haut à droite), 2 (en bas à gauche), 3 (en bas à droite), 4 (arràt du jeu)");
			mouvement = sc.nextInt();
			
			mouvOk = (ligne-1 >= 0 && ligne+1 <= 9) && (colonne-1 >= 0 && colonne+1 <= 9);

			if (mouvement == 0) {
				if (mouvOk) {
					ligne = ligne - 1;
					colonne = colonne - 1;
				} else {
					System.out.println("mouvement impossible");
				}
				tab[ligne][colonne] = pion;
				tab[ligne+1][colonne+1] = 0;		
			}
			
			if (mouvement == 1) {
				if (mouvOk) {
					ligne = ligne - 1;
					colonne = colonne + 1;
				} else {
					System.out.println("mouvement impossible");
				}
				tab[ligne][colonne] = pion;
				tab[ligne+1][colonne-1] = 0;
			
				}
			afficheTab(tab);
			}
			
		}

	

	public static void afficheTab(int[][] tab) {
		for (int i = 0; i < tab.length; i++) {

			for (int j = 0; j < tab[i].length; j++) {
				System.out.print(tab[i][j] + " ");
			}

			System.out.println();
		}
	}
}

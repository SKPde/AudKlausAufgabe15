
public class ListeF {

	private Comparable[] element; // Inhalte der Elemente
	private int lastIndex; // Zuletzt besetzter Index

	public ListeF(int length) {
		element = new Comparable[length];
		lastIndex = 4;
	}

	public void sortedInsert(Comparable o) {
		if (lastIndex >= element.length - 1) {
			throw new RuntimeException("Liste bereits Voll");
		}
		int wunschindex = 0;
		while (wunschindex <= lastIndex && element[wunschindex].compareTo(o) < 0) {

			wunschindex++;
		}
		System.out.println(wunschindex);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListeF liste = new ListeF(8);
		liste.element[0] = "Auto";
		liste.element[1] = "Bahn";
		liste.element[2] = "Dorf";
		liste.element[3] = "Güterzug";
		liste.element[4] = "MiniEL";
		liste.sortedInsert("Offroad");
	}

}

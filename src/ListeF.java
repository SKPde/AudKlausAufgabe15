
public class ListeF {

	private Comparable[] element; // Inhalte der Elemente
	private int lastIndex; // Zuletzt besetzter Index

	public ListeF(int length) {
		element = new Comparable[length];
		lastIndex = -1;
	}

	public void sortedInsert(Comparable o) {
		if (lastIndex >= element.length - 1) {
			throw new RuntimeException("Liste bereits Voll");
		}
		int wunschindex = 0;
		while (wunschindex <= lastIndex && element[wunschindex].compareTo(o) < 0) {
			wunschindex++;
		}
		
		for(int x = element.length-1; x >= wunschindex; x--) {
			if(element[x] != null) {
				element[x+1] = element[x];
			}
		}
		
		element[wunschindex] = o;
		lastIndex++;
		//System.out.println(wunschindex);
	}
	
	public void ausgeben() {
		for(int x = 0; x <= lastIndex; x++) {
			System.out.println(element[x].toString());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListeF liste = new ListeF(8);

		liste.sortedInsert("MiniEL");
		liste.sortedInsert("Dorf");
		liste.sortedInsert("Bahn");
		liste.sortedInsert("Turbodiesel");
		liste.sortedInsert("Auto");
		liste.sortedInsert("Chemiker");
		liste.sortedInsert("Brot mit Brot");
		liste.sortedInsert("Güterzug");
		//liste.sortedInsert("Benziner");
		liste.ausgeben();
	}

}

package mediatheque;

import java.util.LinkedList;
import java.util.List;


public class Mediatheque {
	private final List<Item> items = new LinkedList<>();

	public void addItem(Item i) {
		items.add(i);
	}
	
	public void printCatalog() {
		CatalogueVisitor cat = new CatalogueVisitor();
		for (Item i : items)
			i.accept(cat);
	}
	
	public void printOnlyBooks() {
		BookVisitor b = new BookVisitor();
		for(Item i : items)
			i.accept(b);
		/*
		//avec instanceof
		for (Item i : items)
			if (i instanceof Book)
				System.out.println(i);
		*/
	}

	public void printOnlyCDs() {
		CDVisitor c = new CDVisitor();
		for(Item i : items)
			i.accept(c);
	}

}

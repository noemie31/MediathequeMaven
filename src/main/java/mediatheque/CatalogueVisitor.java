package mediatheque;

public class CatalogueVisitor implements ItemVisitor{
    public void visit(CD item){
        System.out.println("Visiting Catalogue: "+ item.getTitle());
    }
    public void visit(Book item){
        System.out.println("Visiting Catalogue: "+item.getTitle());
    }
}

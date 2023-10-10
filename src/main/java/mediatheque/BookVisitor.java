package mediatheque;

public class BookVisitor implements ItemVisitor {
    public void visit(CD item){

    }
    public void visit(Book item){
        System.out.println("Visiting Book: "+item.getTitle());
    }
}

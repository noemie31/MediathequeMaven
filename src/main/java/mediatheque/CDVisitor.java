package mediatheque;

public class CDVisitor implements ItemVisitor{
    public void visit(CD item){
        System.out.println("Visiting CD: "+item.getTitle());
    }
    public void visit(Book item){

    }
}

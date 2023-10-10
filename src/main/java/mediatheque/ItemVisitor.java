package mediatheque;

public interface ItemVisitor {
    abstract void visit(CD item);
    abstract void visit(Book item);
}

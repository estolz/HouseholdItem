package household;

public interface Visitor {
    public void ElectronicVisitor(Electronic d);
    public void FurnitureVisitor(Furniture d);
    public void GlassVisitor(Glass d);
}

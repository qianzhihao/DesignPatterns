package patterns.visitor.extend;

public interface IVisitor {
    public void visit(CommonEmployee commonEmployee);
    public void visit(Manager manager);
    public int getTotalSalary();
}

package patterns.visitor.extend;

public class Visitor implements IVisitor {
    private final static int MANAGER_COEFFICIENT = 5;
    private final static int COMMONEMPLOYEE_COEFFICIENT = 2;
    private int commonTotalSalary = 0;
    private int managerTotalSalary = 0;
    private void calManagerSalary(int salary) {
        this.managerTotalSalary = this.managerTotalSalary + salary * MANAGER_COEFFICIENT;
    }

    private void calCommonSalary(int salary) {
        this.commonTotalSalary = this.commonTotalSalary + salary * COMMONEMPLOYEE_COEFFICIENT;
    }

    public int getTotalSalary() {
        return this.commonTotalSalary + this.managerTotalSalary;
    }
    @Override
    public void visit(CommonEmployee commonEmployee) {
//        System.out.println(this.getCommonEmployee(commonEmployee));
    }

    @Override
    public void visit(Manager manager) {
//        System.out.println(this.getManagerInfo(manager));
    }
//
//    private String getBasicInfo(Employee employee) {
//        String info = "name: " + employee.getName() + "\t";
//        info = info + "sex: " + (employee.getSex() == Employee.FEMALE? "Female":"Male") + "\t";
//        info = info + "salary: " + employee.getSalary() + "\t";
//        return info;
//    }
//
//    private String getManagerInfo(Manager manager) {
//        String basicInfo = this.getBasicInfo(manager);
//        String otherInfo = "performance: " + manager.getPerformance() + "\t";
//        return basicInfo + otherInfo;
//    }
//
//    private String getCommonEmployee(CommonEmployee commonEmployee) {
//        String basicInfo = this.getBasicInfo(commonEmployee);
//        String otherInfo = "Work: " + commonEmployee.getJob() + "\t";
//        return basicInfo + otherInfo;
//    }
}

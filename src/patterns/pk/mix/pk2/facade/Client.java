package patterns.pk.mix.pk2.facade;

import java.util.Date;

public class Client {
    public static void main(String[] args) {
        HRFacade facade = new HRFacade();
        System.out.println("===Outer System Query Total Income===");
        int salary = facade.querySalary("Sam", new Date(System.currentTimeMillis()));
        System.out.println("Sam  Nov  TotalIncome: " + salary);
        System.out.println("\n===outer system query attendance===");
        int workDays = facade.queryWorkDays("Smith");
        System.out.println("Smith  ThisMonth:" + workDays);
    }
}

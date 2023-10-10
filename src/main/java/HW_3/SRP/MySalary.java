package HW_3.SRP;

public class MySalary {
    private Employee employee;
    private int baseSalary;

    public MySalary(Employee employee, int baseSalary) {
        this.employee = employee;
        this.baseSalary = baseSalary;
    }

    public int calculateNetSalary() {
        int tax = (int) (baseSalary * 0.25); //calculate in otherway
        return baseSalary - tax;
    }
}

package chapter05;
public class SalaryManager {
    public static void main(String[] args) {
        SalaryManager manager = new SalaryManager();
        manager.printResultValue("작고 소중한 내 급여...", manager.getMonthlySalary(20000000));
    }
    public double getMonthlySalary(int yearlySalary) {
        double monthSalary = yearlySalary / 12.0;
        monthSalary -= calculateTax(monthSalary) + calculateNationalPension(monthSalary) + calculateHealthInsurance(monthSalary);
        return monthSalary;
    }
    public double calculateTax(double monthSalary) {
        printResultValue("calculateTax", monthSalary * 0.125);
        return monthSalary * 0.125;
    }
    public double calculateNationalPension(double monthSalary) {
        printResultValue("calculateNationalPension", monthSalary * 0.081);
        return monthSalary * 0.081;
    }
    public double calculateHealthInsurance(double monthSalary) {
        printResultValue("calculateHealthInsurance", monthSalary * 0.135);
        return monthSalary * 0.135;
    }
    public void printResultValue(String methodName, double result) {
        System.out.println(methodName + " : " + result);
    }
}

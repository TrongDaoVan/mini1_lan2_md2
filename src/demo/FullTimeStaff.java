package demo;

public class FullTimeStaff extends Staff {
    private int bonus ;
    private int fine ;
    private int hardSalary;

    public FullTimeStaff() {
    }

    public FullTimeStaff(int bonus, int fine, int hardSalary) {
        this.bonus = bonus;
        this.fine = fine;
        this.hardSalary = hardSalary;
    }

    public FullTimeStaff(String employeeCode, String name, int age, String phone, String email, int bonus, int fine, int hardSalary) {
        super(employeeCode, name, age, phone, email);
        this.bonus = bonus;
        this.fine = fine;
        this.hardSalary = hardSalary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getFine() {
        return fine;
    }

    public void setFine(int fine) {
        this.fine = fine;
    }

    public int getHardSalary() {
        return hardSalary;
    }

    public void setHardSalary(int hardSalary) {
        this.hardSalary = hardSalary;
    }

//    Lương
    public int employeeSalary() {
        return hardSalary + (bonus - fine);
    }
}

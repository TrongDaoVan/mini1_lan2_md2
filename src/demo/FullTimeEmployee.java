package demo;

public class FullTimeEmployee extends Employee{
    private int bonus;
    private int fines;
    private int salary;

    @Override
    public float getSumSalary() {
        float sum = bonus + salary - fines;
        return sum;
    }

    public FullTimeEmployee() {
    }

    public FullTimeEmployee(String id, String fullName, int age, String phone, String email, int bonus, int fines, int salary) {
        super(id, fullName, age, phone, email);
        this.bonus = bonus;
        this.fines = fines;
        this.salary = salary;
    }


    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getFines() {
        return fines;
    }

    public void setFines(int fines) {
        this.fines = fines;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "FullTimeEmployee{" +
                "bonus=" + bonus +
                ", fines=" + fines +
                ", salary=" + salary +
                '}';
    }
}

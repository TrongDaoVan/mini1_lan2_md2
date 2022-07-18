package demo;

public class PartTimeEmployee extends Employee {
    private float workTime;

    @Override
    public float getSumSalary() {
        return (workTime * 100000);
    }

    public PartTimeEmployee() {
    }

    public PartTimeEmployee(String id, String fullName, int age, String phone, String email, float workTime) {
        super(id, fullName, age, phone, email);
        this.workTime = workTime;
    }

    public float getWorkTime() {
        return workTime;
    }

    public void setWorkTime(float workTime) {
        this.workTime = workTime;
    }

    @Override
    public String toString() {
        return "PartTimeEmployee{" +
                "workTime=" + workTime +
                '}';
    }
}

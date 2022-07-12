package demo;

public class PartTimeStaff extends Staff {
    private int workTime ;

    public PartTimeStaff() {
    }

    public PartTimeStaff(String employeeCode, String name, int age, String phone, String email, int workTime) {
        super(employeeCode, name, age, phone, email);
        this.workTime = workTime;
    }

    public int getWorkTime() {
        return workTime;
    }

    public void setWorkTime(int workTime) {
        this.workTime = workTime;
    }

    public int luong() {
        return (workTime * 100000);
    }
}

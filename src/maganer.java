import demo.Employee;
import demo.FullTimeEmployee;
import demo.PartTimeEmployee;

import java.util.ArrayList;

public class maganer {

    private static ArrayList<Employee> employees = new ArrayList<>();

    public static void main(String[] args) {
        FullTimeEmployee full1 = new FullTimeEmployee("0001", "Đào Văn Trọng", 23, "0398299898", "trong98@gmail.com", 500000,100000,10000000);
        FullTimeEmployee full2 = new FullTimeEmployee("0002", "Bùi Thị Ngọc Mai", 23, "0398265895", "mai@gmail.com", 100000,400000,10000000);
        FullTimeEmployee full3 = new FullTimeEmployee("0003", "Vũ Tiến Hùng", 23, "0398294567", "hung@gmail.com", 150000,200000,10000000);
        PartTimeEmployee full4 = new PartTimeEmployee("0004", "Đinh Băng Băng", 23, "123456789", "bang98@gmail.com", 50);
        PartTimeEmployee full5 = new PartTimeEmployee("0005", "Bùi Thu Trang", 23, "123463254", "trang@gmail.com", 44);
        PartTimeEmployee full6 = new PartTimeEmployee("0006", "Nguyễn Thị Nhạn", 23, "123485641", "nhan98@gmail.com", 30);

        employees.add(full1);
        employees.add(full2);
        employees.add(full3);
        employees.add(full4);
        employees.add(full5);
        employees.add(full6);

//        Tính lương trung bình
        System.out.println(getAvegareSalary());

//        In ra lương nhân viên có tiền lương ít hơn tiền lương trung bình của công ty;
        System.out.println(getPartTimeUnderSalary());

//        In ra số lương phải trả cho nhân viên PartTime;
        System.out.println(sumSalaryPart());
    }


//    Tính lương trung bình

    public static float getAvegareSalary() {
        float sum1 = 0;
        for (Employee e: employees) {
              sum1 += e.getSumSalary();
        }
        float average = sum1/employees.size();
        return average;
    }

//    Lấy ra danh sách nhân viên có mức lương thấp hơn lương trung bình
    public static ArrayList<Employee> getPartTimeUnderSalary(){
        ArrayList<Employee> employees1 = new ArrayList<>();
        float average = getAvegareSalary();
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i) instanceof PartTimeEmployee &&
                    employees.get(i).getSumSalary() < average
            ) {
                employees1.add(employees.get(i));
            }
        } return employees1;
    }

//    Tính số lương phải trả cho nv PartTime
    public static float sumSalaryPart(){
        int sum2 = 0;
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i) instanceof PartTimeEmployee) {
                sum2 += employees.get(i).getSumSalary();
            }
        } return sum2;
    }

//    Sắp sếp số nv toàn thời gian theo thứ tự mức lưng tăng dần.
    public static ArrayList<Employee> salaryArrangement(ArrayList<Employee> arr) {
//        ArrayList<Employee> array = new ArrayList<>();
        Employee team = arr.get(0);
        for (int i = 0; i < arr.size()-1; i++) {
            for (int j=i+1; j<arr.size(); j++) {
                if (arr.get(i) instanceof FullTimeEmployee &&
                arr.get(j) instanceof FullTimeEmployee) {
                    if (arr.get(i).getSumSalary()>arr.get(j).getSumSalary()) {
                        team = arr.get(j);
//                        arr.get(j) = arr.get(i);
//                        arr.get(i) = team;

                    }
                }
            }
        } return arr;
    }

}

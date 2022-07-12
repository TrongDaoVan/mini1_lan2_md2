import demo.FullTimeStaff;
import demo.PartTimeStaff;
import demo.Staff;

public class main {
    public static void main(String[] args) {
        Staff[] staff = new Staff[6];
        staff[0] = new FullTimeStaff("abc1", "Đào Văn Trọng", 23, "0398299898", "trong@gmail.com", 500000, 1000000, 10000000);
        staff[1] = new FullTimeStaff("abc2", "Bùi Thị Ngọc Mai", 26, "0868955656", "mai@gmail.com", 500000, 200000, 9000000);
        staff[2] = new FullTimeStaff("abc3", "Hoàng Thị Tỉnh", 27, "0689756746", "tinh@gmail.com", 300000, 50000, 10000000);
        staff[3] = new PartTimeStaff("abc4", "Đinh Băng Băng", 20, "0348657858", "băng@gmail.com", 20);
        staff[4] = new PartTimeStaff("abc5", "Nguyễn Thị Nhạn", 23, "0348657455", "nhan@gmail.com", 22);
        staff[5] = new PartTimeStaff("abc6", "Bùi Huyền Minh", 24, "0348656985", "minh@gmail.com", 18);

//        Lương Fulltime
        int number1 = fullTimeSalary( (FullTimeStaff) staff[0]);
        System.out.println(number1);

//        Lương parttime
        int number2 = partTimeSalary( (PartTimeStaff) staff[3]);
        System.out.println(number2);

//        Trung bình
        int number3 = averageWage(staff);
        System.out.println(number3);


//        check lương nhân viên
        for (int i = 0; i < staff.length; i++) {
            compare(staff[i], number3);
        }

//        Tính tổng lương parttime
        int tong = totalSalaryPastTime(staff);
        System.out.println(tong);

    }






    public static int fullTimeSalary (FullTimeStaff staff) {
        int salary = 0;
        salary = staff.getHardSalary() + staff.getBonus() - staff.getFine();
        return salary;
    }

    public static int partTimeSalary(PartTimeStaff staff) {
        int salary = 0;
        int unitPrice = 100000;
        salary = staff.getWorkTime() * unitPrice;
        return salary;
    }

//    Lương trung bình của fulltime
    public static int averageWage (Staff[] staff ) {
        int count = 0;
        int sum = 0;
        for (int i = 0; i < staff.length; i++) {
            if (staff[i] instanceof FullTimeStaff) {
                sum += ((FullTimeStaff) staff[i]).employeeSalary();
                count++;
            }
        } return sum/count;
    }

//    Check tiền và hiện
    public static void compare (Staff staff, int average) {
        if (staff instanceof FullTimeStaff) {
            if(((FullTimeStaff)staff).employeeSalary() < average ) {
                System.out.println(((FullTimeStaff)staff).getName());
            }

        }
    }

//    Phương thức tích tổng lương parttime
    public static int totalSalaryPastTime(Staff[] staff) {
        int sum = 0;
        for (int i = 0; i < staff.length; i++) {
            if(staff[i] instanceof PartTimeStaff) {
                sum += ((PartTimeStaff)staff[i]).luong();
            }
        }
        return sum;
    }


}

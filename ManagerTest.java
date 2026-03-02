public class ManagerTest {

    public static void main(String[] args) {

        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Antonio", 2000000, 2015);
        staff[1] = new Manager("Maria", 2500000, 2012);
        staff[2] = new Employee("Isabel", 3000000, 2018);

        for (int i = 0; i < staff.length; i++) {
            staff[i].raiseSalary(5);
        }

        for (int i = 0; i < staff.length; i++) {
            staff[i].print();
        }
    }
}
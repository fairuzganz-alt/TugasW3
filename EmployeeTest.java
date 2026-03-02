public class EmployeeTest {

    public static void main(String[] args) {

        Employee e1 = new Employee("Andi", 5000000, 2015);
        Employee e2 = new Employee("Budi", 7000000, 2018);

        System.out.println("Hasil compare:");
        System.out.println(e1.compare(e2)); // -1
        System.out.println(e2.compare(e1)); // 1

        System.out.println();

        e1.raiseSalary(10);
        e1.print();
    }
}
class Employee extends Sortable {

    private String name;
    protected double salary;   
    private int hireYear;

    public Employee(String name, double salary, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.hireYear = hireYear;
    }

    public int hireYear() {
        return hireYear;
    }

    public void raiseSalary(double percent) {
        salary *= (1 + percent / 100);
    }

    public void print() {
        System.out.println(name + " | Salary: " + salary + " | Hire Year: " + hireYear);
    }

   
    @Override
    public int compare(Sortable b) {
        Employee other = (Employee) b;

        if (this.salary < other.salary) return -1;
        if (this.salary > other.salary) return 1;
        return 0;
    }
}
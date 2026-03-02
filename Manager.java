import java.util.Calendar;
import java.util.GregorianCalendar;

class Manager extends Employee {

    private String secretaryName;

    public Manager(String name, double salary, int hireYear) {
        super(name, salary, hireYear);
        secretaryName = "";
    }

    @Override
    public void raiseSalary(double percent) {

        GregorianCalendar today = new GregorianCalendar();
        int currentYear = today.get(Calendar.YEAR);

        double bonus = 0.5 * (currentYear - hireYear());

        super.raiseSalary(percent + bonus);
    }

    public String getSecretaryName() {
        return secretaryName;
    }
}
package homework9;

public abstract class Employee {

    protected String name;
    protected String surname;
    protected double salary; // Ставка заработной платы
    public int experience; // Опыт

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getSalary() {
        return salary;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public Employee(String name, String surname, int experience, double salary) {
        this.name = name;
        this.surname = surname;
        this.experience = experience; //опыт
        this.salary = salary;
    }

    /**
     * Расчет среднемесячной заработной платы
     * @return
     */
    public abstract double calculateSalary();

    // @Override
    // public int compareTo(Employee o) {
        // int res = surname.compareTo(o.surname);
        // if (res == 0)
            // return Double.compare(salary, o.salary);
        // else
            // return res;
    // }
}

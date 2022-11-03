public class Employee {
    private String firstName;
    private String middleName;
    private String lastName;
    private float salary;
    private int departement;
    private final int id;
    public static int idCounter = 0;

    public Employee(String firstName, String middleName, String lastName, float salary, int departement) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.salary = salary;
        this.departement = departement;
        this.id = idCounter;
        idCounter++;
    }

    public float getSalary() {
        return this.salary;
    }

    @Override
    public String toString() {
        return "id: " + this.id + " Отдел: " + this.departement + " Фамилия: " + this.lastName + " Имя: " + this.firstName + " Отчество" + this.middleName + " Зарплата: " + this.salary;
    }
}